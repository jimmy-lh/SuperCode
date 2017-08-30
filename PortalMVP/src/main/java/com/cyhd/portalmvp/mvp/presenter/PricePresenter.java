package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.PriceResult;
import com.cyhd.portalmvp.mvp.view.IPriceView;

/**
 * 4.1.5portal_online_05：产品批价接口
 */
public class PricePresenter extends BasePresenter<IPriceView> implements BaseBeanResult.IPriceResult {

    public PricePresenter(IPriceView view) {
        super(view);
    }

    @Override
    public void onNext(PriceResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
