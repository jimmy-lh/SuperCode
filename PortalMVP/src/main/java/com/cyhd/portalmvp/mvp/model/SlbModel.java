package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.ISlbModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.mvp.network.RxManager;
import com.cyhd.portalmvp.mvp.network.RxRequest;
import com.lh.commonclasses.utils.LogUtil;

/**
 * Created on 2017/7/19.
 */
public class SlbModel implements ISlbModel {

    private String TAG = "SlbModel";

    private CustomSubscriber mCustomSubscriber;

    private int requestTime = 1;

    @Override
    public void getSLB(final String user_id, final String type, final String trans_id,
                       final String app_id, final String lang, final BaseBeanResult baseBeanResult) {

        RxManager.getInstance().cancel(RxConstant.SLB);

        mCustomSubscriber = new CustomSubscriber<SlbBeanResult>() {
            @Override
            public void onError(Throwable e) {
                LogUtil.e(TAG, "请求glsb失败，" + requestTime);
                e.printStackTrace();
                super.onError(e);
                if (requestTime == 1) {
                    LogUtil.e(TAG, "请求glsb失败1，重试一次");
                    requestTime++;
                    getSLB(user_id, type, trans_id, app_id, lang, baseBeanResult);
                } else if (requestTime == 2) {
                    LogUtil.e(TAG, "请求glsb失败2，打印错误信息");
                    requestTime = 1;
                    baseBeanResult.onError(e);
                }
            }

            @Override
            public void onNext(SlbBeanResult slbBeanResult) {
                LogUtil.e(TAG, "请求glsb成功");
                super.onNext(slbBeanResult);
                LogUtil.d(TAG, "" + slbBeanResult);
                baseBeanResult.onNext(slbBeanResult);
            }

            @Override
            public void onCompleted() {

            }
        };

        RxManager.getInstance().add(RxConstant.SLB, mCustomSubscriber);
        RxRequest.getInstance().request(ApiFactory.getSlbApi(requestTime).getLiveSlb(user_id, type
                , trans_id, app_id, lang), mCustomSubscriber);
    }
}
