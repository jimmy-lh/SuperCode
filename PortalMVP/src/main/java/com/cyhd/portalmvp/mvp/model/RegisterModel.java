package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.RegisterBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IRegisterModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.1portal_online_01：用户注册接口
 */
public class RegisterModel implements IRegisterModel {
    @Override
    public void register(RegisterBean registerBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(registerBean));

    }
}
