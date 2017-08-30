package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.constant.PortalErr;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.bean.GetShelveDataBean;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveDataResult;
import com.cyhd.portalmvp.mvp.converterFactory.bean.ResultException;
import com.cyhd.portalmvp.mvp.model.GetShelveDataModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetShelveDataModel;
import com.cyhd.portalmvp.mvp.view.IGetShelveDataView;
import com.cyhd.portalmvp.utilsErr.PortalErrUtil;
import com.lh.commonclasses.utils.LogUtil;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.17portal_online_17：获取栏目上架数据接口
 */
public class GetShelveDataPresenter extends BasePresenter<IGetShelveDataView> implements BaseBeanResult.IGetShelveDataResult {

    private String TAG = "GetShelveDataPresenter";
    private IGetShelveDataModel model;
    private long start_epg_time = System.currentTimeMillis();

    public GetShelveDataPresenter(IGetShelveDataView view) {
        super(view);
        model = new GetShelveDataModel();
    }

    /**
     * 获取栏目上架数据接口,每隔30分钟访问一次，出错则更换主备再访问
     */
    public void requestData(GetShelveDataBean getShelveDataBean) {
        start_epg_time = System.currentTimeMillis();
        model.getShelveData(getShelveDataBean, this);
    }

    /**
     * 获取一次栏目上架数据接口，出错则更换主备再访问
     */
    public void requestDataOnce(GetShelveDataBean getShelveDataBean) {
        model.getShelveDataOnce(getShelveDataBean, this);
    }

    @Override
    public void onNext(GetShelveDataResult result) {
        if (result != null
                && result.getData() != null
                && result.getData().getChannelList() != null
                && result.getData().getChannelList().size() > 0) {
            view.onSucceedGetShelveData(result);
        } else {
            PortalErrUtil.getInstance().setErrCode(PortalErr.PORTAL_CUR_COLUMN);
            view.onFailGetShelveData(PortalErr.PORTAL_CUR_COLUMN);
        }
    }

    @Override
    public void onError(Throwable e) {
        String errCode = "";

        if (e instanceof ResultException) {
            ResultException err = (ResultException) e;
            LogUtil.e(TAG,"ResultException="+err.getReturnCode()+((ResultException) e).getErrorMessage());
            errCode=err.getReturnCode();
        }else if (e instanceof TimeoutException
                || e instanceof ConnectException
                || e instanceof SocketTimeoutException) {
            //	eb2
            errCode= PortalErr.STR_BOX_EPG_TIMEOUT_ERROR;
        }else{
            //EB3
            errCode=PortalErr.PORTAL_SYSTEM;
        }
        PortalErrUtil.getInstance().setErrCode(errCode);
        view.onFailGetShelveData(errCode);
    }
}
