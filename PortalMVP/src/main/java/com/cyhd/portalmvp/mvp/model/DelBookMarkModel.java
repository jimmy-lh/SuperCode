package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.DelBookMarkBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IDelBookMarkModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.33portal_online_33：用户书签信息删除
 */
public class DelBookMarkModel implements IDelBookMarkModel {
    @Override
    public void delBookMark(DelBookMarkBean delBookMarkBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(delBookMarkBean));

    }
}
