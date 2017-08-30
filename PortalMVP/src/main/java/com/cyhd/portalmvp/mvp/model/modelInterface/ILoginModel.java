package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.LoginBean;

/**
 * 4.1.3portal_online_03：用户认证接口
 */
public interface ILoginModel {

    /**
     * 用户认证接口
     *
     * @param loginBean
     * @param baseBeanResult
     */
    void login(LoginBean loginBean, BaseBeanResult baseBeanResult);
}
