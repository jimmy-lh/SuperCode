package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.LoveClickBean;
import com.cyhd.portalmvp.mvp.beanResult.LoveClickResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.ILoveClickModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.24portal_online_24：点赞/取消点赞接口
 */
public class LoveClickModel implements ILoveClickModel {
    @Override
    public void loveClick(LoveClickBean loveClickBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(loveClickBean));
    }
}
