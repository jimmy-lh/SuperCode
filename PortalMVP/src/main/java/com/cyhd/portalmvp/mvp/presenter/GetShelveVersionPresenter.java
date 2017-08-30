package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveVersionResult;
import com.cyhd.portalmvp.mvp.view.IGetShelveVersionView;

/**
 * 4.1.16portal_online_16：获取栏目上架数据版本号信息
 */
public class GetShelveVersionPresenter extends BasePresenter<IGetShelveVersionView> implements BaseBeanResult.IGetShelveVersionResult {

    public GetShelveVersionPresenter(IGetShelveVersionView view) {
        super(view);
    }

    @Override
    public void onNext(GetShelveVersionResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
