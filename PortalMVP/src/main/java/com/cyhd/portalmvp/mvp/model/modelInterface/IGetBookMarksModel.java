package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.GetBookMarksBean;

/**
 * 4.1.30portal_online_30：获取用户书签信息列表
 */
public interface IGetBookMarksModel {

    /**
     * 获取用户书签信息列表
     *
     * @param getBookMarksBean
     * @param baseBeanResult
     */
    void getBookMarks(GetBookMarksBean getBookMarksBean, BaseBeanResult baseBeanResult);
}
