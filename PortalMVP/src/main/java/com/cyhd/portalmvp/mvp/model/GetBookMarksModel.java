package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetBookMarksBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetBookMarksModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.30portal_online_30：获取用户书签信息列表
 */
public class GetBookMarksModel implements IGetBookMarksModel {
    @Override
    public void getBookMarks(GetBookMarksBean getBookMarksBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getBookMarksBean));

    }
}
