package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AssociateBean;

/**
 * 4.1.41portal_online_41：获取关键字联想
 */
public interface IAssociateModel {

    /**
     * 获取关键字联想
     *
     * @param associateBean
     * @param baseBeanResult
     */
    void associate(AssociateBean associateBean, BaseBeanResult baseBeanResult);
}
