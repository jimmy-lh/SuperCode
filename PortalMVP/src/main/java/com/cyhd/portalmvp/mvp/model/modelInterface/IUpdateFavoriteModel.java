package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.UpdateFavoriteBean;

/**
 * 4.1.28portal_online_28：用户收藏信息修改
 */
public interface IUpdateFavoriteModel {

    /**
     * 用户收藏信息修改
     *
     * @param updateFavoriteBean
     * @param baseBeanResult
     */
    void updateFavorite(UpdateFavoriteBean updateFavoriteBean, BaseBeanResult baseBeanResult);
}
