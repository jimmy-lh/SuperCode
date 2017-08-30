package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AddFavoriteBean;

/**
 * 4.1.27portal_online_27：用户收藏信息新增
 */
public interface IAddFavoriteModel {

    /**
     * 用户收藏信息新增
     *
     * @param addFavoriteBean
     * @param baseBeanResult
     */
    void addFavorite(AddFavoriteBean addFavoriteBean, BaseBeanResult baseBeanResult);
}
