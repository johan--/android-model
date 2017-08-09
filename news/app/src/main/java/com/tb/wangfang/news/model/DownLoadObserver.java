package com.tb.wangfang.news.model;

import com.tb.wangfang.news.model.bean.DownloadInfo;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by tangbin on 2017/7/26.
 */

public abstract  class DownLoadObserver implements Observer<DownloadInfo> {
    protected Disposable d;//可以用于取消注册的监听者
    protected DownloadInfo downloadInfo;
    @Override
    public void onSubscribe(Disposable d) {
        this.d = d;
    }

    @Override
    public void onNext(DownloadInfo downloadInfo) {
        this.downloadInfo = downloadInfo;
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }

}
