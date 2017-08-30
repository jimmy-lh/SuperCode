package com.cyhd.portalmvp.mvp.network;

import rx.Subscriber;

/**
 * Subscribe实现类，简化调用Subscribe的代码
 */
public class CustomSubscriber<T> extends Subscriber<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void onCancel() {
        if (!isUnsubscribed()) {
            unsubscribe();
        }
    }
}
