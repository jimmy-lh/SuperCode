package com.cyhd.portalmvp.mvp.bean;

/**
 * apk上报接口实体类,数据收集
 */
public class DataCollectBean {

    /**
     * 一条播放记录的标识
     */
    private String trans_id;

    /**
     * 视频流标识
     */
    private String stream_mediacode;

    /**
     * 服务器IP
     */
    private String server_ip;

    /**
     * on_shrink卡顿、on_play播放、on_close结束
     */
    private String action;

    /**
     * 卡顿次数
     */
    private int caton_number;

    /**
     * 获取播放url的时间
     */
    private long play_url_time;

    /**
     * 到开始播放消耗的时间
     */
    private long play_time;

    /**
     * 用户SN
     */
    private String user_sn;

    /**
     * Apk的id
     */
    private String apk_id;

    /**
     * 节目名称
     */
    private String title;

    public DataCollectBean(String trans_id, String stream_mediacode, String server_ip, String action,
                           int caton_number, long play_url_time, long play_time, String user_sn,
                           String apk_id, String title) {
        this.trans_id = trans_id;
        this.stream_mediacode = stream_mediacode;
        this.server_ip = server_ip;
        this.action = action;
        this.caton_number = caton_number;
        this.play_url_time = play_url_time;
        this.play_time = play_time;
        this.user_sn = user_sn;
        this.apk_id = apk_id;
        this.title = title;
    }

    public String getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getStream_mediacode() {
        return stream_mediacode;
    }

    public void setStream_mediacode(String stream_mediacode) {
        this.stream_mediacode = stream_mediacode;
    }

    public String getServer_ip() {
        return server_ip;
    }

    public void setServer_ip(String server_ip) {
        this.server_ip = server_ip;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getCaton_number() {
        return caton_number;
    }

    public void setCaton_number(int caton_number) {
        this.caton_number = caton_number;
    }

    public long getPlay_url_time() {
        return play_url_time;
    }

    public void setPlay_url_time(int play_url_time) {
        this.play_url_time = play_url_time;
    }

    public long getPlay_time() {
        return play_time;
    }

    public void setPlay_time(int play_time) {
        this.play_time = play_time;
    }

    public String getUser_sn() {
        return user_sn;
    }

    public void setUser_sn(String user_sn) {
        this.user_sn = user_sn;
    }

    public String getApk_id() {
        return apk_id;
    }

    public void setApk_id(String apk_id) {
        this.apk_id = apk_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DataCollectBean{"
                + "trans_id = '" + trans_id + "\'"
                + ", stream_mediacode = '" + stream_mediacode + "\'"
                + ", server_ip = '" + server_ip + "\'"
                + ", action = '" + action + "\'"
                + ", caton_number = '" + caton_number + "\'"
                + ", play_url_time = '" + play_url_time + "\'"
                + ", play_time = '" + play_time + "\'"
                + ", user_sn = '" + user_sn + "\'"
                + ", apk_id = '" + apk_id + "\'"
                + ", title = '" + title + "\'"
                + "}";
    }
}
