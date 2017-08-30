package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.SearchByStarBean;
import com.cyhd.portalmvp.mvp.beanResult.SearchByStarResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.ISearchByStarModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.37portal_online_37：导演OR演员搜索接口
 */
public class SearchByStarModel implements ISearchByStarModel {
    @Override
    public void searchByStar(SearchByStarBean searchByStarBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(searchByStarBean));

    }
}
