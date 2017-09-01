package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.UpdateOrderStatusBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IUpdateOrderStatusModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.9portal_online_09：在线订购状态更新接口
 */
public class UpdateOrderStatusModel implements IUpdateOrderStatusModel {
    @Override
    public void updateOrderStatus(UpdateOrderStatusBean updateOrderStatusBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(updateOrderStatusBean));

    }
}
