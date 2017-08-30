package com.cyhd.portalmvp.mvp.bean;

import java.util.List;

/**
 * 4.1.35portal_online_35：获取推荐位信息
 */
public class GetRecommendsBean {

    /**
     * 登录用户的UserToken;必选
     */
    private String userToken;
    /**
     * 已经登录用户的用户名;必选
     */
    private String userName;
    /**
     * 门户编码;必选
     */
    private String portalCode;
    /**
     * 推荐位编码数组，只查询一个也以数组的形式传递;必选
     */
    private List<String> recommendCodeArr;

    public GetRecommendsBean(String userToken, String userName, String portalCode, List<String> recommendCodeArr) {
        this.userToken = userToken;
        this.userName = userName;
        this.portalCode = portalCode;
        this.recommendCodeArr = recommendCodeArr;
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

    public String getPortalCode() {
        return portalCode;
    }

    public void setPortalCode(String portalCode) {
        this.portalCode = portalCode;
    }

    public List<String> getRecommendCodeArr() {
        return recommendCodeArr;
    }

    public void setRecommendCodeArr(List<String> recommendCodeArr) {
        this.recommendCodeArr = recommendCodeArr;
    }

    @Override
    public String toString() {
        return "GetRecommendsBean{" +
                "userToken='" + userToken + '\'' +
                ", userName='" + userName + '\'' +
                ", portalCode='" + portalCode + '\'' +
                ", recommendCodeArr=" + recommendCodeArr +
                '}';
    }
}
