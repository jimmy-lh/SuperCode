package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.StartPlayVODBean;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayVODResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IStartPlayVODModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.21portal_online_21：点播鉴权接口
 */
public class StartPlayVODModel implements IStartPlayVODModel {
    @Override
    public void startPlayVOD(StartPlayVODBean startPlayVODBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(startPlayVODBean));
    }
}
