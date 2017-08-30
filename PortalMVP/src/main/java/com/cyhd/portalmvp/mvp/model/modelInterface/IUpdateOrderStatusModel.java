package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.UpdateOrderStatusBean;

/**
 * 4.1.9portal_online_09：在线订购状态更新接口
 */
public interface IUpdateOrderStatusModel {

    /**
     * 在线订购状态更新接口
     *
     * @param updateOrderStatusBean
     * @param baseBeanResult
     */
    void updateOrderStatus(UpdateOrderStatusBean updateOrderStatusBean, BaseBeanResult baseBeanResult);
}
