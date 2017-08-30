package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.ColumnPriceBean;

/**
 * 4.1.15portal_online_15：栏目批价接口
 */
public interface IColumnPriceModel {

    /**
     * 栏目批价接口
     *
     * @param columnPriceBean
     * @param baseBeanResult
     */
    void columnPrice(ColumnPriceBean columnPriceBean, BaseBeanResult baseBeanResult);
}
