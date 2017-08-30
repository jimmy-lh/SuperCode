package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.LoginResult;
import com.cyhd.portalmvp.mvp.view.ILoginView;

/**
 * 4.1.3portal_online_03：用户认证接口
 */
public class LoginPresenter extends BasePresenter<ILoginView> implements BaseBeanResult.ILoginResult {

    public LoginPresenter(ILoginView view) {
        super(view);
    }

    @Override
    public void onNext(LoginResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
