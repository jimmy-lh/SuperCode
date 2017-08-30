package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.AddBookMarkResult;
import com.cyhd.portalmvp.mvp.view.IAddBookMarkView;

/**
 * 4.1.31portal_online_31：用户书签信息新增
 */
public class AddBookMarkPresenter extends BasePresenter<IAddBookMarkView> implements BaseBeanResult.IAddBookMarkResult {

    public AddBookMarkPresenter(IAddBookMarkView view) {
        super(view);
    }

    @Override
    public void onNext(AddBookMarkResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
