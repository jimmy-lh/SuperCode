package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ExchangeBean;
import com.cyhd.portalmvp.mvp.beanResult.ExchangeResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IExchangeModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.mvp.network.RxRequest;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.commonclasses.utils.LogUtil;

/**
 * 4.1.7portal_online_07：兑换码兑换接口
 */
public class ExchangeModel implements IExchangeModel {

    private String TAG = "ExchangeModel";

    private CustomSubscriber mCustomSubscriber;

    @Override
    public void exchange(ExchangeBean exchangeBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(exchangeBean));

        RxManager.getInstance().cancel(RxConstant.EXCHANGE);
        mCustomSubscriber = new CustomSubscriber<ExchangeResult>() {
            @Override
            public void onNext(ExchangeResult exchangeResult) {
                super.onNext(exchangeResult);
                baseBeanResult.onNext(exchangeResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                LogUtil.d(TAG, e.toString());
                baseBeanResult.onError(e);
            }
        };
        RxManager.getInstance().add(RxConstant.EXCHANGE, mCustomSubscriber);
        //单次访问
        RxRequest.getInstance().request(ApiFactory.getPortalApi().exchange(json), mCustomSubscriber);
    }
}
