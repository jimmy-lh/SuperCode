package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.SearchByNameBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.ISearchByNameModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.36portal_online_36：影片名称搜索接口
 */
public class SearchByNameModel implements ISearchByNameModel {
    @Override
    public void searchByName(SearchByNameBean searchByNameBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(searchByNameBean));

    }
}
