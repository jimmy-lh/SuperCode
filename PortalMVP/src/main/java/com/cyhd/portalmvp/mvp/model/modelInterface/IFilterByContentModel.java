package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.FilterByContentBean;

/**
 * 4.1.39portal_online_39：用户节目筛选接口
 */
public interface IFilterByContentModel {

    /**
     * 用户节目筛选接口
     *
     * @param filterByContentBean
     * @param baseBeanResult
     */
    void filterByContent(FilterByContentBean filterByContentBean, BaseBeanResult baseBeanResult);
}
