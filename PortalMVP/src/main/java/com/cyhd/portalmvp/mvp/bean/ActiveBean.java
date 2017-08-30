package com.cyhd.portalmvp.mvp.bean;

/**
 * 4.1.2portal_online_02：用户激活接口
 */
public class ActiveBean {

    /**
     * 枚举值：1:终端自产;2:终端代产,由终端校验传入;必选
     */
    private String type;
    /**
     * 机顶盒序列号，如果是自产终端，直接传递SN序列号，如果是代产终端，
     * apk采用MD5（product_model+product_name+mac_addr+cpu_model+密钥）
     * 生成sn传递过来，不需要用户输入，后端需要校验MD5值的准确性。
     * 必选
     */
    private String sn;
    /**
     * 终端产品型号;必选
     */
    private String productModel;
    /**
     * 终端产品名称;必选
     */
    private String productName;
    /**
     * MAC地址，优先为LAN口MAC地址;;必选
     */
    private String macAddr;
    /**
     * CPU型号;必选
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
     * platformId;可选
     */
    private String platformId;
    /**
     * 应用ID（应用唯一值）;可选
     */
    private String appId;

    public ActiveBean(String type, String sn, String productModel, String productName,
                      String macAddr, String cpuModel, String appId) {
        this.type = type;
        this.sn = sn;
        this.productModel = productModel;
        this.productName = productName;
        this.macAddr = macAddr;
        this.cpuModel = cpuModel;
        this.appId = appId;
    }

    public ActiveBean(String type, String sn, String productModel, String productName, String macAddr,
                      String cpuModel, String memory, String versionInfo, String platformId, String appId) {
        this.type = type;
        this.sn = sn;
        this.productModel = productModel;
        this.productName = productName;
        this.macAddr = macAddr;
        this.cpuModel = cpuModel;
        this.memory = memory;
        this.versionInfo = versionInfo;
        this.platformId = platformId;
        this.appId = appId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
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

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "ActiveBean{" +
                "type='" + type + '\'' +
                ", sn='" + sn + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productName='" + productName + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", cpuModel='" + cpuModel + '\'' +
                ", memory='" + memory + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", platformId='" + platformId + '\'' +
                ", appId='" + appId + '\'' +
                '}';
    }
}
