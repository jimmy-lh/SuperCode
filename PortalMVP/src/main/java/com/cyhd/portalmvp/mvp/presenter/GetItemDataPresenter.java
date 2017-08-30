package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetItemDataResult;
import com.cyhd.portalmvp.mvp.view.IGetItemDataView;

/**
 * 4.1.20portal_online_20：获取剧集/节目详情接口
 */
public class GetItemDataPresenter extends BasePresenter<IGetItemDataView> implements BaseBeanResult.IGetItemDataResult {

    public GetItemDataPresenter(IGetItemDataView view) {
        super(view);
    }

    @Override
    public void onNext(GetItemDataResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
