package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.SearchByNameBean;

/**
 * 4.1.36portal_online_36：影片名称搜索接口
 */
public interface ISearchByNameModel {

    /**
     * 影片名称搜索接口
     *
     * @param searchByNameBean
     * @param baseBeanResult
     */
    void searchByName(SearchByNameBean searchByNameBean, BaseBeanResult baseBeanResult);
}
