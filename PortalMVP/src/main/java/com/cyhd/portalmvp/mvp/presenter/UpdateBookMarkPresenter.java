package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.UpdateBookMarkResult;
import com.cyhd.portalmvp.mvp.view.IUpdateBookMarkView;

/**
 * 4.1.32portal_online_32：用户书签信息修改
 */
public class UpdateBookMarkPresenter extends BasePresenter<IUpdateBookMarkView> implements BaseBeanResult.IUpdateBookMarkResult {

    public UpdateBookMarkPresenter(IUpdateBookMarkView view) {
        super(view);
    }

    @Override
    public void onNext(UpdateBookMarkResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
