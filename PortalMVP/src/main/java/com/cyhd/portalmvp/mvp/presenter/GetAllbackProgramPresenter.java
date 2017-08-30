package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetAllbackProgramResult;
import com.cyhd.portalmvp.mvp.view.IGetAllbackProgramView;

/**
 * 4.1.43portal_online_43：获取全部上架频道7天回看节目单
 */
public class GetAllbackProgramPresenter extends BasePresenter<IGetAllbackProgramView> implements BaseBeanResult.IGetAllbackProgramResult {

    public GetAllbackProgramPresenter(IGetAllbackProgramView view) {
        super(view);
    }

    @Override
    public void onNext(GetAllbackProgramResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
