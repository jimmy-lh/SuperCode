package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.ColumnPriceResult;
import com.cyhd.portalmvp.mvp.view.IColumnPriceView;

/**
 * 4.1.15portal_online_15：栏目批价接口
 */
public class ColumnPricePresenter extends BasePresenter<IColumnPriceView> implements BaseBeanResult.IColumnPriceResult {

    public ColumnPricePresenter(IColumnPriceView view) {
        super(view);
    }

    @Override
    public void onNext(ColumnPriceResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
