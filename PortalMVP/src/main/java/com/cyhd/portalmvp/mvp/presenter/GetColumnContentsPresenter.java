package com.cyhd.portalmvp.mvp.presenter;

import android.text.TextUtils;

import com.cyhd.portalmvp.constant.PortalErr;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.bean.GetColumnContentsBean;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnContentsResult;
import com.cyhd.portalmvp.mvp.converterFactory.bean.ResultException;
import com.cyhd.portalmvp.mvp.model.GetColumnContentsModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetColumnContentsModel;
import com.cyhd.portalmvp.mvp.view.IGetColumnContentsView;
import com.cyhd.portalmvp.utilsErr.PortalErrUtil;
import com.lh.commonclasses.utils.LogUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.14portal_online_14：获取栏目信息接口
 */
public class GetColumnContentsPresenter extends BasePresenter<IGetColumnContentsView> implements BaseBeanResult.IGetColumnContentsResult {

    private String TAG = "GetColumnContentsPresenter";
    private IGetColumnContentsModel model;
    private long mStartGetColumnContentsTime = System.currentTimeMillis();

    public GetColumnContentsPresenter(IGetColumnContentsView view) {
        super(view);
        model = new GetColumnContentsModel();
    }

    public void requestData(GetColumnContentsBean getColumnContentsBean) {
        mStartGetColumnContentsTime = System.currentTimeMillis();
        model.getColumnContents(getColumnContentsBean, this);
    }

    @Override
    public void onNext(GetColumnContentsResult result) {
        //返回错误码
        LogUtil.d(TAG, "分类接口耗时=" + (System.currentTimeMillis() - mStartGetColumnContentsTime) + "ms");
        LogUtil.d(TAG, "最新栏目节目单获取成功");
        if (result != null && result.getData() != null
                && result.getData().getChildColumnList() != null
                && result.getData().getChildColumnList().size() > 0) {
            if (!TextUtils.isEmpty(result.getData().getChildColumnList().get(0).getOrderFlag())
                    && result.getData().getChildColumnList().get(0).getOrderFlag().equals("0")) {
                LogUtil.e(TAG, "显示Dialog信息ED1");
                //ED1
                PortalErrUtil.getInstance().setErrCode(PortalErr.STR_PRODUCT_WITHOUT_AUTH);
                view.showErrDialogGetColumnContents(PortalErr.STR_PRODUCT_WITHOUT_AUTH);
            } else {
                view.onSucceedGetColumnContents(result);
            }
        } else {
            LogUtil.e(TAG, "显示Dialog信息EB1");
            //Eb1
            PortalErrUtil.getInstance().setErrCode(PortalErr.PORTAL_ROOT_COLUMN);
            view.showErrDialogGetColumnContents(PortalErr.PORTAL_ROOT_COLUMN);
        }

    }

    @Override
    public void onError(Throwable e) {
        String errCode = "";

        if (e instanceof ResultException) {
            ResultException err = (ResultException) e;
            LogUtil.e(TAG, "ResultException=" + err.getReturnCode() + ((ResultException) e).getErrorMessage());
            errCode = err.getReturnCode();
        } else if (e instanceof TimeoutException
                || e instanceof ConnectException
                || e instanceof SocketTimeoutException) {
            LogUtil.e(TAG, "显示Dialog信息EB2");
            //	eb2
            errCode = PortalErr.STR_BOX_EPG_TIMEOUT_ERROR;
        } else {
            LogUtil.e(TAG, "显示Dialog信息EB3");
            //EB3
            errCode = PortalErr.PORTAL_SYSTEM;
        }
        PortalErrUtil.getInstance().setErrCode(errCode);
        view.showErrDialogGetColumnContents(errCode);
    }
}
