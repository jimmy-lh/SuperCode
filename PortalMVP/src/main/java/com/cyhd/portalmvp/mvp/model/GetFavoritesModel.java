package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetFavoritesBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetFavoritesModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.26portal_online_26：获取用户收藏列表
 */
public class GetFavoritesModel implements IGetFavoritesModel {
    @Override
    public void getFavorites(GetFavoritesBean getFavoritesBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getFavoritesBean));

    }
}
