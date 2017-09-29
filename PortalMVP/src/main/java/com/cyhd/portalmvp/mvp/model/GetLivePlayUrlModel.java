package com.cyhd.portalmvp.mvp.model;

import android.text.TextUtils;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.constant.UrlConstant;
import com.cyhd.portalmvp.mvp.base.BasePlayBeanResult;
import com.cyhd.portalmvp.mvp.beanResult.GetLivePlayUrlResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetLivePlayUrlModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.lh.commonclasses.retrofit2rxjava.network.CustomSubscriber;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.retrofit2rxjava.network.RxRequest;
import com.lh.commonclasses.utils.SuperLog;

/**
 * Created on 2017/7/19.
 */
public class GetLivePlayUrlModel implements IGetLivePlayUrlModel {

    private String TAG = "LivePlayUrlModelImpl";
    private int requestTime = 1;
    private CustomSubscriber<GetLivePlayUrlResult> mCustomSubscriber;

    @Override
    public void getLivePlayUrl(final String slb_param, final String playCode, final BasePlayBeanResult baseBeanResult) {

        RxManager.getInstance().cancel(RxConstant.GET_LIVE_PLAY_URL);

        mCustomSubscriber = new CustomSubscriber<GetLivePlayUrlResult>() {
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                e.printStackTrace();
                SuperLog.i(TAG, "播放地址请求错误");
                if (requestTime == 1) {
                    requestTime++;
                    SuperLog.i(TAG, "播放地址请求换域名重试一次");
                    if (!TextUtils.isEmpty(UrlConstant.CACHE_SLB_HOST)) {
                        UrlConstant.NEW_SLB_HOST=UrlConstant.CACHE_SLB_HOST;
                        getLivePlayUrl(slb_param,playCode, baseBeanResult);
                    } else {
                        getLivePlayUrl(slb_param,playCode, baseBeanResult);
                    }
                } else if (requestTime == 2) {
                    requestTime=1;
                    baseBeanResult.onError(e,playCode);
                    SuperLog.i(TAG, "播放地址请求二次都失败");
                }

            }

            @Override
            public void onNext(GetLivePlayUrlResult getLivePlayUrlResult) {
                super.onNext(getLivePlayUrlResult);
                baseBeanResult.onNext(getLivePlayUrlResult,playCode);
            }
        };
        RxManager.getInstance().add(RxConstant.GET_LIVE_PLAY_URL, mCustomSubscriber);
        RxRequest.getInstance().request(ApiFactory.getLivePlayUrlApi().getLivePlayUrl(slb_param), mCustomSubscriber);
    }
}
