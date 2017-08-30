package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.3portal_online_03：用户认证接口
 */

public class LoginBean {

    /**
     * 登录用户名;必选
     */
    private String userName;
    /**
     * 登录密码;必选
     */
    private String password;
    /**
     * 终端产品型号;可选
     */
    private String productModel;
    /**
     * 终端产品名称;可选
     */
    private String productName;
    /**
     * MAC地址
     * IOS系统：使用UUID，同一时间所有用户唯一
     * Android：优先使用LAN接口的MAC;
     * 必选
     */
    private String macAddr;
    /**
     * CPU型号;可选
     */
    private String cpuModel;
    /**
     * 内存容量总值;可选
     */
    private String memory;
    /**
     * 版本信息;可选
     */
    private String versionInfo;
    /**
     * androidId[将 platformId改为androidId参数];可选
     */
    private String androidId;
    /**
     * 应用ID（应用唯一值）;可选
     */
    private String appId;
    /**
     * 0：退出登录;可选
     */
    private String type;

    public LoginBean(String userName, String password, String productModel, String productName,
                     String macAddr, String cpuModel, String memory, String versionInfo,
                     String androidId, String appId, String type) {
        this.userName = userName;
        this.password = password;
        this.productModel = productModel;
        this.productName = productName;
        this.macAddr = macAddr;
        this.cpuModel = cpuModel;
        this.memory = memory;
        this.versionInfo = versionInfo;
        this.androidId = androidId;
        this.appId = appId;
        this.type = type;
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

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productName='" + productName + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", cpuModel='" + cpuModel + '\'' +
                ", memory='" + memory + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", androidId='" + androidId + '\'' +
                ", appId='" + appId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
