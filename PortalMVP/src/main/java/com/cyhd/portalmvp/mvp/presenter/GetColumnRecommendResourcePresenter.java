package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnRecommendResourceResult;
import com.cyhd.portalmvp.mvp.view.IGetColumnRecommendResourceView;

/**
 * 4.1.19portal_online_19：获取栏目推荐信息接口
 */
public class GetColumnRecommendResourcePresenter extends BasePresenter<IGetColumnRecommendResourceView> implements BaseBeanResult.IGetColumnRecommendResourceResult {

    public GetColumnRecommendResourcePresenter(IGetColumnRecommendResourceView view) {
        super(view);
    }

    @Override
    public void onNext(GetColumnRecommendResourceResult result) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
