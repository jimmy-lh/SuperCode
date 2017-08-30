package com.cyhd.portalmvp.mvp.beanResult;

import android.text.TextUtils;
import android.widget.ListView;

import com.cyhd.portalmvp.entity.EpgDateModel;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 2017/7/12.
 */
@Table(name = "ChannelList")
public class ChannelList implements Serializable {

    /**
     * 内容唯一标识，资产编号,对应CDN的CHID
     */
    @Column(name = "channelCode", isId = true)
    private String channelCode;

    @Column(name = "program_state")
    private int program_state = 0;  //0 未加锁，未收藏  ,1 已收藏，未加锁,2 未收藏，已加锁,3 已加锁，已收藏
    @Column(name = "locked_end_time")
    private String locked_end_time = "";  //加锁结束时间

    @Column(name = "eventKey")
    private String eventKey;

    @Column(name = "locked_time_zone")
    private String locked_time_zone = "";  //加锁时所在的时区

    @Column(name = "locked_start_time")
    private String locked_start_time = "";  //加锁开始时间

    @Column(name = "page")
    private int page;

    @Column(name = "index")
    private int index;

    @Column(name = "collectionTime")
    private long collectionTime;

    private boolean hasUpdateCollection = false;

    private XmlEpgsInfoData filmInfoEpgModel;

    private XmlEpgsInfoEpgData currentEpg;

    private XmlEpgsInfoEpgData nextEpg;

    /**
     * 频道名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 别名
     */
    @Column(name = "alias")
    private String alias;
    /**
     * 支持的业务
     */
    private String supportBusiness;
    /**
     * 频道编号
     */
    @Column(name = "channelNumber")
    private int channelNumber;
    /**
     * 关联标签，多个之间使用逗号分隔
     */
    private String tags;
    /**
     * 关键字，多个关键字之间使用逗号分隔
     */
    @Column(name = "keyWords")
    private String keyWords;
    /**
     * 枚举值：限制级标识,0:非限制级;1:限制级
     */
    @Column(name = "restricted")
    private String restricted;
    /**
     * 频道海报集合，poster集合
     */
    private List<PosterList> posterList;
    /**
     * 当栏目是直播类型时，返回直播地址信息，liveAddress集合
     */
    private List<LiveAddressList> liveAddressList;
    /**
     * 回看节目单，programGuide集合
     */
    private List<ProgramGuideList> backProgramList;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getName() {
        if (!TextUtils.isEmpty(name)) {
            return name;
        } else {
            return getAlias();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        String title = this.getName();
        if (!TextUtils.isEmpty(title))
            names.add(title);
        if (!TextUtils.isEmpty(alias))
            names.add(alias);
        return names;
    }

    public String getAlias() {
        if (!TextUtils.isEmpty(alias)) {
            return alias;
        } else {
            return getName();
        }
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSupportBusiness() {
        return supportBusiness;
    }

    public void setSupportBusiness(String supportBusiness) {
        this.supportBusiness = supportBusiness;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getRestricted() {
        return restricted;
    }

    public void setRestricted(String restricted) {
        this.restricted = restricted;
    }

    public List<PosterList> getPosterList() {
        return posterList;
    }

    public void setPosterList(List<PosterList> posterList) {
        this.posterList = posterList;
    }

    public List<LiveAddressList> getLiveAddressList() {
        return liveAddressList;
    }

    public void setLiveAddressList(List<LiveAddressList> liveAddressList) {
        this.liveAddressList = liveAddressList;
    }

    public List<ProgramGuideList> getBackProgramList() {
        return backProgramList;
    }

    public void setBackProgramList(List<ProgramGuideList> backProgramList) {
        this.backProgramList = backProgramList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isHasUpdateCollection() {
        return hasUpdateCollection;
    }

    public void setHasUpdateCollection(boolean hasUpdateCollection) {
        this.hasUpdateCollection = hasUpdateCollection;
    }

    public long getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(long collectionTime) {
        this.collectionTime = collectionTime;
    }

    public XmlEpgsInfoEpgData getCurrentEpg() {
        Date currentDate = new Date();
        if (this.currentEpg != null) {
            EpgDateModel dateModel = this.currentEpg.getDate();
            if (dateModel != null) {
                Date currentEndDate = dateModel.getEndDate();
                if (currentEndDate != null && currentDate.before(currentEndDate) || currentDate.compareTo(currentEndDate) == 0) {
                    return this.currentEpg;
                }
            }

        }

        if (getFilmInfoEpgModel() == null) {
            return null;
        }

        ArrayList<XmlEpgsInfoEpgData> liveEpgModels = (ArrayList<XmlEpgsInfoEpgData>) getFilmInfoEpgModel().getXmlEpgsInfoEpgDatas();
        if (liveEpgModels == null || liveEpgModels.size() <= 0)
            return null;
        int result = ListView.INVALID_POSITION;
        int i = 0;
        for (XmlEpgsInfoEpgData liveEpgModel : liveEpgModels) {
            if (liveEpgModel == null)
                continue;
            EpgDateModel epgDateModel = liveEpgModel.getDate();
            if (epgDateModel == null)
                continue;
            boolean b = (currentDate.after(epgDateModel.getStartDate()) && currentDate.before(epgDateModel.getEndDate()))
                    || currentDate.compareTo(epgDateModel.getStartDate()) == 0 || currentDate.compareTo(epgDateModel.getEndDate()) == 0;
            if (b) {
                result = i;
                break;
            }
            i++;
        }

        this.currentEpg = (result >= 0 && result < liveEpgModels.size()) ? liveEpgModels.get(result) : null;
        this.nextEpg = (result + 1 >= 0 && result + 1 < liveEpgModels.size()) ? liveEpgModels.get(result + 1) : null;
        return this.currentEpg;
    }

    public XmlEpgsInfoData getFilmInfoEpgModel() {
        return filmInfoEpgModel;
    }

    public void setFilmInfoEpgModel(XmlEpgsInfoData filmInfoEpgModel) {
        this.filmInfoEpgModel = filmInfoEpgModel;
    }

    public XmlEpgsInfoEpgData getNextEpg() {
        return nextEpg;
    }

    public void setNextEpg(XmlEpgsInfoEpgData nextEpg) {
        this.nextEpg = nextEpg;
    }

    @Override
    public String toString() {
        return "ChannelList{" +
                "channelCode='" + channelCode + '\'' +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", supportBusiness='" + supportBusiness + '\'' +
                ", channelNumber=" + channelNumber +
                ", tags='" + tags + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", restricted='" + restricted + '\'' +
                ", posterList=" + posterList +
                ", liveAddressList=" + liveAddressList +
                ", backProgramList=" + backProgramList +
                '}';
    }
}
