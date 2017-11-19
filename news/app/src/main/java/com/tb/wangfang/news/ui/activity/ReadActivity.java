package com.tb.wangfang.news.ui.activity;

import android.os.Build;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.FileUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

import java.io.File;

import butterknife.BindView;
import es.voghdev.pdfviewpager.library.PDFViewPager;

public class ReadActivity extends SimpleActivity {

    NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();
    @BindView(R.id.pdfView)
    PDFViewPager pdfView;

    @Override
    protected int getLayout() {
        return R.layout.activity_read;
    }

    @Override
    protected void initEventAndData() {
        String url = getIntent().getStringExtra("url");
        open(url);
    }

    private void open(String fileName) {
        String inputString = FileUtil.getFolioPDFEncryFilePath(fileName.replace(".pdf", "").replace(".epub", ""));
        String outputString = FileUtil.getFolioPDFDecryFilePath(getFilesDir().getPath(), fileName.replace(".pdf", "").replace(".epub", ""));
        File folder = new File(FileUtil.getFolioPDFDecryFolderPath(getFilesDir().getPath(), fileName.replace(".pdf", "").replace(".epub", "")));
        if (!folder.exists()) {
            folder.mkdirs();
        }
        File file = new File(outputString);
        if (!file.exists()) {
            encryptUtils.decry(inputString, outputString);
        }
        if (fileName.endsWith("pdf")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                pdfView.initAdapter(this, outputString);
            }

        }
    }
}
