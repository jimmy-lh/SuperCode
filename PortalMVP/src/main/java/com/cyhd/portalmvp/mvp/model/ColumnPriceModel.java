package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ColumnPriceBean;
import com.cyhd.portalmvp.mvp.beanResult.ColumnPriceResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IColumnPriceModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.15portal_online_15：栏目批价接口
 */
public class ColumnPriceModel implements IColumnPriceModel {
    @Override
    public void columnPrice(ColumnPriceBean columnPriceBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(columnPriceBean));
    }
}
