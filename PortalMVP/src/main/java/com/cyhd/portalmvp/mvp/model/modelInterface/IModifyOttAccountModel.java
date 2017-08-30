package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ModifyOttAccountBean;

/**
 * 4.1.12portal_online_12：用户信息修改接口
 */
public interface IModifyOttAccountModel {

    /**
     * 用户信息修改接口
     *
     * @param modifyOttAccountBean
     * @param baseBeanResult
     */
    void modifyOttAccount(ModifyOttAccountBean modifyOttAccountBean, BaseBeanResult baseBeanResult);
}
