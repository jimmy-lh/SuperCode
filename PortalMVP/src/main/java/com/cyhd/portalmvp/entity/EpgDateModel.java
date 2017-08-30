package com.cyhd.portalmvp.entity;

import java.util.Date;

/**
 * Created by yangsong on 2016/1/5.
 */
public class EpgDateModel {
    private Date startDate;
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
