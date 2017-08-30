package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.DelBookMarkResult;
import com.cyhd.portalmvp.mvp.view.IDelBookMarkView;

/**
 * 4.1.33portal_online_33：用户书签信息删除
 */
public class DelBookMarkPresenter extends BasePresenter<IDelBookMarkView> implements BaseBeanResult.IDelBookMarkResult {

    public DelBookMarkPresenter(IDelBookMarkView view) {
        super(view);
    }

    @Override
    public void onNext(DelBookMarkResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
