package com.tb.wangfang.news.ui.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.Glide;
import com.folioreader.util.FileUtil;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.model.DataManager;
import com.tb.wangfang.news.model.bean.DownInfo;
import com.tb.wangfang.news.model.bean.DownState;
import com.tb.wangfang.news.model.http.DownLoadListener.HttpDownOnNextListener;
import com.tb.wangfang.news.model.http.HttpDownManager;
import com.tb.wangfang.news.presenter.ThirdPresenter;
import com.tb.wangfang.news.utils.LogUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdFragment extends BaseFragment<ThirdPresenter> implements ThirdContract.View {
    @Inject
    DataManager mDataManager;
    List<DownInfo> listData;
    HttpDownManager manager;
    @BindView(R.id.iv_test)
    ImageView ivTest;
    Unbinder unbinder;
    private DownInfo apkApi;
    NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();

    public static ThirdFragment newInstance() {
        ThirdFragment fragment = new ThirdFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_third;
    }

    @Override
    protected void initEventAndData() {

    }


    @Override
    public void showUpdateDialog(String versionContent) {

    }

    @Override
    public void startDownloadService() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @OnClick(R.id.btn_down)
    public void down() {
        String url = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
        manager = HttpDownManager.getInstance(mDataManager);
        File Folder = new File(FileUtil.getFolioPDFDecryFolderPath(getActivity().getFilesDir().getPath(), "about"));
        if (!Folder.exists()) {
            Folder.mkdirs();
        }


        apkApi = mDataManager.queryDownBy(url);

        if (apkApi == null) {
            File outputFile = new File(FileUtil.getFolioPDFEncryFilePath("about.pdf", "about"));
            apkApi = new DownInfo(url);
            apkApi.setState(DownState.START);
            apkApi.setSavePath(outputFile.getAbsolutePath());
            apkApi.setBookName("about");
            mDataManager.save(apkApi);
            apkApi.setListener(httpDownOnNextListener);
            manager.startDown(apkApi, mDataManager);
        } else if (apkApi.getState() == DownState.FINISH) {
            encryptUtils.decry(apkApi.getSavePath(), FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), apkApi.getBookName(), apkApi.getBookName()));
            File file = new File(FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), apkApi.getBookName(), apkApi.getBookName()));
            if (file.exists()) {
                Glide.with(getActivity()).load(FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), apkApi.getBookName(), apkApi.getBookName())).into(ivTest);
            }
        } else {
            apkApi.setListener(httpDownOnNextListener);
            manager.startDown(apkApi, mDataManager);
        }


    }

    private MaterialDialog materialDialog;
    HttpDownOnNextListener httpDownOnNextListener = new HttpDownOnNextListener() {
        @Override
        public void onNext(Object o) {

        }

        @Override
        public void onStart() {
            materialDialog = new MaterialDialog.Builder(getActivity())
                    .title("下载中")
                    .content("请等待")
                    .contentGravity(GravityEnum.CENTER)
                    .progress(false, 150, true)
                    .cancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public void onCancel(DialogInterface dialog) {
                            LogUtil.d("被取消了");
                        }
                    }).cancelable(false)
//                    .showListener(new DialogInterface.OnShowListener() {
//                        @Override
//                        public void onShow(DialogInterface dialog) {
//                            final MaterialDialog materialDialog = (MaterialDialog) dialog;
//                            startThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    startThread(new Runnable() {
//                                        @Override
//                                        public void run() {
//                                            while (materialDialog.getCurrentProgress() != materialDialog.getMaxProgress()
//                                                    && !Thread.currentThread().isInterrupted()) {
//                                                if (materialDialog.isCancelled()) {
//                                                    break;
//                                                }
//                                                try {
//                                                    Thread.sleep(50);
//                                                } catch (InterruptedException e) {
//                                                    break;
//                                                }
//                                                materialDialog.incrementProgress(1);
//                                            }
//                                            runOnUiThread(
//                                                    () -> {
//                                                        thread = null;
//                                                        materialDialog.setContent(getString(R.string.md_done_label));
//                                                    });
//                                        }
//                                    });
//                                }
//                            });
//                        }
//                    })
                    .show();
        }

        @Override
        public void onComplete() {
            materialDialog.dismiss();
            encryptUtils.decry(apkApi.getSavePath(), FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), apkApi.getBookName(), apkApi.getBookName()));
            Glide.with(getActivity()).load(FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), apkApi.getBookName(), apkApi.getBookName())).into(ivTest);
        }

        @Override
        public void updateProgress(long readLength, long countLength) {
            materialDialog.incrementProgress((int) (readLength * 150 / countLength));
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
