package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetShelveDataBean;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveDataResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetShelveDataModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.mvp.network.RxRequest;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

/**
 * 4.1.17portal_online_17：获取栏目上架数据接口
 */
public class GetShelveDataModel implements IGetShelveDataModel {

    private String TAG = "GetShelveDataModel";
    private CustomSubscriber mCustomSubscriber;
    private int requestTime = 1;
    private int requestTimeOnce = 1;

    @Override
    public void getShelveData(final GetShelveDataBean getShelveDataBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getShelveDataBean));

        //多次请求的，每次都不一样的，可以用id区分
        RxManager.getInstance().cancel("" + getShelveDataBean.getColumnId());
        mCustomSubscriber = new CustomSubscriber<GetShelveDataResult>() {
            @Override
            public void onNext(GetShelveDataResult getShelveDataResult) {
                super.onNext(getShelveDataResult);
                requestTime = 1;
                baseBeanResult.onNext(getShelveDataResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                e.printStackTrace();
                if (e instanceof TimeoutException
                        || e instanceof ConnectException
                        || e instanceof SocketTimeoutException) {
                    if (requestTime == 1) {
                        requestTime++;
                        getShelveData(getShelveDataBean, baseBeanResult);
                    } else if (requestTime == 2) {
                        requestTime = 1;
                        baseBeanResult.onError(e);
                    }
                } else {
                    requestTime = 1;
                    baseBeanResult.onError(e);
                }
            }
        };
        RxManager.getInstance().add("" + getShelveDataBean.getColumnId(), mCustomSubscriber);
        RxRequest.getInstance().request(30 * 60, ApiFactory.getPortalApiSwitch(requestTime).getShelveData(json), mCustomSubscriber);
    }

    @Override
    public void getShelveDataOnce(final GetShelveDataBean getShelveDataBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getShelveDataBean));

        RxManager.getInstance().cancel(RxConstant.GET_SHELVE_DATA_ONCE);
        mCustomSubscriber = new CustomSubscriber<GetShelveDataResult>() {
            @Override
            public void onNext(GetShelveDataResult getShelveDataResult) {
                super.onNext(getShelveDataResult);
                requestTimeOnce = 1;
                baseBeanResult.onNext(getShelveDataResult);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                e.printStackTrace();
                if (e instanceof TimeoutException
                        || e instanceof ConnectException
                        || e instanceof SocketTimeoutException) {
                    if (requestTimeOnce == 1) {
                        requestTimeOnce++;
                        getShelveData(getShelveDataBean, baseBeanResult);
                    } else if (requestTimeOnce == 2) {
                        requestTimeOnce = 1;
                        baseBeanResult.onError(e);
                    }
                } else {
                    requestTimeOnce = 1;
                    baseBeanResult.onError(e);
                }
            }
        };
        RxManager.getInstance().add(RxConstant.GET_SHELVE_DATA_ONCE, mCustomSubscriber);
        RxRequest.getInstance().request(ApiFactory.getPortalApiSwitch(requestTimeOnce).getShelveData(json), mCustomSubscriber);
    }
}
