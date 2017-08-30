package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetShelveVersionBean;
import com.cyhd.portalmvp.mvp.beanResult.GetShelveVersionResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetShelveVersionModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.16portal_online_16：获取栏目上架数据版本号信息
 */
public class GetShelveVersionModel implements IGetShelveVersionModel {
    @Override
    public void getShelveVersion(GetShelveVersionBean getShelveVersionBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getShelveVersionBean));

    }
}
