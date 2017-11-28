package com.tb.wangfang.news.ui.fragment;

import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.presenter.ThirdPresenter;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

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


    }

    private void open(String fileName) {
//        String inputString = FileUtil.getFolioPDFEncryFilePath(fileName.replace(".pdf", "").replace(".epub", ""));
//        String outputString = FileUtil.getFolioPDFDecryFilePath(getActivity().getFilesDir().getPath(), fileName.replace(".pdf", "").replace(".epub", ""));
//        File folder = new File(FileUtil.getFolioPDFDecryFolderPath(getActivity().getFilesDir().getPath(), fileName.replace(".pdf", "").replace(".epub", "")));
//        if (!folder.exists()) {
//            folder.mkdirs();
//        }
//        File file = new File(outputString);
//        if (!file.exists()) {
//            encryptUtils.decry(inputString, outputString);
//        }
//        if (fileName.endsWith("pdf")) {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                pdfview.initAdapter(getActivity(), outputString);
//            }
//
//        }
//
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
