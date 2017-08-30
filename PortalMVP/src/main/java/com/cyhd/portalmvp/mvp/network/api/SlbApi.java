package com.cyhd.portalmvp.mvp.network.api;

import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by fanjia on 2017/7/1.
 */

public interface SlbApi {
    /**
     * 获取slb地址
     * http://ip:port/gslb/live?user_id= xxxxxxxx-xxxx&class=live&trans_id=xxxxxx
     *
     * @param user_id  盒子SN号
     * @param class1   直播类或者点播类
     * @param trans_id 事务UUID
     * @return
     */

    @GET("/gslb/live")
    Observable<SlbBeanResult> getLiveSlb(@Query("user_id") String user_id,
                                         @Query("class") String class1,
                                         @Query("trans_id") String trans_id,
                                         @Query("app_id") String app_id,
                                         @Query("lang") String lang);
}
