package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetAllbackProgramBean;

/**
 * 4.1.43portal_online_43：获取全部上架频道7天回看节目单
 */
public interface IGetAllbackProgramModel {

    /**
     * 获取全部上架频道7天回看节目单
     *
     * @param getAllbackProgramBean
     * @param baseBeanResult
     */
    void getAllbackProgram(GetAllbackProgramBean getAllbackProgramBean, BaseBeanResult baseBeanResult);
}
