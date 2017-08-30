package com.cyhd.portalmvp.mvp.model.modelInterface;


import com.cyhd.portalmvp.mvp.base.BaseBeanResult;
import com.cyhd.portalmvp.mvp.bean.AddBookMarkBean;

/**
 * 4.1.31portal_online_31：用户书签信息新增
 */
public interface IAddBookMarkModel {

    /**
     * 用户书签信息新增
     *
     * @param addBookMarkBean
     * @param baseBeanResult
     */
    void addBookMark(AddBookMarkBean addBookMarkBean, BaseBeanResult baseBeanResult);
}
