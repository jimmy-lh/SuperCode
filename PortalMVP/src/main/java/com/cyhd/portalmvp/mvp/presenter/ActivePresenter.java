package com.cyhd.portalmvp.mvp.presenter;

import android.text.TextUtils;

import com.cyhd.portalmvp.constant.PortalErr;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.bean.ActiveBean;
import com.cyhd.portalmvp.mvp.beanResult.ActiveResult;
import com.lh.commonclasses.retrofit2rxjava.converterFactory.bean.ResultException;
import com.cyhd.portalmvp.mvp.model.ActiveModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IActiveModel;
import com.cyhd.portalmvp.mvp.view.IActiveView;
import com.lh.commonclasses.utils.LogUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.2portal_online_02：用户激活接口
 */
public class ActivePresenter extends BasePresenter<IActiveView> implements BaseBeanResult.IActiveResult {

    private String TAG = "ActivePresenter";
    private long start_auth_time = System.currentTimeMillis();
    private IActiveModel model;

    public ActivePresenter(IActiveView view) {
        super(view);
        model = new ActiveModel();
    }

    public void requestData(ActiveBean activeBean) {
        start_auth_time = System.currentTimeMillis();
        model.active(activeBean, this);
    }

    public void cancelRequest() {
        model.cancel();
    }

    @Override
    public void onNext(ActiveResult result) {
        //返回错误码变量
        String errCode;

        if (result != null) {
            if (result.getData() != null
                    && result.getData().getPortalCodeList() != null
                    && result.getData().getPortalCodeList().size() > 0
                    && !TextUtils.isEmpty(result.getData().getUserName())
                    && !TextUtils.isEmpty(result.getData().getUserToken())
                    && !TextUtils.isEmpty(result.getData().getPortalCodeList().get(0).getPortalCode())) {
                LogUtil.d(TAG, "激活成功");
                model.saveData(result);
                view.onSucceedActive();
            } else {
                LogUtil.d(TAG, "onActivationSuc 激活失败");
                if (!result.getReturnCode().equals("0")) {
                    errCode = result.getReturnCode();
                } else {
                    //ED2
                    errCode = PortalErr.NO_ASSOCIATED_PORTAL;
                }
                view.showErrDialogActive(errCode);
            }
        } else {
            errCode = PortalErr.PORTAL_SN;
            view.showErrDialogActive(errCode);
        }
    }

    @Override
    public void onError(Throwable e) {
        String errCode;

        LogUtil.d(TAG, "激活耗时：" + (System.currentTimeMillis() - start_auth_time) + "ms");
        if (e instanceof ResultException) {
            ResultException err = (ResultException) e;
            LogUtil.e(TAG, "ResultException=" + err.getReturnCode() + ((ResultException) e).getErrorMessage());
            errCode = err.getReturnCode();
        } else if (e instanceof TimeoutException
                || e instanceof ConnectException
                || e instanceof SocketTimeoutException) {
            //ea7超时
            errCode = PortalErr.STR_COLUMN_TIMEOUT;
        } else {
            //EA6
            errCode = PortalErr.PORTAL_SYSTEM;
        }
        view.showErrDialogActive(errCode);
        LogUtil.d(TAG, "激活失败");
    }
}
