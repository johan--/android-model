package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.wanfang.read.ReadRequest;
import com.wanfang.read.ReadResponse;
import com.wanfang.read.ReadServiceGrpc;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.sharesdk.onekeyshare.OnekeyShare;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class DocDetailActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.view_stub)
    ViewStub viewStub;
    @BindView(R.id.tv_summary_num)
    TextView tvSummaryNum;
    @BindView(R.id.tv_down_num)
    TextView tvDownNum;
    @BindView(R.id.tv_link_num)
    TextView tvLinkNum;
    @BindView(R.id.tv_reference_num)
    TextView tvReferenceNum;
    @BindView(R.id.ll_num)
    LinearLayout llNum;
    @BindView(R.id.tv_similarity_one)
    TextView tvSimilarityOne;
    @BindView(R.id.tv_similarity_two)
    TextView tvSimilarityTwo;
    @BindView(R.id.tv_similarity_three)
    TextView tvSimilarityThree;
    @BindView(R.id.tv_similarity_four)
    TextView tvSimilarityFour;
    int i = 0;
    private String TAG = "DocDetailActivity";

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_doc_detail;
    }

    @Override
    protected void initEventAndData() {
        initView(i);

    }

    private void initView(int i) {
        viewStub = ((ViewStub) findViewById(R.id.view_stub));
        switch (i) {
            case 0://普通

                viewStub.setLayoutResource(R.layout.frag_article_fruit);
                viewStub.inflate();
//                TextView TvContent = (TextView) findViewById(R.id.tv_content);
//                TvContent.setText(Html.fromHtml("<b>摘要:</b>！China真伟大2001年，互联网尚未在中国老百姓的生活中真正普及时候，28岁的陈天桥却执意要买下一款韩" +
//                        "国的二线网游《传奇》的版权。盛大网络（由陈天桥创立）的投资方中华网惊呆了，认为他在讲一个商业笑话，于是与陈天桥一拍两散，撤回300万美元的风险投资。"));

                break;
            case 1://标准
                viewStub.setLayoutResource(R.layout.frag_article_standard);
                viewStub.inflate();

                break;
            case 2://成果

                break;
            case 3:
                break;
            case 4:
                break;
        }


    }


    @OnClick({R.id.tv_return, R.id.ll_read_online, R.id.ll_collect, R.id.ll_share})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.ll_read_online:
                goRead();
                Intent intent = new Intent(DocDetailActivity.this, PayOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_collect:
                break;
            case R.id.ll_share:
                showShare();
                break;
        }
    }

    private void goRead() {
        Single.create(new SingleOnSubscribe<ReadResponse>() {
            @Override
            public void subscribe(SingleEmitter<ReadResponse> e) throws Exception {
                ReadServiceGrpc.ReadServiceBlockingStub stub = ReadServiceGrpc.newBlockingStub(managedChannel);
                ReadRequest readRequest = ReadRequest.newBuilder().setLanguage("").setLoginToken("").setResourceId("").setUserId("").
                        setSource("").setResourceTitle("").setResourceType("").build();
                ReadResponse readResponse = stub.read(readRequest);
                e.onSuccess(readResponse);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ReadResponse>() {
            @Override
            public void onSuccess(ReadResponse readResponse) {
                Log.d(TAG, "onSuccess: " + readResponse.toString());
                Intent intent = new Intent(DocDetailActivity.this, PayOrderActivity.class);
                startActivity(intent);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }

    private void showShare() {
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // 分享时Notification的图标和文字  2.5.9以后的版本不     调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
        oks.setTitle("分享");
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sharesdk.cn");

        // 启动分享GUI
        oks.show(this);
    }
}
