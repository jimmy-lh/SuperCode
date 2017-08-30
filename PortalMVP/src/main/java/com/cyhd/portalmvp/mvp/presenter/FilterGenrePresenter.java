package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.FilterGenreResult;
import com.cyhd.portalmvp.mvp.view.IFilterGenreView;

/**
 * 4.1.40portal_online_40：获取用户节目筛选类型接口
 */
public class FilterGenrePresenter extends BasePresenter<IFilterGenreView> implements BaseBeanResult.IFilterGenreResult {

    public FilterGenrePresenter(IFilterGenreView view) {
        super(view);
    }

    @Override
    public void onNext(FilterGenreResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
