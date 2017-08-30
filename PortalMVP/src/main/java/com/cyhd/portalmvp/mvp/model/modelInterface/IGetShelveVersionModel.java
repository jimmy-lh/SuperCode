package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetShelveVersionBean;

/**
 * 4.1.16portal_online_16：获取栏目上架数据版本号信息
 */
public interface IGetShelveVersionModel {

    /**
     * 获取栏目上架数据版本号信息
     *
     * @param getShelveVersionBean
     * @param baseBeanResult
     */
    void getShelveVersion(GetShelveVersionBean getShelveVersionBean, BaseBeanResult baseBeanResult);

}
