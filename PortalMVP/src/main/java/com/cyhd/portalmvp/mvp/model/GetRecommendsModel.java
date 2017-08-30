package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetRecommendsBean;
import com.cyhd.portalmvp.mvp.beanResult.GetRecommendsResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetRecommendsModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.35portal_online_35：获取推荐位信息
 */
public class GetRecommendsModel implements IGetRecommendsModel {
    @Override
    public void getRecommends(GetRecommendsBean getRecommendsBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getRecommendsBean));

    }
}
