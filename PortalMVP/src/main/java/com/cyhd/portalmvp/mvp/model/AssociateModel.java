package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AssociateBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IAssociateModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.41portal_online_41：获取关键字联想
 */
public class AssociateModel implements IAssociateModel {
    @Override
    public void associate(AssociateBean associateBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(associateBean));
    }
}
