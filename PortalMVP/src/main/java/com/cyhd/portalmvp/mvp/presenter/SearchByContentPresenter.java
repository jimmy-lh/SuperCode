package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.SearchByContentResult;
import com.cyhd.portalmvp.mvp.view.ISearchByContentView;

/**
 * 4.1.38portal_online_38：相似影片搜索接口
 */
public class SearchByContentPresenter extends BasePresenter<ISearchByContentView> implements BaseBeanResult.ISearchByContentResult {

    public SearchByContentPresenter(ISearchByContentView view) {
        super(view);
    }

    @Override
    public void onNext(SearchByContentResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
