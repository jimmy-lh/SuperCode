package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.OceanpaymentConfrimOrderResult;
import com.cyhd.portalmvp.mvp.view.IOceanpaymentConfrimOrderView;

/**
 * 4.1.10portal_online_10：钱海确认接口
 */
public class OceanpaymentConfrimOrderPresenter extends BasePresenter<IOceanpaymentConfrimOrderView> implements BaseBeanResult.IOceanpaymentConfrimOrderResult {

    public OceanpaymentConfrimOrderPresenter(IOceanpaymentConfrimOrderView view) {
        super(view);
    }

    @Override
    public void onNext(OceanpaymentConfrimOrderResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
