package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.StartPlayVODBean;

/**
 * 4.1.21portal_online_21：点播鉴权接口
 */

public interface IStartPlayVODModel {

    /**
     * 点播鉴权接口
     *
     * @param startPlayVODBean
     * @param baseBeanResult
     */
    void startPlayVOD(StartPlayVODBean startPlayVODBean, BaseBeanResult baseBeanResult);
}
