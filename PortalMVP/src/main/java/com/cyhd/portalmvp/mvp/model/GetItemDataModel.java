package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetItemDataBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetItemDataModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.20portal_online_20：获取剧集/节目详情接口
 */
public class GetItemDataModel implements IGetItemDataModel {
    @Override
    public void getItemData(GetItemDataBean getItemDataBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getItemDataBean));

    }
}
