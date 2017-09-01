package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetColumnContentsBean;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnContentsResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetColumnContentsModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.lh.commonclasses.retrofit2rxjava.network.CustomSubscriber;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.retrofit2rxjava.network.RxRequest;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.commonclasses.utils.LogUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.14portal_online_14：获取栏目信息接口
 */
public class GetColumnContentsModel implements IGetColumnContentsModel {

    private String TAG = "GetColumnContentsModel";
    private CustomSubscriber mCustomSubscriber;
    private int requestTime = 1;

    @Override
    public void getColumnContents(final GetColumnContentsBean getColumnContentsBean, final BaseBeanResult baseBeanResult) {
        LogUtil.d(TAG, "" + getColumnContentsBean);
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getColumnContentsBean));

        RxManager.getInstance().cancel(RxConstant.GET_COLUMN_CONTENTS);
        mCustomSubscriber = new CustomSubscriber<GetColumnContentsResult>() {
            @Override
            public void onNext(GetColumnContentsResult getColumnContentsResult) {
                super.onNext(getColumnContentsResult);
                requestTime = 1;
                baseBeanResult.onNext(getColumnContentsResult);
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
                        getColumnContents(getColumnContentsBean, baseBeanResult);
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
        RxManager.getInstance().add(RxConstant.GET_COLUMN_CONTENTS, mCustomSubscriber);
        RxRequest.getInstance().request(ApiFactory.getPortalApiSwitch(requestTime).getColumnContents(json), mCustomSubscriber);
    }
}
