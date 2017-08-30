package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.DelFavoriteBean;
import com.cyhd.portalmvp.mvp.beanResult.DelFavoriteResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IDelFavoriteModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.29portal_online_29：用户收藏信息删除
 */
public class DelFavoriteModel implements IDelFavoriteModel {
    @Override
    public void delFavorite(DelFavoriteBean delFavoriteBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(delFavoriteBean));

    }
}
