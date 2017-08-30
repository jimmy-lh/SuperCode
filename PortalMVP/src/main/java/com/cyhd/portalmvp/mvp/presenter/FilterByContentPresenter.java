package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.FilterByContentResult;
import com.cyhd.portalmvp.mvp.view.IFilterByContentView;

/**
 * 4.1.39portal_online_39：用户节目筛选接口
 */
public class FilterByContentPresenter extends BasePresenter<IFilterByContentView> implements BaseBeanResult.IFilterByContentResult {

    public FilterByContentPresenter(IFilterByContentView view) {
        super(view);
    }

    @Override
    public void onNext(FilterByContentResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
