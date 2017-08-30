package com.cyhd.portalmvp.mvp.network.api;


import com.cyhd.portalmvp.mvp.beanResult.XmlEpgsResult;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * 获取xml格式的节目预告
 */
public interface XmlEpgApi {

    @GET
    Observable<XmlEpgsResult> getEpg(@Url String url);
}
