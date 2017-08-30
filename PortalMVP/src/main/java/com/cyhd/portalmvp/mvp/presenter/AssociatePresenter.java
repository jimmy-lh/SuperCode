package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.AssociateResult;
import com.cyhd.portalmvp.mvp.view.IAssociateView;

/**
 * 4.1.41portal_online_41：获取关键字联想
 */
public class AssociatePresenter extends BasePresenter<IAssociateView> implements BaseBeanResult.IAssociateResult {

    public AssociatePresenter(IAssociateView view) {
        super(view);
    }

    @Override
    public void onNext(AssociateResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
