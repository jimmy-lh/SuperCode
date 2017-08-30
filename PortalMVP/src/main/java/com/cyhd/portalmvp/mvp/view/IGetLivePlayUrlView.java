package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.GetLivePlayUrlResult;

/**
 * Created on 2017/7/19.
 */
public interface IGetLivePlayUrlView {

    //请求LSLB获取真实的播放地址
    void  requestPlayUrlSuccess(GetLivePlayUrlResult bean, String mPlayCode);
    /**
     *
     * @param error_code   访问lsb请求播放地址失败的错误码值
     */
    void  requestPlayUrlError(int error_code,String mPlayCode);
}
