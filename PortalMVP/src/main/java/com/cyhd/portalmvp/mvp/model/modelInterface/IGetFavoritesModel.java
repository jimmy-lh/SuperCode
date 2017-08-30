package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetFavoritesBean;

/**
 * 4.1.26portal_online_26：获取用户收藏列表
 */
public interface IGetFavoritesModel {

    /**
     * 获取用户收藏列表
     *
     * @param getFavoritesBean
     * @param baseBeanResult
     */
    void getFavorites(GetFavoritesBean getFavoritesBean, BaseBeanResult baseBeanResult);
}
