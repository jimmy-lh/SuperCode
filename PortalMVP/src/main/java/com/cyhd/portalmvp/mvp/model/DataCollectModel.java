package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.constant.RxConstant;
import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.DataCollectBean;
import com.cyhd.portalmvp.mvp.beanResult.DataCollectResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IDataCollectModel;
import com.cyhd.portalmvp.mvp.network.ApiFactory;
import com.lh.commonclasses.retrofit2rxjava.network.CustomSubscriber;
import com.lh.commonclasses.retrofit2rxjava.network.RxManager;
import com.lh.commonclasses.retrofit2rxjava.network.RxRequest;
import com.lh.commonclasses.utils.SuperLog;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * 直播数据收集上报接口,不切换主备,请求失败访问2次
 */
public class DataCollectModel implements IDataCollectModel {

    private static final String TAG = "DataCollectModel";
    private CustomSubscriber<DataCollectResult> mCustomSubscriber;

    @Override
    public void dataCollect(final DataCollectBean apkPlayBean, final BaseBeanResult baseBeanResult) {
        SuperLog.d(TAG, "" + apkPlayBean);
        final RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), bean2Json(apkPlayBean));

        RxManager.getInstance().cancel(RxConstant.APK_PLAY);
        mCustomSubscriber = new CustomSubscriber<DataCollectResult>() {
            @Override
            public void onError(Throwable e) {
                baseBeanResult.onError(e);
            }

            @Override
            public void onNext(DataCollectResult apkPlayResult) {
                super.onNext(apkPlayResult);
                baseBeanResult.onNext(apkPlayResult);
            }
        };
        RxManager.getInstance().add(RxConstant.APK_PLAY, mCustomSubscriber);
        /**
         *访问出错,则再访问1次
         */
        RxRequest.getInstance().request(1, 1, ApiFactory.getDataCollectApi().dataCollect(requestBody), mCustomSubscriber);
    }

    private String bean2Json(DataCollectBean apkPlayBean) {
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("trans_id", apkPlayBean.getTrans_id());
            jsonObject.put("stream_mediacode", apkPlayBean.getStream_mediacode());
            jsonObject.put("server_ip", apkPlayBean.getServer_ip());
            jsonObject.put("action", apkPlayBean.getAction());
            jsonObject.put("caton_number", apkPlayBean.getCaton_number());
            jsonObject.put("play_url_time", apkPlayBean.getPlay_url_time());
            jsonObject.put("play_time", apkPlayBean.getPlay_time());
            jsonObject.put("user_sn", apkPlayBean.getUser_sn());
            jsonObject.put("apk_id", apkPlayBean.getApk_id());
            jsonObject.put("title", apkPlayBean.getTitle());
            SuperLog.d(TAG, "jsonObject = " + jsonObject.toString());
            return jsonObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "";
    }

}
