package com.cyhd.portalmvp.mvp.base;

/**
 * Base of Presenter
 */
public class BasePresenter<V> {

    protected V view;

    public BasePresenter(V view) {
        this.view = view;
    }
}