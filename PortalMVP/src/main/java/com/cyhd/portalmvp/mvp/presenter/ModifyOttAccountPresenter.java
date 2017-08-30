package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.ModifyOttAccountResult;
import com.cyhd.portalmvp.mvp.view.IModifyOttAccountView;

/**
 * 4.1.12portal_online_12：用户信息修改接口
 */
public class ModifyOttAccountPresenter extends BasePresenter<IModifyOttAccountView> implements BaseBeanResult.IModifyOttAccountResult {

    public ModifyOttAccountPresenter(IModifyOttAccountView view) {
        super(view);
    }

    @Override
    public void onNext(ModifyOttAccountResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
