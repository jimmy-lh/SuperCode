package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.bean.ExchangeBean;
import com.cyhd.portalmvp.mvp.beanResult.ExchangeResult;
import com.cyhd.portalmvp.mvp.model.ExchangeModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IExchangeModel;
import com.cyhd.portalmvp.mvp.view.IExchangeView;

/**
 * 4.1.7portal_online_07：兑换码兑换接口
 */
public class ExchangePresenter extends BasePresenter<IExchangeView> implements BaseBeanResult.IExchangeResult {

    private IExchangeModel model;

    public ExchangePresenter(IExchangeView view) {
        super(view);
        model = new ExchangeModel();
    }

    public void requestData(ExchangeBean exchangeBean) {
        model.exchange(exchangeBean, this);
    }

    @Override
    public void onNext(ExchangeResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
