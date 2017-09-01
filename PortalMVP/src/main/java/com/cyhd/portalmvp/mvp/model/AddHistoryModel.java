package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AddHistoryBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IAddHistoryModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.34portal_online_34：用户播放历史信息记录
 */
public class AddHistoryModel implements IAddHistoryModel {
    @Override
    public void addHistory(AddHistoryBean addHistoryBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(addHistoryBean));

    }
}
