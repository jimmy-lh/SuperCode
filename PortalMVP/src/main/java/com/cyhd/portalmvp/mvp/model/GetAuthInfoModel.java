package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetAuthInfoBean;
import com.cyhd.portalmvp.mvp.beanResult.ActiveResult;
import com.cyhd.portalmvp.mvp.beanResult.GetAuthInfoResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetAuthInfoModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.mvp.network.RxRequest;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.13portal_online_13：用户授权信息获取接口
 */
public class GetAuthInfoModel implements IGetAuthInfoModel {

    private String TAG = "GetAuthInfoModel";
    private CustomSubscriber mCustomSubscriber;
    private int requestTime = 1;

    @Override
    public void getAuthInfo(final GetAuthInfoBean getAuthInfoBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getAuthInfoBean));

        RxManager.getInstance().cancel(RxConstant.GET_AUTH_INFO);
        mCustomSubscriber = new CustomSubscriber<GetAuthInfoResult>() {
            @Override
            public void onNext(GetAuthInfoResult getAuthInfoResult) {
                super.onNext(getAuthInfoResult);
                requestTime = 1;
                baseBeanResult.onNext(getAuthInfoResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                e.printStackTrace();
                if (e instanceof TimeoutException
                        || e instanceof ConnectException
                        || e instanceof SocketTimeoutException) {
                    if (requestTime == 1) {
                        requestTime++;
                        getAuthInfo(getAuthInfoBean, baseBeanResult);
                    } else if (requestTime == 2) {
                        requestTime = 1;
                        baseBeanResult.onError(e);
                    }
                } else {
                    requestTime = 1;
                    baseBeanResult.onError(e);
                }
            }
        };
        RxManager.getInstance().add(RxConstant.GET_AUTH_INFO, mCustomSubscriber);
        //单次访问
        RxRequest.getInstance().request(ApiFactory.getPortalApiSwitch(requestTime).getAuthInfo(json), mCustomSubscriber);
    }
}
