package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetColumnRecommendResourceBean;
import com.cyhd.portalmvp.mvp.beanResult.GetColumnRecommendResourceResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetColumnRecommendResourceModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.19portal_online_19：获取栏目推荐信息接口
 */
public class GetColumnRecommendResourceModel implements IGetColumnRecommendResourceModel {
    @Override
    public void getColumnRecommendResource(GetColumnRecommendResourceBean getColumnRecommendResourceBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getColumnRecommendResourceBean));

    }
}
