package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.SearchByNameResult;
import com.cyhd.portalmvp.mvp.view.ISearchByNameView;

/**
 * 4.1.36portal_online_36：影片名称搜索接口
 */
public class SearchByNamePresenter extends BasePresenter<ISearchByNameView> implements BaseBeanResult.ISearchByNameResult {

    public SearchByNamePresenter(ISearchByNameView view) {
        super(view);
    }

    @Override
    public void onNext(SearchByNameResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
