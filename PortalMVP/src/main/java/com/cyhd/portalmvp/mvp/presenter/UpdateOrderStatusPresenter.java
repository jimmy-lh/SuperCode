package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.UpdateOrderStatusResult;
import com.cyhd.portalmvp.mvp.view.IUpdateOrderStatusView;

/**
 * 4.1.9portal_online_09：在线订购状态更新接口
 */
public class UpdateOrderStatusPresenter extends BasePresenter<IUpdateOrderStatusView> implements BaseBeanResult.IUpdateOrderStatusResult {

    public UpdateOrderStatusPresenter(IUpdateOrderStatusView view) {
        super(view);
    }

    @Override
    public void onNext(UpdateOrderStatusResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
