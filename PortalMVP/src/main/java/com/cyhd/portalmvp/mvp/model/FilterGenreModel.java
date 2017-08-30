package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.FilterGenreBean;
import com.cyhd.portalmvp.mvp.beanResult.FilterGenreResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IFilterGenreModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.40portal_online_40：获取用户节目筛选类型接口
 */
public class FilterGenreModel implements IFilterGenreModel {
    @Override
    public void filterGenre(FilterGenreBean filterGenreBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(filterGenreBean));

    }
}
