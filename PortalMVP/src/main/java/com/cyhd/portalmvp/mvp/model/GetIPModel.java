package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.beanResult.GetIPResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetIPModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.mvp.network.RxRequest;

public class GetIPModel implements IGetIPModel {

    private String TAG = "GetIPModel";

    private CustomSubscriber mCustomSubscriber;

    @Override
    public void getIP(final BaseBeanResult baseBeanResult) {
        RxManager.getInstance().cancel(RxConstant.GET_IP);
        mCustomSubscriber = new CustomSubscriber<GetIPResult>() {
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                baseBeanResult.onError(e);
            }

            @Override
            public void onNext(GetIPResult getIPResult) {
                super.onNext(getIPResult);
                baseBeanResult.onNext(getIPResult);
            }
        };

        RxManager.getInstance().add(RxConstant.GET_IP, mCustomSubscriber);
        RxRequest.getInstance().request(ApiFactory.getGetIpApi().getIP(), mCustomSubscriber);
    }
}
