package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;

/**
 * Created on 2017/7/12.
 */
public class GetItemDataResultData implements Serializable {

    private AssetData assetData;

    public AssetData getAssetData() {
        return assetData;
    }

    public void setAssetData(AssetData assetData) {
        this.assetData = assetData;
    }

    @Override
    public String toString() {
        return "GetItemDataResultData{" +
                "assetData=" + assetData +
                '}';
    }
}
