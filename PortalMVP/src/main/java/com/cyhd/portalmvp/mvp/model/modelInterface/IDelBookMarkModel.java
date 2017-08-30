package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.DelBookMarkBean;

/**
 * 4.1.33portal_online_33：用户书签信息删除
 */
public interface IDelBookMarkModel {

    /**
     * 用户书签信息删除
     *
     * @param delBookMarkBean
     * @param baseBeanResult
     */
    void delBookMark(DelBookMarkBean delBookMarkBean, BaseBeanResult baseBeanResult);
}
