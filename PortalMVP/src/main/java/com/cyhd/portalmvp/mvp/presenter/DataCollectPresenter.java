package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.bean.DataCollectBean;
import com.cyhd.portalmvp.mvp.beanResult.DataCollectResult;
import com.cyhd.portalmvp.mvp.model.DataCollectModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IDataCollectModel;
import com.cyhd.portalmvp.mvp.view.IDataCollectView;

/**
 * Created on 2017/7/19.
 * 直播数据收集
 */
public class DataCollectPresenter extends BasePresenter<IDataCollectView> implements BaseBeanResult.IApkPlayResult {

    private IDataCollectModel model;

    public DataCollectPresenter(IDataCollectView view) {
        super(view);
        model = new DataCollectModel();
    }

    public void requestData(DataCollectBean apkPlayBean) {
        model.dataCollect(apkPlayBean, this);
    }

    @Override
    public void onNext(DataCollectResult result) {
        view.onDataCollectSuc(result);

    }

    @Override
    public void onError(Throwable e) {
        view.onDataCollectFail(e);
    }
}
