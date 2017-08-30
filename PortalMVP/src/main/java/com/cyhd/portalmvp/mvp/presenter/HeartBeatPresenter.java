package com.cyhd.portalmvp.mvp.presenter;

import android.text.TextUtils;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.HeartBeatBean;
import com.cyhd.portalmvp.mvp.beanResult.HeartBeatResult;
import com.cyhd.portalmvp.mvp.model.HeartBeatModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IHeartBeatModel;
import com.lh.commonclasses.utils.MacAddrUtil;
import com.cyhd.portalmvp.constant.SPConstant;

/**
 * 4.1.4portal_online_04：用户心跳接口
 * 不需要显示的接口，参考此接口写
 */
public class HeartBeatPresenter implements BaseBeanResult.IHeartBeatResult {

    private IHeartBeatModel model;

    public HeartBeatPresenter() {
        model = new HeartBeatModel();
    }

    public void requestData() {
        String userToken = SPConstant.getUserToken();
        String userName = SPConstant.getUserName();
        if (userToken != null && userName != null) {
            model.heartBeat(new HeartBeatBean(userToken, userName, MacAddrUtil.getWiredMac()), this);
        }
    }

    @Override
    public void onNext(HeartBeatResult result) {
        if (result != null && result.getData() != null
                && !TextUtils.isEmpty(result.getData().getUserToken())) {
            model.saveData(result);
        }
    }

    @Override
    public void onError(Throwable e) {

    }
}
