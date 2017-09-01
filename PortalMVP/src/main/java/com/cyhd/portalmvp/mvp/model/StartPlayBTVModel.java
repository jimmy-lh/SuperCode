package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.StartPlayBTVBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IStartPlayBTVModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.23portal_online_23：回看鉴权接口
 */
public class StartPlayBTVModel implements IStartPlayBTVModel {
    @Override
    public void startPlayBTV(StartPlayBTVBean startPlayBTVBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(startPlayBTVBean));

    }
}
