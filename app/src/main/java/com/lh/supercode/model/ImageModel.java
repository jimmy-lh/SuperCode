package com.lh.supercode.model;

/**
 * Created on 2017/8/25.
 */
public class ImageModel {
    private int text;
    private String url;

    public ImageModel(int text, String url) {
        this.text = text;
        this.url = url;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
