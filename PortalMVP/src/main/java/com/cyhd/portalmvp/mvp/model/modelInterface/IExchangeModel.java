package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ExchangeBean;

/**
 * 4.1.7portal_online_07：兑换码兑换接口
 */

public interface IExchangeModel {

    /**
     * 兑换码兑换接口
     *
     * @param exchangeBean
     * @param baseBeanResult
     */
    void exchange(ExchangeBean exchangeBean, BaseBeanResult baseBeanResult);

}
