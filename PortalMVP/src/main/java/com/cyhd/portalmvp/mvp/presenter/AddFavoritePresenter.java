package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.AddFavoriteResult;
import com.cyhd.portalmvp.mvp.view.IAddFavoriteView;

/**
 * 4.1.27portal_online_27：用户收藏信息新增
 */
public class AddFavoritePresenter extends BasePresenter<IAddFavoriteView> implements BaseBeanResult.IAddFavoriteResult {

    public AddFavoritePresenter(IAddFavoriteView view) {
        super(view);
    }

    @Override
    public void onNext(AddFavoriteResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
