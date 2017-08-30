package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetBookMarksResult;
import com.cyhd.portalmvp.mvp.view.IGetBookMarksView;

/**
 * 4.1.30portal_online_30：获取用户书签信息列表
 */
public class GetBookMarksPresenter extends BasePresenter<IGetBookMarksView> implements BaseBeanResult.IGetBookMarksResult {

    public GetBookMarksPresenter(IGetBookMarksView view) {
        super(view);
    }

    @Override
    public void onNext(GetBookMarksResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
