package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.constant.SPConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.HeartBeatBean;
import com.cyhd.portalmvp.mvp.beanResult.HeartBeatResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IHeartBeatModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.lh.commonclasses.retrofit2rxjava.network.CustomSubscriber;
import com.lh.commonclasses.retrofit2rxjava.network.RxRequest;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.commonclasses.utils.SuperLog;

/**
 * 4.1.4portal_online_04：用户心跳接口
 */
public class HeartBeatModel implements IHeartBeatModel {

    private String TAG = "HeartBeatModel";
    private CustomSubscriber mCustomSubscriber;

    @Override
    public void heartBeat(HeartBeatBean heartBeatBean, final BaseBeanResult baseBeanResult) {
        SuperLog.d(TAG, "" + heartBeatBean);
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(heartBeatBean));

        RxManager.getInstance().cancel(RxConstant.HEART_BEAT);
        mCustomSubscriber = new CustomSubscriber<HeartBeatResult>() {
            @Override
            public void onNext(HeartBeatResult heartBeatResult) {
                super.onNext(heartBeatResult);
                baseBeanResult.onNext(heartBeatResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                baseBeanResult.onError(e);
            }
        };
        RxManager.getInstance().add(RxConstant.HEART_BEAT, mCustomSubscriber);
        RxRequest.getInstance().request(30 * 60, 30 * 60, 10 * 60, ApiFactory.getPortalApi().heartBeat(json), mCustomSubscriber);
    }

    @Override
    public void saveData(HeartBeatResult heartBeatResult) {
        SPConstant.setUserToken(heartBeatResult.getData().getUserToken());
    }

}
