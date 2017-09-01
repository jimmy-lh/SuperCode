package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.beanResult.GetIPResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetIPModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.lh.commonclasses.retrofit2rxjava.network.CustomSubscriber;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.retrofit2rxjava.network.RxRequest;

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
