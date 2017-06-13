package com.tb.wangfang.news.ui.activity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;

import com.folioreader.util.FileUtil;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.litesuits.common.utils.SdCardUtil;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.LogUtil;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

import java.io.File;

import butterknife.BindView;

public class PdfActivity extends SimpleActivity {
    @BindView(R.id.pdfView)
    PDFView pdfview;
    private String TAG = "PdfActivity";
    String fileUrlBase = SdCardUtil.getNormalSDCardPath() + File.separator + "wanfang";

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
        encryUtils.encry(FileUtil.getFolioPDFFilePath("about.pdf", "about"), FileUtil.getFolioPDFEncryFilePath("about.pdf", "about"));

        File Folder2 = new File(FileUtil.getFolioPDFDecryFolderPath("about"));
        if (!Folder2.exists()) {
            Folder2.mkdirs();
        }
        encryUtils.decry(FileUtil.getFolioPDFEncryFilePath("about.pdf", "about"), FileUtil.getFolioPDFDecryFilePath("about.pdf", "about"));

        File Folder3 = new File(FileUtil.getFolioPDFDecryFolderPath(getFilesDir().getPath(), "about"));
        if (!Folder3.exists()) {
            Folder3.mkdirs();
        }
        encryUtils.decry(FileUtil.getFolioPDFEncryFilePath("about.pdf", "about"), FileUtil.getFolioPDFDecryFilePath(getFilesDir().getPath(), "about.pdf", "about"));
        File file=new File(FileUtil.getFolioPDFDecryFilePath(getFilesDir().getPath(), "about.pdf", "about"));
        if (file.exists()){
            LogUtil.d("oyu");
        }
        pdfview.fromAsset("about.pdf")
                // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .onDraw(new OnDrawListener() {
                    @Override
                    public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {
                        Log.d(TAG, "onLayerDrawn: " + "pagewidth" + pageWidth + " pageHeight" + pageHeight + " displayedPage" + displayedPage);
                    }
                }) // allows to draw something on a provided canvas, above the current page
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        Log.d(TAG, "loadComplete: nbPages" + nbPages);
                    }
                }) // called after document is loaded and starts to be rendered
                .onPageChange(new OnPageChangeListener() {
                    @Override
                    public void onPageChanged(int page, int pageCount) {
                        Log.d(TAG, "onPageChanged: page" + page + "pageCount" + pageCount);
                    }
                })
                .onPageScroll(new OnPageScrollListener() {
                    @Override
                    public void onPageScrolled(int page, float positionOffset) {
                        Log.d(TAG, "onPageScrolled: page" + page + "positionOffset " + positionOffset);
                    }
                })
                .onError(new OnErrorListener() {
                    @Override
                    public void onError(Throwable t) {

                    }
                })
                .onRender(new OnRenderListener() {
                    @Override
                    public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {
                        Log.d(TAG, "onInitiallyRendered: nbPages" + nbPages + "pageWidth" + pageWidth + "pageHeight" + pageHeight);
                    }
                }) // called after document is rendered for the first time
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                .load();
    }

}