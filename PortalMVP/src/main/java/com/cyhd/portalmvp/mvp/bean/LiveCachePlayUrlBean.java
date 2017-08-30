package com.cyhd.portalmvp.mvp.bean;

import java.io.Serializable;

/**
 * Created by fanjia on 2017/7/2.
 * 缓存直播真实的播放地址实体类
 */

public class LiveCachePlayUrlBean implements Serializable{

    private String play_url;
    private String cache_time;
    private String cache_server_ip;

    public String getCache_server_ip() {
        return cache_server_ip;
    }

    public void setCache_server_ip(String cache_server_ip) {
        this.cache_server_ip = cache_server_ip;
    }

    public String getCache_time() {
        return cache_time;
    }

    public void setCache_time(String cache_time) {
        this.cache_time = cache_time;
    }

    public String getPlay_url() {
        return play_url;
    }

    public void setPlay_url(String play_url) {
        this.play_url = play_url;
    }

    @Override
    public String toString() {
        return "LiveCachePlayUrl{" +
                "play_url='" + play_url + '\'' +
                ", cache_time='" + cache_time + '\'' +
                '}';
    }
}
