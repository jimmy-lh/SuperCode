package com.cyhd.portalmvp.mvp.presenter;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.base.BasePresenter;
import com.cyhd.portalmvp.mvp.beanResult.XmlEpgsResult;
import com.cyhd.portalmvp.mvp.model.XmlEpgModel;
import com.cyhd.portalmvp.mvp.model.modelInterface.IXmlEpgModel;
import com.cyhd.portalmvp.mvp.view.IXmlEpgView;

/**
 * Created on 2017/7/19.
 */
public class XmlEpgPresenter extends BasePresenter<IXmlEpgView> implements BaseBeanResult<XmlEpgsResult> {

    private String TAG = "XmlEpgPresenter";
    private IXmlEpgModel model;

    public XmlEpgPresenter(IXmlEpgView view) {
        super(view);
        model = new XmlEpgModel();
    }

    public void requestData(String epgUrl) {
        model.getXmlEpg(epgUrl, this);
    }

    @Override
    public void onNext(XmlEpgsResult result) {
        view.requestXmlEpgSuccess(result);
    }

    @Override
    public void onError(Throwable e) {
        view.requestXmlEpgError(e);
    }
}
