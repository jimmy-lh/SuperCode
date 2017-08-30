package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * 4.1.1portal_online_01：用户注册接口
 */
public class RegisterResult implements Serializable {
    /**
     * 结果码
     */
    private String returnCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    private String data;
}
