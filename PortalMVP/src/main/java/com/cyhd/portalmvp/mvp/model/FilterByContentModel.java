package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.FilterByContentBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IFilterByContentModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.39portal_online_39：用户节目筛选接口
 */
public class FilterByContentModel implements IFilterByContentModel {
    @Override
    public void filterByContent(FilterByContentBean filterByContentBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(filterByContentBean));

    }
}
