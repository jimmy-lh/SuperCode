package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.QueryOttAccountBean;

/**
 * 4.1.11portal_online_11：用户信息获取接口
 */
public interface IQueryOttAccountModel {

    /**
     * 用户信息获取接口
     *
     * @param queryOttAccountBean
     * @param baseBeanResult
     */
    void queryOttAccount(QueryOttAccountBean queryOttAccountBean, BaseBeanResult baseBeanResult);
}
