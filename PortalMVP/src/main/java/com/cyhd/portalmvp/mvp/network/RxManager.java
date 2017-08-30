package com.cyhd.portalmvp.mvp.network;

import android.support.v4.util.ArrayMap;

import java.util.Map;
import java.util.Set;

import rx.Subscriber;

/**
 * Created on 2017/7/18.
 */
public class RxManager {

    private static RxManager mInstance;

    private Map<String, Subscriber> map;

    private RxManager() {
        map = new ArrayMap<>();
    }

    public static RxManager getInstance() {
        if (mInstance == null) {
            synchronized (RxManager.class) {
                if (mInstance == null) {
                    mInstance = new RxManager();
                }
            }
        }
        return mInstance;
    }

    public void add(String key, Subscriber subscriber) {
        map.put(key, subscriber);
    }

    public void cancel(String key) {
        if (map.isEmpty()) {
            return;
        }
        if (map.get(key) == null) {
            return;
        }
        if (!map.get(key).isUnsubscribed()) {
            map.get(key).unsubscribe();
            map.remove(key);
        }
    }

    public void cancelAll() {
        if (map.isEmpty()) {
            return;
        }
        Set<String> keys = map.keySet();
        for (String apiKey : keys) {
            cancel(apiKey);
        }
    }

}
