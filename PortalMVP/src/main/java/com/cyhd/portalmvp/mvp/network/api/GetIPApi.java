package com.cyhd.portalmvp.mvp.network.api;


import com.cyhd.portalmvp.mvp.beanResult.GetIPResult;

import retrofit2.http.GET;
import rx.Observable;

public interface GetIPApi {

    @GET("?format=json")
    Observable<GetIPResult> getIP();
}
