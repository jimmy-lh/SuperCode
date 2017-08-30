package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetIPResult;
import com.cyhd.portalmvp.mvp.model.GetIPModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetIPModel;
import com.cyhd.portalmvp.mvp.view.IGetIPView;

/**
 * Created on 2017/7/19.
 */
public class GetIPPresenter extends BasePresenter<IGetIPView> implements BaseBeanResult.IGetIPResult {

    private IGetIPModel model;

    public GetIPPresenter(IGetIPView view) {
        super(view);
        model = new GetIPModel();
    }

    public void request() {
        model.getIP(this);
    }

    @Override
    public void onNext(GetIPResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
