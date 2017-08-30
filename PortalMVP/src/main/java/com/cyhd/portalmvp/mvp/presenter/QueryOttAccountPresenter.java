package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.QueryOttAccountResult;
import com.cyhd.portalmvp.mvp.view.IQueryOttAccountView;

/**
 * 4.1.11portal_online_11：用户信息获取接口
 */
public class QueryOttAccountPresenter extends BasePresenter<IQueryOttAccountView> implements BaseBeanResult.IQueryOttAccountResult {

    public QueryOttAccountPresenter(IQueryOttAccountView view) {
        super(view);
    }

    @Override
    public void onNext(QueryOttAccountResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
