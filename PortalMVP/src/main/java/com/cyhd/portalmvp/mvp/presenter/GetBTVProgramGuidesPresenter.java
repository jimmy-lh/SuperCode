package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetBTVProgramGuidesResult;
import com.cyhd.portalmvp.mvp.view.IGetBTVProgramGuidesView;

/**
 * 4.1.18portal_online_18：获取频道回看节目单接口
 */
public class GetBTVProgramGuidesPresenter extends BasePresenter<IGetBTVProgramGuidesView> implements BaseBeanResult.IGetBTVProgramGuidesResult {

    public GetBTVProgramGuidesPresenter(IGetBTVProgramGuidesView view) {
        super(view);
    }

    @Override
    public void onNext(GetBTVProgramGuidesResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
