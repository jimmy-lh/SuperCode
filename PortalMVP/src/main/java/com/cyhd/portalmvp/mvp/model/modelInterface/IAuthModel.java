package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AuthBean;

/**
 * 4.1.6portal_online_06：用户鉴权接口
 */

public interface IAuthModel {

    /**
     * 用户鉴权接口
     *
     * @param authBean
     * @param baseBeanResult
     */
    void auth(AuthBean authBean, BaseBeanResult baseBeanResult);
}
