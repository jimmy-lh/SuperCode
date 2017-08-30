package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.QueryLoveClickFlagResult;
import com.cyhd.portalmvp.mvp.view.IQueryLoveClickFlagView;

/**
 * 4.1.25portal_online_25：获取当前用户是否点赞接口
 */
public class QueryLoveClickFlagPresenter extends BasePresenter<IQueryLoveClickFlagView> implements BaseBeanResult.IQueryLoveClickFlagResult {

    public QueryLoveClickFlagPresenter(IQueryLoveClickFlagView view) {
        super(view);
    }

    @Override
    public void onNext(QueryLoveClickFlagResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
