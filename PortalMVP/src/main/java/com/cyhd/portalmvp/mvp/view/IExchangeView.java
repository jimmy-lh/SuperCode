package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.ExchangeResult;
import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;

/**
 * 4.1.7portal_online_07：兑换码兑换接口
 */
public interface IExchangeView {
    void  requestExChangeSuccess(ExchangeResult exchangeResult);
    void  requestExChangeError(Throwable e);
}
