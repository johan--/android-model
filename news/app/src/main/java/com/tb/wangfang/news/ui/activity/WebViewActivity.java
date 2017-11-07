package com.tb.wangfang.news.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WebViewActivity extends SimpleActivity {

    private static final String INTENT_URL = "intent_start_url";
    private static final String INTENT_TITLE = "intent_start_title";

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.wbview)
    WebView mWebview;

    @Override
    protected int getLayout() {
        return R.layout.activity_web_view;
    }

    @Override
    protected void initEventAndData() {
        mWebview = setWebView(mWebview);
        initIntent();
    }

    public static void startThisFromActivity(Activity act, String url, String title, String type) {
        Intent intent = new Intent(act, WebViewActivity.class);
        intent.putExtra(INTENT_URL, url);
        intent.putExtra(INTENT_TITLE, title);
        intent.putExtra("type", type);
        act.startActivity(intent);
    }

    private WebView setWebView(WebView mWebView) {
        mWebview.setWebChromeClient(new WebChromeClient() {

        });
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("alipays://")) {
                    return true;
                }
                view.loadUrl(url);
                return true;
            }
        });
        // 设置使用本地储存以支持LocalStorage
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setAppCacheMaxSize(1024 * 1024 * 8);
        String appCachePath = getApplicationContext().getCacheDir().getAbsolutePath();
        mWebView.getSettings().setAppCachePath(appCachePath);
        mWebView.getSettings().setAllowFileAccess(true);
        mWebView.getSettings().setAppCacheEnabled(true);
        //屏幕自适应
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setUseWideViewPort(true);//设置此属性，可任意比例缩放
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setDefaultTextEncodingName("utf-8");
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);//不加上白边
        if (Build.VERSION.SDK_INT >= 19) {
            mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        }
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        mWebView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //播放swf
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            settings.setMediaPlaybackRequiresUserGesture(true);
        }
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        mWebView.setBackgroundColor(0);

        //自适应屏幕
        mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

//        mWebView.addJavascriptInterface(new SharePrescriptionThisActivityJs(), "finish");
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int mDensity = metrics.densityDpi;
        if (mDensity == 240) {
            mWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        } else if (mDensity == 160) {
            mWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);

        } else if (mDensity == 120) {
            mWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.CLOSE);

        } else if (mDensity == DisplayMetrics.DENSITY_XHIGH) {
            mWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        } else if (mDensity == DisplayMetrics.DENSITY_TV) {
            mWebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        }

        return mWebView;
    }

    private void initIntent() {
        Intent inten = getIntent();
        String url = inten.getStringExtra(INTENT_URL);
        if (url != null && url.length() != 0) {
            mWebview.loadUrl(url);
        }

        String title = inten.getStringExtra(INTENT_TITLE);
        if (!TextUtils.isEmpty(title)) {
            tvTitle.setText(title);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mWebview != null) {
            mWebview.destroy();
        }
        mWebview = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}
