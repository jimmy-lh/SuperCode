package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetTodayProgramResult;
import com.cyhd.portalmvp.mvp.view.IGetTodayProgramView;

/**
 * 4.1.42portal_online_42：获取全部上架频道当天节目单
 */
public class GetTodayProgramPresenter extends BasePresenter<IGetTodayProgramView> implements BaseBeanResult.IGetTodayProgramResult {

    public GetTodayProgramPresenter(IGetTodayProgramView view) {
        super(view);
    }

    @Override
    public void onNext(GetTodayProgramResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
