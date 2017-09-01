package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.UpdateFavoriteBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IUpdateFavoriteModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.28portal_online_28：用户收藏信息修改
 */
public class UpdateFavoriteModel implements IUpdateFavoriteModel {
    @Override
    public void updateFavorite(UpdateFavoriteBean updateFavoriteBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(updateFavoriteBean));

    }
}
