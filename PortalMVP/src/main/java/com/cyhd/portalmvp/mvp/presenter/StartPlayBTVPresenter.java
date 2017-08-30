package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayBTVResult;
import com.cyhd.portalmvp.mvp.view.IStartPlayBTVView;

/**
 * 4.1.23portal_online_23：回看鉴权接口
 */
public class StartPlayBTVPresenter extends BasePresenter<IStartPlayBTVView> implements BaseBeanResult.IStartPlayBTVResult {

    public StartPlayBTVPresenter(IStartPlayBTVView view) {
        super(view);
    }

    @Override
    public void onNext(StartPlayBTVResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
