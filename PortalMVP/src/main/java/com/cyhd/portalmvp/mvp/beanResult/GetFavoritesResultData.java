package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class GetFavoritesResultData implements Serializable {

    /**
     * 收藏列表，favorite集合
     */
    private List<FavoriteList> favoriteList;

    public List<FavoriteList> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<FavoriteList> favoriteList) {
        this.favoriteList = favoriteList;
    }

    @Override
    public String toString() {
        return "GetFavoritesResultData{" +
                "favoriteList=" + favoriteList +
                '}';
    }
}
