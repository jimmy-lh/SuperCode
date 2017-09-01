package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.PortalErr;
import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ActiveBean;
import com.cyhd.portalmvp.mvp.beanResult.ActiveResult;
import com.lh.commonclasses.retrofit2rxjava.converterFactory.bean.ResultException;
import com.cyhd.portalmvp.mvp.model.modelInterface.IActiveModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.lh.commonclasses.retrofit2rxjava.network.CustomSubscriber;
import com.lh.commonclasses.retrofit2rxjava.network.RxRequest;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.utils.DesUtil;
import com.cyhd.portalmvp.constant.SPConstant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.commonclasses.utils.LogUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.2portal_online_02：用户激活接口
 */
public class ActiveModel implements IActiveModel {

    private String TAG = "ActiveModel";

    private CustomSubscriber mCustomSubscriber;

    private int requestTime = 1;

    @Override
    public void active(final ActiveBean activeBean, final BaseBeanResult baseBeanResult) {
        LogUtil.d(TAG, activeBean.toString());
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(activeBean));

        cancel();
        mCustomSubscriber = new CustomSubscriber<ActiveResult>() {
            @Override
            public void onNext(ActiveResult activeResult) {
                super.onNext(activeResult);
                requestTime = 1;
                baseBeanResult.onNext(activeResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                e.printStackTrace();
                String errCode;
                if (e instanceof ResultException) {
                    ResultException err = (ResultException) e;
                    errCode=err.getReturnCode();
                    if(errCode.equals(PortalErr.NO_ASSOCIATED_PORTAL)
                            ||errCode.equals(PortalErr.PORTAL_PARAMETER_EXCEPTION)
                            ||errCode.equals(PortalErr.PORTAL_SYSTEM)
                            ||errCode.equals(PortalErr.PORTAL_DATABASE)
                            ||errCode.equals(PortalErr.SYSTEM_OVERLOAD_PROTECTION)){
                        if(requestTime == 1){
                            requestTime ++;
                            active(activeBean, baseBeanResult);
                        }else {
                            requestTime=1;
                            baseBeanResult.onError(e);
                        }
                    }else {
                        requestTime=1;
                        baseBeanResult.onError(e);
                    }
                }else if (e instanceof TimeoutException
                        || e instanceof ConnectException
                        || e instanceof SocketTimeoutException
                        ){
                    if(requestTime == 1){
                        requestTime ++;
                        active(activeBean, baseBeanResult);
                    }else {
                        requestTime=1;
                        baseBeanResult.onError(e);
                    }
                }else{
                    requestTime=1;
                    baseBeanResult.onError(e);
                }

            }
        };
        RxManager.getInstance().add(RxConstant.ACTIVE, mCustomSubscriber);
        //单次访问
        RxRequest.getInstance().request(ApiFactory.getPortalApiSwitch(requestTime).active(json), mCustomSubscriber);
    }

    @Override
    public void saveData(ActiveResult activeResult) {
        SPConstant.setUserToken(activeResult.getData().getUserToken());
        SPConstant.setUserName(activeResult.getData().getUserName());
        SPConstant.setPortalCode(activeResult.getData().getPortalCodeList().get(0).getPortalCode());
    }

    /**
     * 取消当前订阅
     */
    @Override
    public void cancel() {
        RxManager.getInstance().cancel(RxConstant.ACTIVE);
    }

}
