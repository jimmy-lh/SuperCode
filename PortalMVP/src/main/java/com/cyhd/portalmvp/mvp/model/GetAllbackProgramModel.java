package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetAllbackProgramBean;
import com.cyhd.portalmvp.mvp.beanResult.GetAllbackProgramResult;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetAllbackProgramModel;
import com.cyhd.portalmvp.mvp.network.CustomSubscriber;
import com.cyhd.portalmvp.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.43portal_online_43：获取全部上架频道7天回看节目单
 */
public class GetAllbackProgramModel implements IGetAllbackProgramModel {
    @Override
    public void getAllbackProgram(GetAllbackProgramBean getAllbackProgramBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getAllbackProgramBean));

    }
}
