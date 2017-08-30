package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.1portal_online_01：用户注册接口
 */
public class RegisterBean {
    /**
     * 用户名;必选
     */
    private String userName;
    /**
     * 密码;必选
     */
    private String password;
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
    /**
     * 终端SN序列号：如果是自产终端，直接传递SN序列号，如果是代产终端，
     * apk采用MD5（product_model+product_name+mac_addr+cpu_model+密钥） 生成sn传递过来，不需要用户输入;
     * 可选
     */
    private String sn;

    public RegisterBean(String userName, String password, String email, String mobile, String tel, String sn) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.tel = tel;
        this.sn = sn;
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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
        return "RegisterBean{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", tel='" + tel + '\'' +
                ", sn='" + sn + '\'' +
                '}';
    }
}
