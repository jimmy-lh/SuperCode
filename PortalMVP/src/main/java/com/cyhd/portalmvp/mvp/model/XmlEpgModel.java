package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.beanResult.XmlEpgsResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IXmlEpgModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.mvp.network.RxRequest;
import com.lh.commonclasses.utils.LogUtil;

public class XmlEpgModel implements IXmlEpgModel {
    private String TAG = "XmlEpgModel";

    private CustomSubscriber mCustomSubscriber;

    @Override
    public void getXmlEpg(String epgUrl, final BaseBeanResult baseBeanResult) {
        LogUtil.d(TAG, epgUrl.toString());

        RxManager.getInstance().cancel(RxConstant.XML_EPG);
        mCustomSubscriber = new CustomSubscriber<XmlEpgsResult>() {
            @Override
            public void onNext(XmlEpgsResult xmlEpgsResult) {
                super.onNext(xmlEpgsResult);
                LogUtil.d(TAG, "" + xmlEpgsResult);
                baseBeanResult.onNext(xmlEpgsResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                LogUtil.d(TAG, e.toString());
                baseBeanResult.onError(e);
            }
        };
        RxManager.getInstance().add(RxConstant.XML_EPG, mCustomSubscriber);
        //不管成功与否，都是每两个小时访问一次
        RxRequest.getInstance().request(0, 2 * 60 * 60, 2 * 60 * 60, ApiFactory.getXmlEpgApi().getEpg(epgUrl), mCustomSubscriber);
    }
}
