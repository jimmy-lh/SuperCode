package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.StartPlayLiveBean;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayLiveResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IStartPlayLiveModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.22portal_online_22：直播鉴权接口
 */
public class StartPlayLiveModel implements IStartPlayLiveModel {
    @Override
    public void startPlayLive(StartPlayLiveBean startPlayLiveBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(startPlayLiveBean));

    }
}
