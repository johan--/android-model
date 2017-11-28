package com.tb.wangfang.news.ui.activity;

import android.os.Build;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.FileUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;
import com.tb.wangfang.news.utils.ToastUtil;

import butterknife.BindView;
import es.voghdev.pdfviewpager.library.PDFViewPager;

public class ReadActivity extends SimpleActivity {

    NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();
    @BindView(R.id.pdfView)
    PDFViewPager pdfView;
    private String type;
    private String fileName;

    @Override
    protected int getLayout() {
        return R.layout.activity_read;
    }

    @Override
    protected void initEventAndData() {
        fileName = getIntent().getStringExtra("url");
        type = getIntent().getStringExtra("type");
        if (type.equals("pdf")) {
            openPDF();
        }
    }

    private void openPDF() {
        String inputString = FileUtil.getPrivateFilePath(getFilesDir().getAbsolutePath(), fileName);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            pdfView.initAdapter(this, inputString);
        } else {
            ToastUtil.shortShow("手机暂不支持阅读");
        }
    }
}
