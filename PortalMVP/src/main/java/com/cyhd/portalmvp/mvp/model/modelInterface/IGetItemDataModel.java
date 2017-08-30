package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetItemDataBean;

/**
 * 4.1.20portal_online_20：获取剧集/节目详情接口
 */
public interface IGetItemDataModel {

    /**
     * 获取剧集/节目详情接口
     *
     * @param getItemDataBean
     * @param baseBeanResult
     */
    void getItemData(GetItemDataBean getItemDataBean, BaseBeanResult baseBeanResult);
}
