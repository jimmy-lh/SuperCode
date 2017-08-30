package com.cyhd.portalmvp.mvp.network.api;


import com.cyhd.portalmvp.mvp.beanResult.GetLivePlayUrlResult;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by fanjia on 2017/6/29.
 */
public interface LivePlayUrlApi {

    /**
     * http://ip:port/param
     *
     * @param param
     * @return
     */
    @GET
    Observable<GetLivePlayUrlResult> getLivePlayUrl(@Url String param);

//    @GET("{fullUrl}")
//    Observable<GetLivePlayUrlResult> getLivePlayUrl(@Path(value = "fullUrl", encoded = true) String param);

}
