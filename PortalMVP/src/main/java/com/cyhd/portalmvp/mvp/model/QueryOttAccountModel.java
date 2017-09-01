package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.QueryOttAccountBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IQueryOttAccountModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.11portal_online_11：用户信息获取接口
 */
public class QueryOttAccountModel implements IQueryOttAccountModel {
    @Override
    public void queryOttAccount(QueryOttAccountBean queryOttAccountBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(queryOttAccountBean));

    }
}
