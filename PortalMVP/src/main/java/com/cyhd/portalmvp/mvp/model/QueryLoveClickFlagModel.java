package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.QueryLoveClickFlagBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IQueryLoveClickFlagModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.25portal_online_25：获取当前用户是否点赞接口
 */
public class QueryLoveClickFlagModel implements IQueryLoveClickFlagModel {
    @Override
    public void queryLoveClickFlag(QueryLoveClickFlagBean queryLoveClickFlagBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(queryLoveClickFlagBean));

    }
}
