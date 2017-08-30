package com.cyhd.portalmvp.mvp.view;

import com.cyhd.portalmvp.mvp.beanResult.GetShelveDataResult;

/**
 * 4.1.17portal_online_17：获取栏目上架数据接口
 */

public interface IGetShelveDataView {

    /**
     * 获取栏目上架数据后调用
     *
     * @param result
     */
    void onSucceedGetShelveData(GetShelveDataResult result);

    /**
     * 请求失败返回
     *
     * @param errCode
     */
    void onFailGetShelveData(String errCode);
}
