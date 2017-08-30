package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetFavoritesResult;
import com.cyhd.portalmvp.mvp.view.IGetFavoritesView;

/**
 * 4.1.26portal_online_26：获取用户收藏列表
 */
public class GetFavoritesPresenter extends BasePresenter<IGetFavoritesView> implements BaseBeanResult.IGetFavoritesResult {

    public GetFavoritesPresenter(IGetFavoritesView view) {
        super(view);
    }

    @Override
    public void onNext(GetFavoritesResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
