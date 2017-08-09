package com.tb.wangfang.news.model;

import android.util.Log;

import com.folioreader.util.FileUtil;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.tb.wangfang.news.model.bean.DownloadInfo;
import com.tb.wangfang.news.utils.LogUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by tangbin on 2017/7/26.
 */

public class DownloadManager {
    private static final AtomicReference<DownloadManager> INSTANCE = new AtomicReference<>();
    private HashMap<String, Call> downCalls;//用来存放各个下载的请求
    private OkHttpClient mClient;//OKHttpClient;

    //获得一个单例类
    public static DownloadManager getInstance() {
        for (; ; ) {
            DownloadManager current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new DownloadManager();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }

    private DownloadManager() {
        downCalls = new HashMap<>();
        mClient = new OkHttpClient();
    }

    /**
     * 开始下载
     *
     * @param url              下载请求的网址
     * @param downLoadObserver 用来回调的接口
     */
    public void download(final String baseNativeUrl, String url, DownLoadObserver downLoadObserver) {
        Observable.just(url)
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(@NonNull String s) throws Exception {
                        return !downCalls.containsKey(s);
                    }
                })//call的map已经有了,就证明正在下载,则这次不下载
                .flatMap(new Function<String, Observable<DownloadInfo>>() {
                    @Override
                    public Observable<DownloadInfo> apply(@NonNull String s) throws Exception {
                        return Observable.just(createDownInfo(s));
                    }
                })
                .map(new Function<DownloadInfo, DownloadInfo>() {
                    @Override
                    public DownloadInfo apply(@NonNull DownloadInfo downloadInfo) throws Exception {
                        return getRealFileName(baseNativeUrl, downloadInfo);
                    }
                })//检测本地文件夹,生成新的文件名
                .flatMap(new Function<DownloadInfo, Observable<DownloadInfo>>() {
                    @Override
                    public Observable<DownloadInfo> apply(@NonNull DownloadInfo downloadInfo) throws Exception {
                        return Observable.create(new DownloadSubscribe(downloadInfo));
                    }
                })//下载
                .observeOn(AndroidSchedulers.mainThread())//在主线程回调
                .subscribeOn(Schedulers.io())//在子线程执行
                .subscribe(downLoadObserver);//添加观察者

    }

    public void cancel(String url) {
        Call call = downCalls.get(url);
        if (call != null) {
            call.cancel();//取消
        }
        downCalls.remove(url);
    }

    /**
     * 创建DownInfo
     *
     * @param url 请求网址
     * @return DownInfo
     */
    private DownloadInfo createDownInfo(String url) {
        DownloadInfo downloadInfo = new DownloadInfo(url);
        long contentLength = getContentLength(url);//获得文件大小
        downloadInfo.setTotal(contentLength);
        String fileName = url.substring(url.lastIndexOf("/"));
        downloadInfo.setFileName(fileName);
        return downloadInfo;
    }

    private DownloadInfo getRealFileName(String baseNativeUrl, DownloadInfo downloadInfo) {
        String fileName = downloadInfo.getFileName();
        long downloadLength = 0, contentLength = downloadInfo.getTotal();
        File file = new File(FileUtil.getFolioPDFEncryFilePath(fileName.replace(".pdf", "").replace(".epub", "")));
        if (file.exists()) {
            //找到了文件,代表已经下载过,则获取其长度
            downloadLength = file.length();
        }
        //之前下载过,需要重新来一个文件
        int i = 1;
        if (downloadLength > contentLength && contentLength != -1) {
            file.delete();
            downloadLength = 0;
        }
        //设置改变过的文件名/大小
        downloadInfo.setProgress(downloadLength);
        return downloadInfo;
    }

    private class DownloadSubscribe implements ObservableOnSubscribe<DownloadInfo> {
        private DownloadInfo downloadInfo;

        public DownloadSubscribe(DownloadInfo downloadInfo) {
            this.downloadInfo = downloadInfo;
        }

        @Override
        public void subscribe(ObservableEmitter<DownloadInfo> e) throws Exception {
            String url = downloadInfo.getUrl();
            long downloadLength = downloadInfo.getProgress();//已经下载好的长度
            long contentLength = downloadInfo.getTotal();//文件的总长度
            if (contentLength == -1) {
                e.onError(new Error("网络异常"));
                return;
            }
            e.onNext(downloadInfo);
            //初始进度信息
            if (downloadLength == contentLength) {
                e.onComplete();
                return;
            }


            Request request = new Request.Builder()
                    //确定下载的范围,添加此头,则服务器就可以跳过已经下载好的部分
                    .addHeader("RANGE", "bytes=" + downloadLength + "-" + contentLength)
                    .url(url)
                    .build();
            Call call = mClient.newCall(request);
            downCalls.put(url, call);//把这个添加到call里,方便取消
            Response response = call.execute();
            File Folder = new File(FileUtil.getFolioPDFEncryFolderPath(downloadInfo.getFileName().replace(".pdf", "").replace(".epub", "")));
            if (!Folder.exists()) {
                boolean is = Folder.mkdirs();
                LogUtil.d(is + "");
            }
            File file = new File(FileUtil.getFolioPDFEncryFilePath(downloadInfo.getFileName().replace(".pdf", "").replace(".epub", "")));
            InputStream is = null;
            FileOutputStream fileOutputStream = null;
            try {
                is = response.body().byteStream();
                fileOutputStream = new FileOutputStream(file, true);
                byte[] buffer = new byte[2048];//缓冲数组2kB
                int len;
                while ((len = is.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, len);
                    downloadLength += len;
                    downloadInfo.setProgress(downloadLength);
                    e.onNext(downloadInfo);
                }
                fileOutputStream.flush();
                downCalls.remove(url);
            } catch (Exception e1) {
                Log.d("exception", "subscribe: " + e.toString());
            } finally {
                //关闭IO流
                if (is != null) {
                    is.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }


            }
            e.onComplete();//完成
        }
    }

    /**
     * 获取下载长度
     *
     * @param downloadUrl
     * @return
     */
    private long getContentLength(String downloadUrl) {
        Request request = new Request.Builder()
                .url(downloadUrl)
                .build();
        try {
            Response response = mClient.newCall(request).execute();
            if (response != null && response.isSuccessful()) {
                long contentLength = response.body().contentLength();
                return contentLength == 0 ? DownloadInfo.TOTAL_ERROR : contentLength;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return DownloadInfo.TOTAL_ERROR;
    }
}
