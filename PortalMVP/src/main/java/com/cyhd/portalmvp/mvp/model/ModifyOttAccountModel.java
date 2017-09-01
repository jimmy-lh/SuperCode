package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ModifyOttAccountBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IModifyOttAccountModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.12portal_online_12：用户信息修改接口
 */
public class ModifyOttAccountModel implements IModifyOttAccountModel {
    @Override
    public void modifyOttAccount(ModifyOttAccountBean modifyOttAccountBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(modifyOttAccountBean));

    }
}
