package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.DelFavoriteBean;

/**
 * 4.1.29portal_online_29：用户收藏信息删除
 */
public interface IDelFavoriteModel {

    /**
     * 用户收藏信息删除
     *
     * @param delFavoriteBean
     * @param baseBeanResult
     */
    void delFavorite(DelFavoriteBean delFavoriteBean, BaseBeanResult baseBeanResult);
}
