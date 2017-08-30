package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
public class ChildColumnList implements Serializable {

    /**
     * 栏目id
     */
    private int id;
    /**
     * 栏目的父id
     */
    private int parentId;
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 栏目简介
     */
    private String brief;
    /**
     * 时间预告
     */
    private String timeNotice;
    /**
     * 推荐标题
     */
    private String recmdTitle;
    /**
     * 0:非试看 1：试看
     */
    private String trySee;
    /**
     * 栏目类型：1：直播;2：回看;3：点播;4:专题
     */
    private String type;
    /**
     * 0：表示未订购;1：表示已经订购;2：表示免费产品
     */
    private String orderFlag;
    /**
     * 栏目序号
     */
    private int Sequence;
    /**
     * 栏目编码
     */
    private String code;
    /**
     * 栏目备注
     */
    private String remark;
    /**
     * 栏目别名
     */
    private String alias;
    /**
     * 海报对象集合
     */
    private List<PosterList> posterList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        if (name == null && alias != null) {
            return alias;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getTimeNotice() {
        return timeNotice;
    }

    public void setTimeNotice(String timeNotice) {
        this.timeNotice = timeNotice;
    }

    public String getRecmdTitle() {
        return recmdTitle;
    }

    public void setRecmdTitle(String recmdTitle) {
        this.recmdTitle = recmdTitle;
    }

    public String getTrySee() {
        return trySee;
    }

    public void setTrySee(String trySee) {
        this.trySee = trySee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public int getSequence() {
        return Sequence;
    }

    public void setSequence(int sequence) {
        Sequence = sequence;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAlias() {
        if (alias == null && name != null) {
            return name;
        }
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<PosterList> getPosterList() {
        return posterList;
    }

    public void setPosterList(List<PosterList> posterList) {
        this.posterList = posterList;
    }

    @Override
    public String toString() {
        return "ChildColumnList{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", brief='" + brief + '\'' +
                ", timeNotice='" + timeNotice + '\'' +
                ", recmdTitle='" + recmdTitle + '\'' +
                ", trySee='" + trySee + '\'' +
                ", type='" + type + '\'' +
                ", orderFlag='" + orderFlag + '\'' +
                ", Sequence=" + Sequence +
                ", code='" + code + '\'' +
                ", remark='" + remark + '\'' +
                ", alias='" + alias + '\'' +
                ", posterList=" + posterList +
                '}';
    }
}
