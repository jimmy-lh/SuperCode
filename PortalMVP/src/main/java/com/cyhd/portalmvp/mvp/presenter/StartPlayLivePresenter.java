package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.StartPlayLiveResult;
import com.cyhd.portalmvp.mvp.view.IStartPlayLiveView;

/**
 * 4.1.22portal_online_22：直播鉴权接口
 */
public class StartPlayLivePresenter extends BasePresenter<IStartPlayLiveView> implements BaseBeanResult.IStartPlayLiveResult {

    public StartPlayLivePresenter(IStartPlayLiveView view) {
        super(view);
    }

    @Override
    public void onNext(StartPlayLiveResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
