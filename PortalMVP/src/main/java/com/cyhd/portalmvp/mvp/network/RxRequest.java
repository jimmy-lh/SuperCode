package com.cyhd.portalmvp.mvp.network;

import com.lh.commonclasses.utils.LogUtil;

import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/**
 * 间隔访问工具类
 */
public class RxRequest implements IRxRequest {

    private static final String TAG = "RxRequest";

    private static RxRequest mInstance;

    public static RxRequest getInstance() {
        if (mInstance == null) {
            synchronized (RxRequest.class) {
                if (mInstance == null) {
                    mInstance = new RxRequest();
                }
            }
        }
        return mInstance;
    }

    private RxRequest() {
    }

    /**
     * 普通的访问一次服务器
     *
     * @param <M> 返回的实体类
     */
    public <M> void request(final Observable<M> observable, final Subscriber<M> subscriber) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 访问出错重复count次后，停止访问
     *
     * @param count    错误后重复访问count次
     * @param errDelay 出错后延时errDelay再次访问
     * @param <M>      返回的实体类
     */
    public <M> void request(final int count, final int errDelay, final Observable<M> observable, final Subscriber<M> subscriber) {
        observable
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable
                                .zipWith(Observable.range(1, count), new Func2<Throwable, Integer, Throwable>() {
                                    @Override
                                    public Throwable call(Throwable throwable, Integer integer) {
                                        return throwable;
                                    }
                                })
                                .flatMap(new Func1<Throwable, Observable<?>>() {
                                    @Override
                                    public Observable<?> call(Throwable throwable) {
                                        LogUtil.d(TAG, "限制错误访问次数，异常处理throwable = " + throwable);
                                        return Observable.timer(errDelay, TimeUnit.SECONDS);
                                    }
                                });
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 正常一直循环访问，出错则退出
     * 请求后直接访问一次，然后每隔delay时间访问一次
     *
     * @param delay 每隔多久访问一次，单位秒
     * @param <M>   返回的实体类
     */
    public <M> void request(int delay, final Observable<M> observable, final Subscriber<M> subscriber) {
        observable
                .unsubscribeOn(Schedulers.io())
                .interval(0, delay, TimeUnit.SECONDS)
                .flatMap(new Func1<Long, Observable<M>>() {
                    @Override
                    public Observable<M> call(Long aLong) {
                        return observable;
                    }
                })
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable
                                .flatMap(new Func1<Throwable, Observable<?>>() {
                                    @Override
                                    public Observable<?> call(Throwable throwable) {
                                        LogUtil.d(TAG, "无限循环，异常处理throwable = " + throwable);
                                        return Observable.error(throwable);
                                    }
                                });
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 永久循环访问服务器，正常时每隔delay访问一次，出错后每隔errDelay访问一次，
     * 访问恢复正常，间隔时间又变为delay
     *
     * @param initialDelay 第一次访问延时多久开始；不延时赋值0
     * @param delay        每隔多久访问一次，单位秒
     * @param errDelay     访问错误后，每隔多久访问一次，单位秒
     * @param <M>          返回的实体类
     */
    public <M> void request(long initialDelay, int delay, final int errDelay,
                            final Observable<M> observable, final Subscriber<M> subscriber) {
        observable
                .unsubscribeOn(Schedulers.io())
                .interval(initialDelay, delay, TimeUnit.SECONDS)
                .flatMap(new Func1<Long, Observable<M>>() {
                    @Override
                    public Observable<M> call(Long aLong) {
                        return observable;
                    }
                })
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable
                                .flatMap(new Func1<Throwable, Observable<?>>() {
                                    @Override
                                    public Observable<?> call(Throwable throwable) {
                                        LogUtil.d(TAG, "无限循环，异常处理throwable = " + throwable);
                                        return Observable.timer(errDelay, TimeUnit.SECONDS);
                                    }
                                });
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

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
    public <M> void request(long initialDelay, int delay, final int count, final int errDelay,
                            final Observable<M> observable, final Subscriber<M> subscriber) {
        observable
                .interval(initialDelay, delay, TimeUnit.SECONDS)
                .flatMap(new Func1<Long, Observable<M>>() {
                    @Override
                    public Observable<M> call(Long aLong) {
                        return observable;
                    }
                })
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable
                                .zipWith(Observable.range(1, count), new Func2<Throwable, Integer, Throwable>() {
                                    @Override
                                    public Throwable call(Throwable throwable, Integer integer) {
                                        return throwable;
                                    }
                                })
                                .flatMap(new Func1<Throwable, Observable<?>>() {
                                    @Override
                                    public Observable<?> call(Throwable throwable) {
                                        LogUtil.d(TAG, "正常无限循环，异常限制次数，异常处理throwable = " + throwable);
                                        return Observable.timer(errDelay, TimeUnit.SECONDS);
                                    }
                                });
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

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
    public <M> void request(long initialDelay, long period, final int start, final int count,
                            final int errDelay, final Observable<M> observable, final Subscriber<M> subscriber) {
        observable
                .interval(initialDelay, period, TimeUnit.SECONDS)
                .flatMap(new Func1<Long, Observable<M>>() {
                    @Override
                    public Observable<M> call(Long aLong) {
                        return observable;
                    }
                })
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable
                                .zipWith(Observable.range(start, count), new Func2<Throwable, Integer, Throwable>() {
                                    @Override
                                    public Throwable call(Throwable throwable, Integer integer) {
                                        return throwable;
                                    }
                                })
                                .flatMap(new Func1<Throwable, Observable<?>>() {
                                    @Override
                                    public Observable<?> call(Throwable throwable) {
                                        if (throwable instanceof UnknownHostException) {
                                            //没有网络则直接退出，不再循环访问
                                            return Observable.error(throwable);
                                        }
                                        return Observable.timer(errDelay, TimeUnit.SECONDS);
                                    }
                                });
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    @Override
    public void unsubscribe() {
    }

    @Override
    public boolean isUnsubscribed() {
        return false;
    }
}
