package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.UpdateBookMarkBean;

/**
 * 4.1.32portal_online_32：用户书签信息修改
 */
public interface IUpdateBookMarkModel {

    /**
     * 用户书签信息修改
     *
     * @param updateBookMarkBean
     * @param baseBeanResult
     */
    void updateBookMark(UpdateBookMarkBean updateBookMarkBean, BaseBeanResult baseBeanResult);
}
