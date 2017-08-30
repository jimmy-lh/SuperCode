package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetAuthInfoBean;

/**
 * 4.1.13portal_online_13：用户授权信息获取接口
 */
public interface IGetAuthInfoModel {

    /**
     * 用户授权信息获取接口
     *
     * @param getAuthInfoBean
     * @param baseBeanResult
     */
    void getAuthInfo(GetAuthInfoBean getAuthInfoBean, BaseBeanResult baseBeanResult);
}
