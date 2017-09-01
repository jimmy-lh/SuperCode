package com.lh.commonclasses.retrofit2rxjava.network;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created on 2017/7/13.
 */
public interface IRxRequest extends Subscription {

    /**
     * 普通的访问一次服务器
     *
     * @param <M> 返回的实体类
     */
    <M> void request(final Observable<M> observable, final Subscriber<M> subscriber);

    /**
     * 访问出错重复count次后，停止访问
     *
     * @param count    错误后重复访问count次
     * @param errDelay 出错后延时errDelay再次访问
     * @param <M>      返回的实体类
     */
    <M> void request(final int count, final int errDelay, final Observable<M> observable, final Subscriber<M> subscriber);

    /**
     * 正常一直循环访问，出错则退出
     * 请求后直接访问一次，然后每隔delay时间访问一次
     *
     * @param delay 每隔多久访问一次，单位秒
     * @param <M>   返回的实体类
     */
    <M> void request(int delay, final Observable<M> observable, final Subscriber<M> subscriber);

    /**
     * 永久循环访问服务器，正常时每隔delay访问一次，出错后每隔errDelay访问一次，
     * 访问恢复正常，间隔时间又变为delay
     *
     * @param initialDelay 第一次访问延时多久开始；不延时赋值0
     * @param delay        每隔多久访问一次，单位秒
     * @param errDelay     访问错误后，每隔多久访问一次，单位秒
     * @param <M>          返回的实体类
     */
    <M> void request(long initialDelay, int delay, final int errDelay,
                     final Observable<M> observable, final Subscriber<M> subscriber);

    /**
     * 循环访问服务器，出错后最多重复count次，仍然不行则不再访问;
     * 正常时每隔delay访问一次，出错后每隔errDelay访问一次，
     * 访问恢复正常，间隔时间又变为delay
     *
     * @param initialDelay 第一次访问延时多久开始；不延时赋值0
     * @param delay        每隔多久访问一次，单位秒
     * @param count        错误后重复访问count次
     * @param errDelay     访问错误后，每隔多久访问一次，单位秒
     * @param <M>          返回的实体类
     */
    <M> void request(long initialDelay, int delay, final int count, final int errDelay,
                     final Observable<M> observable, final Subscriber<M> subscriber);

    /**
     * 这个方法暂时不要使用
     *
     * @param initialDelay 第一次访问延时多久开始；不延时赋值0
     * @param period       循环访问的间隔时间；此处单位是秒，可以改
     * @param start        count从start整型开始；值必须大于等于0
     * @param count        错误后重复访问count次
     * @param errDelay     访问错误后，等待多久再次访问；单位秒
     * @param <M>          访问网络获得的实体类
     */
    <M> void request(long initialDelay, long period, final int start, final int count,
                     final int errDelay, final Observable<M> observable, final Subscriber<M> subscriber);
}
