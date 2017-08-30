package com.cyhd.portalmvp.mvp.network.api;

import com.cyhd.portalmvp.mvp.beanResult.DataCollectResult;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * apk上报接口
 */
public interface DataCollectApi {

    @Headers({"Content-type:application/json;charset=utf-8"})
    @POST("DataCollect/apk/play")
    Observable<DataCollectResult> dataCollect(@Body RequestBody requestBody);
}
