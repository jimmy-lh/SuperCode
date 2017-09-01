package com.lh.commonclasses.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TimeChangedReceiver extends BroadcastReceiver {
    private OnTimeChangedListener onTimeChangedListener;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_TIME_TICK)) {
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged();
            }
        }
    }

    public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) {
        this.onTimeChangedListener = onTimeChangedListener;
    }

    public interface OnTimeChangedListener {
        public void onTimeChanged();
    }

}
