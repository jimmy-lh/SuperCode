package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetTodayProgramBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetTodayProgramModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.42portal_online_42：获取全部上架频道当天节目单
 */
public class GetTodayProgramModel implements IGetTodayProgramModel {
    @Override
    public void getTodayProgram(GetTodayProgramBean getTodayProgramBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getTodayProgramBean));

    }
}
