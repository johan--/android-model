package com.tb.wangfang.news.ui.activity;

import android.os.Bundle;
import android.os.Environment;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.FileUtil;
import com.tb.wangfang.news.utils.LogUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

import java.io.File;

public class PdfActivity extends SimpleActivity {
//    @BindView(R.id.pdfView)
//    PDFView pdfview;
    private String TAG = "PdfActivity";
    String fileUrlBase = getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS) + File.separator + "wanfang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayout() {
        return R.layout.content_pdf;
    }

    @Override
    protected void initEventAndData() {
        FileUtil.savePDFFile(this, "about.pdf", "about");
        NDKFileEncryptUtils encryUtils = new NDKFileEncryptUtils();
        File Folder = new File(FileUtil.getFolioPDFEncryFolderPath("about"));
        if (!Folder.exists()) {
            Folder.mkdirs();
        }
        encryUtils.encry(FileUtil.getFolioPDFFilePath("about.pdf", "about"), FileUtil.getFolioPDFEncryFilePath("about"));

        File Folder2 = new File(FileUtil.getFolioPDFDecryFolderPath("about"));
        if (!Folder2.exists()) {
            Folder2.mkdirs();
        }
        encryUtils.decry(FileUtil.getFolioPDFEncryFilePath("about"), FileUtil.getFolioPDFDecryFilePath("about.pdf", "about"));

        File Folder3 = new File(FileUtil.getFolioPDFDecryFolderPath(getFilesDir().getPath(), "about"));
        if (!Folder3.exists()) {
            Folder3.mkdirs();
        }
        encryUtils.decry(FileUtil.getFolioPDFEncryFilePath("about"), FileUtil.getFolioPDFDecryFilePath(getFilesDir().getPath(), "about"));
        File file = new File(FileUtil.getFolioPDFDecryFilePath(getFilesDir().getPath(), "about"));
        if (file.exists()) {
            LogUtil.d("oyu");
        }
    }

}