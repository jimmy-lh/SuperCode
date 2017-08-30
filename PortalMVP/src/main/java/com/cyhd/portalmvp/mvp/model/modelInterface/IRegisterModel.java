package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.RegisterBean;

/**
 * 4.1.1portal_online_01：用户注册接口
 */
public interface IRegisterModel {

    /**
     * 用户注册
     *
     * @param registerBean
     * @param baseBeanResult
     */
    void register(RegisterBean registerBean, BaseBeanResult baseBeanResult);
}
