package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.OnlineOrderResult;
import com.cyhd.portalmvp.mvp.view.IOnlineOrderView;

/**
 * 4.1.8portal_online_08：在线订购接口
 */
public class OnlineOrderPresenter extends BasePresenter<IOnlineOrderView> implements BaseBeanResult.IOnlineOrderResult {

    public OnlineOrderPresenter(IOnlineOrderView view) {
        super(view);
    }

    @Override
    public void onNext(OnlineOrderResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
