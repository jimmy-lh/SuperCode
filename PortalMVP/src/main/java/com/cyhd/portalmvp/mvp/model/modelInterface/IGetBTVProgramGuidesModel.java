package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetBTVProgramGuidesBean;

/**
 * 4.1.18portal_online_18：获取频道回看节目单接口
 */
public interface IGetBTVProgramGuidesModel {

    /**
     * 获取频道回看节目单接口
     *
     * @param getBTVProgramGuidesBean
     * @param baseBeanResult
     */
    void getBTVProgramGuides(GetBTVProgramGuidesBean getBTVProgramGuidesBean, BaseBeanResult baseBeanResult);
}
