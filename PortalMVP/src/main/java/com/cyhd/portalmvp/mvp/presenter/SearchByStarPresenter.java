package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.SearchByStarResult;
import com.cyhd.portalmvp.mvp.view.ISearchByStarView;

/**
 * 4.1.37portal_online_37：导演OR演员搜索接口
 */
public class SearchByStarPresenter extends BasePresenter<ISearchByStarView> implements BaseBeanResult.ISearchByStarResult {

    public SearchByStarPresenter(ISearchByStarView view) {
        super(view);
    }

    @Override
    public void onNext(SearchByStarResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
