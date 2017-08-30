package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.FilterGenreBean;

/**
 * 4.1.40portal_online_40：获取用户节目筛选类型接口
 */
public interface IFilterGenreModel {

    /**
     * IFilterGenreModel
     *
     * @param filterGenreBean
     * @param baseBeanResult
     */
    void filterGenre(FilterGenreBean filterGenreBean, BaseBeanResult baseBeanResult);
}
