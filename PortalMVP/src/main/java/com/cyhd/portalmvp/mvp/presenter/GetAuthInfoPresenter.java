package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.bean.GetAuthInfoBean;
import com.cyhd.portalmvp.mvp.beanResult.GetAuthInfoResult;
import com.cyhd.portalmvp.mvp.model.GetAuthInfoModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetAuthInfoModel;
import com.cyhd.portalmvp.mvp.view.IGetAuthInfoView;

/**
 * 4.1.13portal_online_13：用户授权信息获取接口
 */
public class GetAuthInfoPresenter extends BasePresenter<IGetAuthInfoView> implements BaseBeanResult.IGetAuthInfoResult {

    private IGetAuthInfoModel model;

    public GetAuthInfoPresenter(IGetAuthInfoView view) {
        super(view);
        model = new GetAuthInfoModel();
    }

    public void requestData(GetAuthInfoBean getAuthInfoBean) {
        model.getAuthInfo(getAuthInfoBean, this);
    }

    @Override
    public void onNext(GetAuthInfoResult result) {
        view.onSucceedGetAuthInfo(result);
    }

    @Override
    public void onError(Throwable e) {

    }
}
