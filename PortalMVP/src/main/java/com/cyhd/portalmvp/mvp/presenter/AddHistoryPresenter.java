package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.AddHistoryResult;
import com.cyhd.portalmvp.mvp.view.IAddHistoryView;

/**
 * 4.1.34portal_online_34：用户播放历史信息记录
 */
public class AddHistoryPresenter extends BasePresenter<IAddHistoryView> implements BaseBeanResult.IAddHistoryResult {

    public AddHistoryPresenter(IAddHistoryView view) {
        super(view);
    }

    @Override
    public void onNext(AddHistoryResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
