package com.cyhd.portalmvp.mvp.model;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetBTVProgramGuidesBean;
import com.cyhd.portalmvp.mvp.model.modelInterface.IGetBTVProgramGuidesModel;
import com.lh.commonclasses.utils.DesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 4.1.18portal_online_18：获取频道回看节目单接口
 */
public class GetBTVProgramGuidesModel implements IGetBTVProgramGuidesModel {
    @Override
    public void getBTVProgramGuides(GetBTVProgramGuidesBean getBTVProgramGuidesBean, final BaseBeanResult baseBeanResult) {
        //将数据转成json数据然后加密
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        final String json = DesUtil.encrypt(gson.toJson(getBTVProgramGuidesBean));

    }
}
