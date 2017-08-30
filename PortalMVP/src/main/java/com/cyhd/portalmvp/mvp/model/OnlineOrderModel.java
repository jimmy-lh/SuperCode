package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.OnlineOrderBean;
import com.cyhd.portalmvp.mvp.beanResult.OnlineOrderResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IOnlineOrderModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.8portal_online_08：在线订购接口
 */
public class OnlineOrderModel implements IOnlineOrderModel {
    @Override
    public void onlineOrder(OnlineOrderBean onlineOrderBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(onlineOrderBean));

    }
}
