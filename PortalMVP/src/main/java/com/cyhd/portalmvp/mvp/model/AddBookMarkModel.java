package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AddBookMarkBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IAddBookMarkModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.31portal_online_31：用户书签信息新增
 */
public class AddBookMarkModel implements IAddBookMarkModel {
    @Override
    public void addBookMark(AddBookMarkBean addBookMarkBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(addBookMarkBean));

    }
}
