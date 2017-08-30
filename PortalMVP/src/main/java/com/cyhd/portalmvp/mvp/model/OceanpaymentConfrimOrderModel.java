package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.OceanpaymentConfrimOrderBean;
import com.cyhd.portalmvp.mvp.beanResult.OceanpaymentConfrimOrderResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IOceanpaymentConfrimOrderModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.10portal_online_10：钱海确认接口
 */
public class OceanpaymentConfrimOrderModel implements IOceanpaymentConfrimOrderModel {
    @Override
    public void oceanpaymentConfrimOrder(OceanpaymentConfrimOrderBean oceanpaymentConfrimOrderBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(oceanpaymentConfrimOrderBean));

    }
}
