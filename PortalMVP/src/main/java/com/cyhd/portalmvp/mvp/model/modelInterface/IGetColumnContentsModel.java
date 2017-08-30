package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetColumnContentsBean;

/**
 * 4.1.14portal_online_14：获取栏目信息接口
 */
public interface IGetColumnContentsModel {

    /**
     * 获取栏目信息接口
     *
     * @param getColumnContentsBean
     * @param baseBeanResult
     */
    void getColumnContents(GetColumnContentsBean getColumnContentsBean, BaseBeanResult baseBeanResult);
}
