package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AddFavoriteBean;
import com.cyhd.portalmvp.mvp.beanResult.AddFavoriteResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IAddFavoriteModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.27portal_online_27：用户收藏信息新增
 */
public class AddFavoriteModel implements IAddFavoriteModel {
    @Override
    public void addFavorite(AddFavoriteBean addFavoriteBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(addFavoriteBean));

    }
}
