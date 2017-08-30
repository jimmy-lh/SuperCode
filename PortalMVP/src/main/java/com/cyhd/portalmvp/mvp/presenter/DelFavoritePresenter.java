package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.DelFavoriteResult;
import com.cyhd.portalmvp.mvp.view.IDelFavoriteView;

/**
 * 4.1.29portal_online_29：用户收藏信息删除
 */
public class DelFavoritePresenter extends BasePresenter<IDelFavoriteView> implements BaseBeanResult.IDelFavoriteResult {

    public DelFavoritePresenter(IDelFavoriteView view) {
        super(view);
    }

    @Override
    public void onNext(DelFavoriteResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
