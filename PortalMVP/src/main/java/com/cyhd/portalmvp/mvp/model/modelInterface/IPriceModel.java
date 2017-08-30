package com.cyhd.portalmvp.mvp.model.modelInterface;

import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.PriceBean;

/**
 * 4.1.5portal_online_05：产品批价接口
 */
public interface IPriceModel {

    /**
     * 产品批价接口
     *
     * @param priceBean
     * @param baseBeanResult
     */
    void price(PriceBean priceBean, BaseBeanResult baseBeanResult);

}
