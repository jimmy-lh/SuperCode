package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.OceanpaymentConfrimOrderBean;

/**
 * 4.1.10portal_online_10：钱海确认接口
 */
public interface IOceanpaymentConfrimOrderModel {

    /**
     * 钱海确认接口
     *
     * @param oceanpaymentConfrimOrderBean
     * @param baseBeanResult
     */
    void oceanpaymentConfrimOrder(OceanpaymentConfrimOrderBean oceanpaymentConfrimOrderBean, BaseBeanResult baseBeanResult);
}
