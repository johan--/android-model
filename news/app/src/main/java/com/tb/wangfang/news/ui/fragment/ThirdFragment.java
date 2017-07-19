package com.tb.wangfang.news.ui.fragment;

import android.graphics.Canvas;
import android.util.Log;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.ThirdContract;
import com.tb.wangfang.news.model.bean.DownInfo;
import com.tb.wangfang.news.presenter.ThirdPresenter;
import com.tb.wangfang.news.utils.NDKFileEncryptUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by tangbin on 2017/5/9.
 */

public class ThirdFragment extends BaseFragment<ThirdPresenter> implements ThirdContract.View {

    List<DownInfo> listData;

    @BindView(R.id.iv_test)
    ImageView ivTest;
    @BindView(R.id.pdfView)
    PDFView pdfview;
    private DownInfo apkApi;
    NDKFileEncryptUtils encryptUtils = new NDKFileEncryptUtils();
    private String TAG = "ThirdFragment";

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
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("http://www.medline.org.cn/ueditor/jsp/upload/file/20170510/1494388974063025511.pdf");
                    HttpURLConnection connection = (HttpURLConnection)
                            url.openConnection();
                    connection.setRequestMethod("GET");//试过POST 可能报错
                    connection.setDoInput(true);
                    connection.setConnectTimeout(10000);
                    connection.setReadTimeout(10000);
                    //实现连接
                    connection.connect();

                    System.out.println("connection.getResponseCode()=" + connection.getResponseCode());
                    if (connection.getResponseCode() == 200) {
                        InputStream is = connection.getInputStream();
                        //这里给过去就行了


                        pdfview.fromAsset("1.5.pdf")
                                // all pages are displayed by default
                                .enableSwipe(true) // allows to block changing pages using swipe
                                .swipeHorizontal(false).enableAntialiasing(false)
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
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

    }

}
