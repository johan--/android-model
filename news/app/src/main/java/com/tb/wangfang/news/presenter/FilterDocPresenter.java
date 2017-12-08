package com.tb.wangfang.news.presenter;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.ViewGroup;

import com.afollestad.materialdialogs.MaterialDialog;
import com.google.gson.Gson;
import com.tb.wangfang.news.base.RxPresenter;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.bean.SearchFilterListBean;
import com.tb.wangfang.news.model.bean.SearchReplyBean;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.activity.PayOrderActivity;
import com.tb.wangfang.news.ui.activity.ReadActivity;
import com.tb.wangfang.news.utils.FileUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;
import com.tb.wangfang.news.utils.SnackbarUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.wanfang.read.GetResourceFileRequest;
import com.wanfang.read.GetResourceFileResponse;
import com.wanfang.read.ReadRequest;
import com.wanfang.read.ReadResponse;
import com.wanfang.read.ReadServiceGrpc;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.inject.Inject;

import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import static com.tb.wangfang.news.app.Constants.SEARCH_LIST_CONTENT;
import static com.tb.wangfang.news.app.Constants.SEARCH_LIST_NAVIGATION;
import static com.tb.wangfang.news.utils.FileUtil.getEncryFolderPath;

/**
 * Created by tangbin on 2017/5/25.
 */

public class FilterDocPresenter extends RxPresenter<FilterDocContract.View> implements FilterDocContract.Presenter {
    private ManagedChannel managedChannel;
    private String TAG = "FilterDocPresenter";

    private ImplPreferencesHelper preferencesHelper;
    private String fileName;
    private MaterialDialog dialog;
    private String fileType;

    @Inject
    public FilterDocPresenter(ManagedChannel managedChannel, ImplPreferencesHelper preferencesHelper) {
        this.managedChannel = managedChannel;
        this.preferencesHelper = preferencesHelper;

    }


    @Override
    public void search(String text, int page, String navigation, String startTime, String endTime, String sort) {
        OkHttpUtils
                .get()
                .url(SEARCH_LIST_CONTENT)
                .addParams("params", "标题:" + text)
                .addParams("page", String.valueOf(page)).addParams("pageSize", 20 + "")
                .addParams("navigation", navigation)
                .addParams("startDate", startTime)
                .addParams("endDate", endTime)
                .addParams("sortField", sort)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if ("{}".equals(response)) {
                            mView.loadSearchContent(null);
                        } else {
                            Log.d(TAG, "onResponse: " + response);
                            Gson gson = new Gson();
                            SearchReplyBean searchReplyBean = gson.fromJson(response, SearchReplyBean.class);
                            if (mView != null) {
                                mView.loadSearchContent(searchReplyBean);
                            }

                        }

                    }

                });
    }

    @Override
    public void searchNavigation(String params, String navigation, String startDate, String endDate) {
        OkHttpUtils
                .get()
                .url(SEARCH_LIST_NAVIGATION)
                .addParams("params", "标题:" + params)
                .addParams("navigation", navigation).addParams("startDate", startDate).addParams("endDate", endDate)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if ("{}".equals(response)) {
                            mView.loadFilterView(null);
                        } else {
                            Log.d(TAG, "onResponse: " + response);
                            Gson gson = new Gson();
                            SearchFilterListBean searchFilterListBean = gson.fromJson(response, SearchFilterListBean.class);
                            if (mView != null) {
                                mView.loadFilterView(searchFilterListBean);
                            }

                        }

                    }

                });
    }

    @Override
    public void goRead(final String id, final String type, final String author, final String journal, final String time, final Activity context) {
        dialog = new MaterialDialog.Builder(context).content("加载中...").progress(true, 0).progressIndeterminateStyle(false).build();
        dialog.show();
        final long s = System.currentTimeMillis();
        Single.create(new SingleOnSubscribe<ReadResponse>() {
            @Override
            public void subscribe(SingleEmitter<ReadResponse> e) throws Exception {
                ReadServiceGrpc.ReadServiceBlockingStub stub = ReadServiceGrpc.newBlockingStub(managedChannel);
                ReadRequest readRequest = ReadRequest.newBuilder().setLoginToken(preferencesHelper.getLoginToken()).
                        setResourceId(id).setUserId(preferencesHelper.getUserId())
                        .setResourceType(type).build();
                ReadResponse readResponse = stub.read(readRequest);
                e.onSuccess(readResponse);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ReadResponse>() {
            @Override
            public void onSuccess(final ReadResponse readResponse) {
                Log.d(TAG, "onSuccess: readResponse" + readResponse);
                if (!readResponse.hasError()) {
                    if (readResponse.getAlreadyBuy()) {
                        new RxPermissions(context).request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                                .subscribe(new Consumer<Boolean>() {
                                    @Override
                                    public void accept(@NonNull Boolean granted) throws Exception {
                                        if (granted) {
                                            getDocResource(context, id, type);

                                        } else {
                                            SnackbarUtil.show(((ViewGroup) context.findViewById(android.R.id.content)).getChildAt(0), "阅读需要文件存储权限~");
                                        }
                                    }
                                });


                    } else if (readResponse.getHasTradePower()) {
                        dialog.dismiss();
                        Intent intent = new Intent(context, PayOrderActivity.class);
                        intent.putExtra("response", readResponse);
                        intent.putExtra("type", type);


                        intent.putExtra("author", author);
                        intent.putExtra("journal", journal);
                        intent.putExtra("time", time);

                        context.startActivity(intent);


                    }
                } else {
                    dialog.dismiss();
                    ToastUtil.show(readResponse.getError().getErrorMessage().getErrorReason());
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private void getDocResource(final Activity activity, final String articleId, final String articleType) {
        Single.create(new SingleOnSubscribe<Iterator<GetResourceFileResponse>>() {
            @Override
            public void subscribe(SingleEmitter<Iterator<GetResourceFileResponse>> e) throws Exception {
                ReadServiceGrpc.ReadServiceBlockingStub stub = ReadServiceGrpc.newBlockingStub(managedChannel);
                GetResourceFileRequest getResourceFileRequest = GetResourceFileRequest.newBuilder().setResourceId(articleId).setResourceType(articleType).build();
                Iterator<GetResourceFileResponse> getResourceFileResponse = stub.getResourceFile(getResourceFileRequest);
                e.onSuccess(getResourceFileResponse);
            }
        }).map(new Function<Iterator<GetResourceFileResponse>, Boolean>() {
            @Override
            public Boolean apply(@NonNull Iterator<GetResourceFileResponse> getResourceFileResponseIterator) throws Exception {
                boolean b = dwon(activity, getResourceFileResponseIterator);
                return b;
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<Boolean>() {
            @Override
            public void onSuccess(final Boolean b) {
                Log.d(TAG, "onSuccess: getDocResource" + b);
                dialog.dismiss();
                if (b) {
                    Intent intent = new Intent(activity, ReadActivity.class);
                    intent.putExtra("url", fileName);
                    intent.putExtra("type", fileType);
                    activity.startActivity(intent);

                } else {
                    ToastUtil.shortShow("下载失败");
                }


            }


            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private boolean dwon(Activity activity, Iterator<GetResourceFileResponse> getResourceFileResponse) {
        String privateBase = activity.getFilesDir().getAbsolutePath();
        FileOutputStream fileOutputStream = null;
        NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();

        boolean on_of = true;

        String encryString = "";
        String privateString = "";
        while (getResourceFileResponse.hasNext()) {
            GetResourceFileResponse resourceFrag = getResourceFileResponse.next();
            if (on_of && resourceFrag.getTotalByteLength() == 0) {
                return false;
            }
            if (on_of) {
                fileName = resourceFrag.getFileName();
                String[] s = fileName.split("\\.");
                fileType = "";
                if (s.length == 2) {
                    fileType = s[1];
                }
                encryString = FileUtil.getEncryFilePath(fileName);
                privateString = FileUtil.getPrivateFilePath(privateBase, fileName);
                File Folder = new File(FileUtil.getPrivateFolder(privateBase, fileName));
                File encryFolder = new File(getEncryFolderPath(fileName));
                if (!Folder.exists()) {
                    Folder.mkdirs();
                }
                if (!encryFolder.exists()) {
                    encryFolder.mkdirs();
                }

            }


            //
            if (on_of && FileUtil.checkIsExist(fileName, resourceFrag.getTotalByteLength())) {
                encryptUtils.decry(encryString, privateString);
                return true;
            }


            File privateFile = new File(privateString);
            if (on_of && privateFile.exists()) {
                privateFile.delete();
            }
            on_of = false;
            InputStream is = resourceFrag.getFileByte().newInput();


            try {
                if (fileOutputStream == null) {
                    fileOutputStream = new FileOutputStream(privateString, true);
                }
                byte[] buffer = new byte[2048];//缓冲数组2kB
                int len;
                while ((len = is.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, len);
                }
                fileOutputStream.flush();
                //加密写到encry文件中


            } catch (Exception e) {
                e.printStackTrace();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return false;
            } finally {
                //关闭IO流
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        encryptUtils.encry(privateString, encryString);
        if (fileOutputStream != null)

        {
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return true;
    }
}
