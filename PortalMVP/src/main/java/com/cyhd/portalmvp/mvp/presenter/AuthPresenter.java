package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.AuthResult;
import com.cyhd.portalmvp.mvp.view.IAuthView;

/**
 * 4.1.6portal_online_06：用户鉴权接口
 */
public class AuthPresenter extends BasePresenter<IAuthView> implements BaseBeanResult.IAuthResult {

    public AuthPresenter(IAuthView view) {
        super(view);
    }

    @Override
    public void onNext(AuthResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
