package com.cyhd.portalmvp.mvp.beanResult;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.List;

/**
 * epg节目预告
 */
@Root(name = "epgs", strict = false) //name:要解析的xml数据的头部
public class XmlEpgsResult implements Serializable {

    @ElementList(entry = "filminfoepg", inline = true, required = false)
    private List<XmlEpgsInfoData> xmlEpgsInfoDatas;

    public List<XmlEpgsInfoData> getXmlEpgsInfoDatas() {
        return xmlEpgsInfoDatas;
    }

    public void setXmlEpgsInfoDatas(List<XmlEpgsInfoData> xmlEpgsInfoDatas) {
        this.xmlEpgsInfoDatas = xmlEpgsInfoDatas;
    }

    @Override
    public String toString() {
        return "epgs{"
                + "filminfoepg = " + xmlEpgsInfoDatas
                + "}";
    }
}
