package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.LoginBean;
import com.cyhd.portalmvp.mvp.beanResult.LoginResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.ILoginModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.3portal_online_03：用户认证接口
 */
public class LoginModel implements ILoginModel {
    @Override
    public void login(LoginBean loginBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(loginBean));

    }
}
