package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.UpdateFavoriteResult;
import com.cyhd.portalmvp.mvp.view.IUpdateFavoriteView;

/**
 * 4.1.28portal_online_28：用户收藏信息修改
 */
public class UpdateFavoritePresenter extends BasePresenter<IUpdateFavoriteView> implements BaseBeanResult.IUpdateFavoriteResult {

    public UpdateFavoritePresenter(IUpdateFavoriteView view) {
        super(view);
    }

    @Override
    public void onNext(UpdateFavoriteResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
