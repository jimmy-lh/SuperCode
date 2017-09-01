package com.lh.commonclasses.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public class NetworkConnectChangedReceiver extends BroadcastReceiver {
    public static final String TAG = "NetworkConnectChangedReceiver";

    private onNetworkConnectChangedListener onNetworkConnectChangedListener;

    @Override
    public void onReceive(Context context, Intent intent) {

        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            WifiManager wifiManager = (WifiManager) context
                    .getSystemService(Context.WIFI_SERVICE);
            NetworkInfo lanNetworkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_ETHERNET);
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            int rssi = wifiInfo.getRssi();
            int wifiState = WifiState.WIFI_STATE_DISCONNECT;
            if (rssi == -200) {
                wifiState = WifiState.WIFI_STATE_DISCONNECT;
            } else if (rssi <= 0 && rssi >= -50) {
                wifiState = WifiState.WIFI_STATE_LEVEL_4;
            } else if (rssi < -50 && rssi >= -70) {
                wifiState = WifiState.WIFI_STATE_LEVEL_3;
            } else if (rssi < -70 && rssi >= -80) {
                wifiState = WifiState.WIFI_STATE_LEVEL_2;
            } else if (rssi < -80 && rssi >= -100) {
                wifiState = WifiState.WIFI_STATE_LEVEL_1;
            } else {
                wifiState = WifiState.WIFI_STATE_DISCONNECT;
            }
            if (onNetworkConnectChangedListener != null) {
                onNetworkConnectChangedListener.onEtherNetConnectChanged(lanNetworkInfo);
                onNetworkConnectChangedListener.onWifiConnectChanged(wifiState);
            }
        }
    }

    public interface onNetworkConnectChangedListener {
        void onEtherNetConnectChanged(NetworkInfo lanNetworkInfo);

        void onWifiConnectChanged(int wifiState);
    }

    public void setOnNetworkConnectChangedListener(onNetworkConnectChangedListener onNetworkConnectChangedListener) {
        this.onNetworkConnectChangedListener = onNetworkConnectChangedListener;
    }

    public interface WifiState {
        int WIFI_STATE_DISCONNECT = -200;
        int WIFI_STATE_LEVEL_1 = 1;
        int WIFI_STATE_LEVEL_2 = 2;
        int WIFI_STATE_LEVEL_3 = 3;
        int WIFI_STATE_LEVEL_4 = 4;
    }

}
