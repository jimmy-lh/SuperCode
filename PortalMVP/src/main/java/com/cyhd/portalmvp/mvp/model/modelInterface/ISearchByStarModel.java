package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.SearchByStarBean;

/**
 * 4.1.37portal_online_37：导演OR演员搜索接口
 */
public interface ISearchByStarModel {

    /**
     * 导演OR演员搜索接口
     *
     * @param searchByStarBean
     * @param baseBeanResult
     */
    void searchByStar(SearchByStarBean searchByStarBean, BaseBeanResult baseBeanResult);
}
