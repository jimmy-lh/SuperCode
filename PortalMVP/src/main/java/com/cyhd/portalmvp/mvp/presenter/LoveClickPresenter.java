package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.LoveClickResult;
import com.cyhd.portalmvp.mvp.view.ILoveClickView;

/**
 * 4.1.24portal_online_24：点赞/取消点赞接口
 */
public class LoveClickPresenter extends BasePresenter<ILoveClickView> implements BaseBeanResult.ILoveClickResult {

    public LoveClickPresenter(ILoveClickView view) {
        super(view);
    }

    @Override
    public void onNext(LoveClickResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
