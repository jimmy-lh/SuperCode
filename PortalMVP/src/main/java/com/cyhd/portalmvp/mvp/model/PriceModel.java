package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.PriceBean;
import com.cyhd.portalmvp.mvp.beanResult.PriceResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IPriceModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.5portal_online_05：产品批价接口
 */
public class PriceModel implements IPriceModel {
    @Override
    public void price(PriceBean priceBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(priceBean));

    }
}
