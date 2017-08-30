package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.RegisterResult;
import com.cyhd.portalmvp.mvp.view.IRegisterView;

/**
 * 4.1.1portal_online_01：用户注册接口
 */
public class RegisterPresenter extends BasePresenter<IRegisterView> implements BaseBeanResult.IRegisterResult {

    public RegisterPresenter(IRegisterView view) {
        super(view);
    }

    @Override
    public void onNext(RegisterResult result) {


    }

    @Override
    public void onError(Throwable e) {

    }
}
