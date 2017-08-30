package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.SlbBeanResult;

/**
 * Created on 2017/7/19.
 */
public interface ISlbView {

    //请求gslb获取lslb地址
    void  requestSlbSuccess(SlbBeanResult mSlbBean);

    /**
     *
     * @param error_code   访问Glsb失败错误码值
     */
    void  requestSlbError(int error_code);
}
