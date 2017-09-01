package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AuthBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IAuthModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.6portal_online_06：用户鉴权接口
 */
public class AuthModel implements IAuthModel {
    @Override
    public void auth(AuthBean authBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(authBean));

    }
}
