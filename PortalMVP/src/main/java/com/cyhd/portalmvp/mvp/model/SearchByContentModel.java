package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.SearchByContentBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.ISearchByContentModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.38portal_online_38：相似影片搜索接口
 */
public class SearchByContentModel implements ISearchByContentModel {
    @Override
    public void searchByContent(SearchByContentBean searchByContentBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(searchByContentBean));

    }
}
