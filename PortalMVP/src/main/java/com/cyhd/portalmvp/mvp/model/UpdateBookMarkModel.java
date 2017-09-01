package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.UpdateBookMarkBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IUpdateBookMarkModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.32portal_online_32：用户书签信息修改
 */
public class UpdateBookMarkModel implements IUpdateBookMarkModel {
    @Override
    public void updateBookMark(UpdateBookMarkBean updateBookMarkBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(updateBookMarkBean));

    }
}
