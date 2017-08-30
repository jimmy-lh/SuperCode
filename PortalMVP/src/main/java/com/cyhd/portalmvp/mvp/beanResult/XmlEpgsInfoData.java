package com.cyhd.portalmvp.mvp.beanResult;

import android.text.TextUtils;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * 注意：这个类为内部类会导致xml解析失败
 */
@Root(name = "filminfoepg", strict = false) //name:要解析的xml数据的头部
public class XmlEpgsInfoData {

    @Attribute(name = "name")
    private String name;

    @ElementList(entry = "epg", inline = true, required = false)
    private List<XmlEpgsInfoEpgData> xmlEpgsInfoEpgDatas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhName() {
        if (!TextUtils.isEmpty(this.name)) {
            if (this.name.contains(",")) {
                String[] strs = this.name.split(",");
                if (strs != null && strs.length == 2) {
                    return strs[0];
                } else {
                    return this.name;
                }
            } else {
                return this.name;
            }
        } else {
            return null;
        }
    }

    public String getEnName() {
        if (!TextUtils.isEmpty(this.name)) {
            if (this.name.contains(",")) {
                String[] strs = this.name.split(",");
                if (strs != null && strs.length == 2) {
                    return strs[1];
                } else {
                    return this.name;
                }
            } else {
                return this.name;
            }
        } else {
            return null;
        }
    }

    public List<XmlEpgsInfoEpgData> getXmlEpgsInfoEpgDatas() {
        return xmlEpgsInfoEpgDatas;
    }

    public void setXmlEpgsInfoEpgDatas(List<XmlEpgsInfoEpgData> xmlEpgsInfoEpgDatas) {
        this.xmlEpgsInfoEpgDatas = xmlEpgsInfoEpgDatas;
    }

    @Override
    public String toString() {
        return "filminfoepg{"
                + "name = '" + name + "\'"
                + ", epg = " + xmlEpgsInfoEpgDatas
                + "}";
    }
}
