package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.QueryLoveClickFlagBean;

/**
 * 4.1.25portal_online_25：获取当前用户是否点赞接口
 */
public interface IQueryLoveClickFlagModel {

    /**
     * 获取当前用户是否点赞接口
     *
     * @param queryLoveClickFlagBean
     * @param baseBeanResult
     */
    void queryLoveClickFlag(QueryLoveClickFlagBean queryLoveClickFlagBean, BaseBeanResult baseBeanResult);
}
