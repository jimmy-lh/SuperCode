package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.SearchByContentBean;

/**
 * 4.1.38portal_online_38：相似影片搜索接口
 */
public interface ISearchByContentModel {

    /**
     * 相似影片搜索接口
     *
     * @param searchByContentBean
     * @param baseBeanResult
     */
    void searchByContent(SearchByContentBean searchByContentBean, BaseBeanResult baseBeanResult);
}
