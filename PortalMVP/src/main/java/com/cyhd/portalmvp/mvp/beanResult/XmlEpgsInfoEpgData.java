package com.cyhd.portalmvp.mvp.beanResult;

import android.text.TextUtils;

import com.cyhd.portalmvp.entity.EpgDateModel;
import com.cyhd.portalmvp.utils.DateUtil;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * epg节目预告
 * 注意：这个类为内部类会导致xml解析失败
 */
@Root(name = "epg", strict = false) //name:要解析的xml数据的头部
public class XmlEpgsInfoEpgData implements Serializable {

    @Element(name = "time", required = false)
    private String time;

    @Element(name = "content", required = false)
    private String content;

    private boolean hasChangedTimeZone = false;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isHasChangedTimeZone() {
        return hasChangedTimeZone;
    }

    public void setHasChangedTimeZone(boolean hasChangedTimeZone) {
        this.hasChangedTimeZone = hasChangedTimeZone;
    }

    public EpgDateModel getDate() {
        if (!TextUtils.isEmpty(this.time)) {
            if (this.time.contains("-")) {
                String[] timeStrs = this.time.split("-");
                if (timeStrs != null && timeStrs.length == 2) {
                    String startTimeStr = timeStrs[0];
                    String endTimeStr = timeStrs[1];
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    String year = format.format(new Date());
                    startTimeStr = year + " " + startTimeStr;
                    endTimeStr = year + " " + endTimeStr;
                    SimpleDateFormat formatResult = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    try {
                        Date startDate = formatResult.parse(startTimeStr);
                        Date endDate = formatResult.parse(endTimeStr);
                        EpgDateModel epgDateModel = new EpgDateModel();

                        /**
                         * 转换时区
                         */
                        if (!DateUtil.getCurrentTimeZone().equalsIgnoreCase("GMT+08:00") && !hasChangedTimeZone) {
                            Date newStartDate = DateUtil.changeTimeZone(formatResult.format(startDate));
                            Date newEendDate = DateUtil.changeTimeZone(formatResult.format(endDate));
                            SimpleDateFormat reSetModelformat = new SimpleDateFormat("HH:mm");
                            String reSetStartTimeStr = reSetModelformat.format(newStartDate);
                            String reSetEndTimeStr = reSetModelformat.format(newEendDate);
                            setTime(reSetStartTimeStr + "-" + reSetEndTimeStr);
                            setHasChangedTimeZone(true);
                            epgDateModel.setStartDate(newStartDate);
                            epgDateModel.setEndDate(newEendDate);
                        } else {
                            epgDateModel.setStartDate(startDate);
                            epgDateModel.setEndDate(endDate);
                        }
                        return epgDateModel;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "epg{"
                + "time = '" + time + "\'"
                + ", content = '" + content + "\'"
                + "}";
    }
}
