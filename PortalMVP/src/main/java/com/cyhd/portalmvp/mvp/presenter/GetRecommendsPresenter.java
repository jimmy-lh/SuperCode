package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetRecommendsResult;
import com.cyhd.portalmvp.mvp.view.IGetRecommendsView;

/**
 * 4.1.35portal_online_35：获取推荐位信息
 */
public class GetRecommendsPresenter extends BasePresenter<IGetRecommendsView> implements BaseBeanResult.IGetRecommendsResult {

    public GetRecommendsPresenter(IGetRecommendsView view) {
        super(view);
    }

    @Override
    public void onNext(GetRecommendsResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
