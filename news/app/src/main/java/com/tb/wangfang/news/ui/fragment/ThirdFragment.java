package com.tb.wangfang.news.ui.fragment;

import android.content.DialogInterface;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.folioreader.util.FileUtil;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.model.DownLoadObserver;
import com.tb.wangfang.news.model.DownloadManager;
import com.tb.wangfang.news.model.bean.DownloadInfo;
import com.tb.wangfang.news.presenter.ThirdPresenter;
import com.tb.wangfang.news.utils.LogUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;
import es.voghdev.pdfviewpager.library.PDFViewPager;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdFragment extends BaseFragment<ThirdPresenter> implements ThirdContract.View {

    @BindView(R.id.iv_test)
    ImageView ivTest;
    @BindView(R.id.pdfView)
    PDFViewPager pdfview;

    NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();
    private String TAG = "ThirdFragment";

    private Thread thread;

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

    private MaterialDialog materialDialog;


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

        materialDialog = new MaterialDialog.Builder(getActivity())
                .title("下载中")
                .content("请等待")
                .contentGravity(GravityEnum.CENTER)
                .progress(false, 100, true)
                .cancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        LogUtil.d("被取消了");
                    }
                }).cancelable(false)
                .showListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog) {
//                        final MaterialDialog materialDialog = (MaterialDialog) dialog;
//                        materialDialog.setProgress((int) (value.getProgress() / value.getTotal()));
                    }
                }).show();
        DownloadManager.getInstance().download(getActivity().getFilesDir().getAbsolutePath(), "http://www.medline.org.cn/ueditor/jsp/upload/file/20170510/1494388974063025511.pdf", new DownLoadObserver() {
            @Override
            public void onNext(final DownloadInfo value) {
                super.onNext(value);
                Log.d(TAG, "onNext: " + value.getProgress());
                materialDialog.setProgress((int) (value.getProgress() / value.getTotal()));
                materialDialog.incrementProgress((int) (value.getProgress() * 100 / value.getTotal()));
            }

            @Override
            public void onComplete() {

                if (downloadInfo != null) {
                    Toast.makeText(getActivity(),
                            downloadInfo.getFileName() + "-DownloadComplete",
                            Toast.LENGTH_SHORT).show();
                    open(downloadInfo.getFileName());
                }
                materialDialog.dismiss();
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                Toast.makeText(getActivity(), "网络异常", Toast.LENGTH_SHORT).show();
                materialDialog.dismiss();
            }
        });
    }

    private void open(String fileName) {
        String inputString = FileUtil.getFolioPDFEncryFilePath(fileName.replace(".pdf", "").replace(".epub", ""));
        String outputString = FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), fileName.replace(".pdf", "").replace(".epub", ""));
        File folder = new File(FileUtil.getFolioPDFDecryFolderPath(getActivity().getFilesDir().getPath(), fileName.replace(".pdf", "").replace(".epub", "")));
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File file = new File(outputString);
        if (!file.exists()) {
            encryptUtils.decry(inputString, outputString);
        }
        if (fileName.endsWith("pdf")) {
            pdfview.initAdapter(getActivity(), outputString);
        }

    }

//    private MaterialDialog materialDialog;
//    HttpDownOnNextListener httpDownOnNextListener = new HttpDownOnNextListener() {
//        @Override
//        public void onNext(Object o) {
//
//        }
//
//        @Override
//        public void onStart() {

//        }
//
//        @Override
//        public void onComplete() {
//
//        }
//
//        @Override
//        public void updateProgress(long readLength, long countLength) {
//
//        }

}
