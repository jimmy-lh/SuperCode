package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetTodayProgramBean;

/**
 * 4.1.42portal_online_42：获取全部上架频道当天节目单
 */
public interface IGetTodayProgramModel {

    /**
     * 获取全部上架频道当天节目单
     *
     * @param getTodayProgramBean
     * @param baseBeanResult
     */
    void getTodayProgram(GetTodayProgramBean getTodayProgramBean, BaseBeanResult baseBeanResult);
}
