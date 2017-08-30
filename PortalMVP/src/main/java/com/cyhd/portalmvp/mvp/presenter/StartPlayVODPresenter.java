package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayVODResult;
import com.cyhd.portalmvp.mvp.view.IStartPlayVODView;

/**
 * 4.1.21portal_online_21：点播鉴权接口
 */
public class StartPlayVODPresenter extends BasePresenter<IStartPlayVODView> implements BaseBeanResult.IStartPlayVODResult {

    public StartPlayVODPresenter(IStartPlayVODView view) {
        super(view);
    }

    @Override
    public void onNext(StartPlayVODResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
