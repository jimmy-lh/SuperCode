package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetShelveDataBean;

/**
 * 4.1.17portal_online_17：获取栏目上架数据接口
 */
public interface IGetShelveDataModel {

    /**
     * 获取栏目上架数据接口,每隔30分钟访问一次，出错则更换主备再访问
     *
     * @param getShelveDataBean
     * @param baseBeanResult
     */
    void getShelveData(GetShelveDataBean getShelveDataBean, BaseBeanResult baseBeanResult);


    /**
     * 获取一次栏目上架数据接口，出错则更换主备再访问
     *
     * @param getShelveDataBean
     * @param baseBeanResult
     */
    void getShelveDataOnce(GetShelveDataBean getShelveDataBean, BaseBeanResult baseBeanResult);
}
