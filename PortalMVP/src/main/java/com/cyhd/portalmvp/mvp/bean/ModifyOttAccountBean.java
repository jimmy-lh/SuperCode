package com.cyhd.portalmvp.mvp.bean;

/**
 * Created on 2017/7/11.
 * 4.1.12portal_online_12：用户信息修改接口
 */
public class ModifyOttAccountBean {

    /**
     * 激活或者认证返回的token信息，结合userName用来校验请求合法性;必选
     */
    private String userToken;
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 原密码;可选
     */
    private String password;
    /**
     * 新密码;可选
     */
    private String newPassword;
    /**
     * 电子邮箱;可选
     */
    private String email;
    /**
     * 手机号码;可选
     */
    private String mobile;
    /**
     * 固定电话;可选
     */
    private String tel;

    public ModifyOttAccountBean(String userToken, String userName, String password, String newPassword, String email, String mobile, String tel) {
        this.userToken = userToken;
        this.userName = userName;
        this.password = password;
        this.newPassword = newPassword;
        this.email = email;
        this.mobile = mobile;
        this.tel = tel;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "ModifyOttAccountBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
