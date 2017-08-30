package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.GetAuthInfoResult;

/**
 * 4.1.13portal_online_13：用户授权信息获取接口
 */
public interface IGetAuthInfoView {

    /**
     * 成功后返回
     *
     * @param result
     */
    void onSucceedGetAuthInfo(GetAuthInfoResult result);
}
