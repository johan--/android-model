package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.SimilarPageAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.AutoLinearLayoutManager;
import com.wanfang.collect.CollectRequest;
import com.wanfang.collect.CollectResponse;
import com.wanfang.collect.CollectServiceGrpc;
import com.wanfang.collect.MyCollectConfMessage;
import com.wanfang.collect.MyCollectDegreeMessage;
import com.wanfang.collect.MyCollectDetailRequest;
import com.wanfang.collect.MyCollectDetailResponse;
import com.wanfang.collect.MyCollectPerioMessage;
import com.wanfang.collect.MyCollectSimilarPaperMessage;
import com.wanfang.read.ReadRequest;
import com.wanfang.read.ReadResponse;
import com.wanfang.read.ReadServiceGrpc;
import com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest;
import com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse;
import com.wanfangdata.grpcservice.message.jmessage.SendTextMessageServiceGrpc;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.sharesdk.onekeyshare.OnekeyShare;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import static com.tb.wangfang.news.R.id.tv_summary_num;

public class DocDetailActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.view_stub)
    LinearLayout viewStub;
    @BindView(tv_summary_num)
    TextView tvSummaryNum;
    @BindView(R.id.tv_down_num)
    TextView tvDownNum;
    @BindView(R.id.tv_link_num)
    TextView tvLinkNum;
    @BindView(R.id.tv_reference_num)
    TextView tvReferenceNum;
    @BindView(R.id.ll_num)
    LinearLayout llNum;
    @BindView(R.id.rv_similar)
    RecyclerView rvSimilar;
    @BindView(R.id.sv_all_content)
    ScrollView scrollView;
    MyCollectDetailResponse detailResponse;

    int i = 0;
    private String TAG = "DocDetailActivity";
    private List<MyCollectSimilarPaperMessage> similarPages;
    private String articleId;
    private String articleType;
    private ManagedChannel mChannelSever;
    private MaterialDialog dialog;


    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        mChannelSever = ManagedChannelBuilder.forAddress("10.20.13.179", 8081)
                .usePlaintext(true)
                .build();
        return R.layout.activity_doc_detail;
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void initEventAndData() {
        scrollView.setNestedScrollingEnabled(false);
        articleId = getIntent().getStringExtra(Constants.ARTICLE_ID);
        articleType = getIntent().getStringExtra(Constants.ARTICLE_TYPE);
        dialog = new MaterialDialog.Builder(this).content("加载中...").progress(true, 0).progressIndeterminateStyle(false).build();
        dialog.show();
        getDocDetail(articleId, articleType);

    }

    private void getDocDetail(final String articleId, final String articleType) {
        Single.create(new SingleOnSubscribe<MyCollectDetailResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyCollectDetailResponse> e) throws Exception {
                CollectServiceGrpc.CollectServiceBlockingStub stub = CollectServiceGrpc.newBlockingStub(managedChannel);
                MyCollectDetailRequest request = MyCollectDetailRequest.newBuilder().setArticalId(articleId).setArticalType(articleType).build();
                MyCollectDetailResponse response = stub.getDocDetail(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyCollectDetailResponse>() {
            @Override
            public void onSuccess(MyCollectDetailResponse myCollectDetailResponse) {
                detailResponse = myCollectDetailResponse;
                initView(myCollectDetailResponse.getDetailTypeValue(), myCollectDetailResponse);
                initSimilarPage(myCollectDetailResponse);
                scrollView.setVisibility(View.VISIBLE);
                scrollView.smoothScrollTo(0, 0);
                dialog.dismiss();
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("服务器异常");
                dialog.dismiss();
            }
        });
    }

    private void initSimilarPage(MyCollectDetailResponse myCollectDetailResponse) {
        rvSimilar.setLayoutManager(new AutoLinearLayoutManager(this));
        similarPages = myCollectDetailResponse.getSimilarPapersList();
        final SimilarPageAdapter pageAdapter = new SimilarPageAdapter(similarPages);
        rvSimilar.setAdapter(pageAdapter);
        pageAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(DocDetailActivity.this, DocDetailActivity.class);
                intent.putExtra(Constants.ARTICLE_TYPE, pageAdapter.getData().get(i).getArticalType());
                intent.putExtra(Constants.ARTICLE_ID, pageAdapter.getData().get(i).getArticalId());
                startActivity(intent);
            }
        });


    }

    private void initView(int detailTypeValue, MyCollectDetailResponse myCollectDetailResponse) {
        Any any = myCollectDetailResponse.getCollectDetail();
        LayoutInflater inflater = getLayoutInflater();
        switch (detailTypeValue) {
            case 0://degree
                View view = inflater.inflate(R.layout.frag_article_degree, viewStub, false);
                viewStub.addView(view);
                try {
                    MyCollectDegreeMessage degreeMessage = any.unpack(MyCollectDegreeMessage.class);
                    TextView tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
                    TextView tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
                    TextView tvKeyWord = (TextView) viewStub.findViewById(R.id.tv_key_word);
                    TextView tvAuthor = (TextView) viewStub.findViewById(R.id.tv_author);
                    TextView tvUnitPublish = (TextView) viewStub.findViewById(R.id.tv_unit_publish);
                    TextView tvTeacherName = (TextView) viewStub.findViewById(R.id.tv_teacher_name);
                    TextView tvTime = (TextView) viewStub.findViewById(R.id.tv_time);
                    tvTitle.setText(myCollectDetailResponse.getTitle());
                    tvContent.setText(myCollectDetailResponse.getSummary());
                    tvKeyWord.setText(myCollectDetailResponse.getKeywords());
                    tvAuthor.setText(myCollectDetailResponse.getAuthorsName());
                    tvUnitPublish.setText(degreeMessage.getDeunitName());
                    tvTeacherName.setText(degreeMessage.getMajorName());
                    tvTime.setText(degreeMessage.getPublishYear());
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                break;
            case 1://会议
                View view_meeting = inflater.inflate(R.layout.frag_article_meeting, viewStub, false);
                viewStub.addView(view_meeting);
                try {
                    MyCollectConfMessage confMessage = any.unpack(MyCollectConfMessage.class);
                    TextView tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
                    TextView tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
                    TextView tvKeyWord = (TextView) viewStub.findViewById(R.id.tv_key_word);
                    TextView tvAuthor = (TextView) viewStub.findViewById(R.id.tv_author);
                    TextView tvMettingName = (TextView) viewStub.findViewById(R.id.tv_meeting_name);
                    TextView tvMeetingSity = (TextView) viewStub.findViewById(R.id.tv_meeting_sity);
                    TextView tvPublishMetting = (TextView) viewStub.findViewById(R.id.tv_publish_meeting);
                    tvTitle.setText(myCollectDetailResponse.getTitle());
                    tvContent.setText(myCollectDetailResponse.getSummary());
                    tvKeyWord.setText(myCollectDetailResponse.getKeywords());
                    tvAuthor.setText(myCollectDetailResponse.getAuthorsName());
                    tvMettingName.setText(confMessage.getConfName());
                    tvMeetingSity.setText(confMessage.getPublishPlace());
                    tvPublishMetting.setText(confMessage.getHostunitName());
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                break;
            case 2://PERIO_TYPE_VALUE
                View view_pro = inflater.inflate(R.layout.frag_article, viewStub, false);
                viewStub.addView(view_pro);
                try {
                    MyCollectPerioMessage myCollectPerioMessage = any.unpack(MyCollectPerioMessage.class);
                    TextView tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
                    TextView tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
                    TextView tvAuthor = (TextView) viewStub.findViewById(R.id.tv_author);
                    TextView tvUnit = (TextView) viewStub.findViewById(R.id.tv_unit);
                    TextView tvKeyWord = (TextView) viewStub.findViewById(R.id.tv_key_word);
                    TextView tvMagazine = (TextView) viewStub.findViewById(R.id.tv_magazine);
                    TextView tvTime = (TextView) viewStub.findViewById(R.id.tv_time);
                    tvTitle.setText(myCollectDetailResponse.getTitle());
                    tvContent.setText(myCollectDetailResponse.getSummary());
                    tvAuthor.setText(myCollectDetailResponse.getAuthorsName());
                    tvUnit.setText(myCollectPerioMessage.getAuthorsUnit());
                    tvKeyWord.setText(myCollectDetailResponse.getKeywords());
                    tvMagazine.setText(myCollectPerioMessage.getPerioTitle());
                    tvTime.setText(myCollectPerioMessage.getPublishYear());
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                break;
            case 4:
                break;
        }
        tvSummaryNum.setText("文摘阅读 : " + myCollectDetailResponse.getFulltextReadingNum());
        tvDownNum.setText("下载 : " + myCollectDetailResponse.getDownloadNum());
        tvLinkNum.setText("第三方链接 : " + myCollectDetailResponse.getThirdpartyLinksNum());
        tvReferenceNum.setText("被应用 : " + myCollectDetailResponse.getCiteNum());

    }

    @OnClick({R.id.tv_return, R.id.ll_read_online, R.id.ll_collect, R.id.ll_share})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.ll_read_online:
                goRead();
                break;
            case R.id.ll_collect:
                collectPro();
                break;
            case R.id.ll_share:
                sendJPush();
                showShare();
                break;
        }
    }

    private void sendJPush() {
        final byte[] appkey = Base64.encode(Constants.JMESSAGE_APP_KEY.getBytes(), Base64.DEFAULT);
        final byte[] masterSecret = Base64.encode(Constants.JMESSAGE_MASTER_SECRET.getBytes(), Base64.DEFAULT);
        Single.create(new SingleOnSubscribe<SendTextMessageResponse>() {
            @Override
            public void subscribe(SingleEmitter<SendTextMessageResponse> e) throws Exception {
                SendTextMessageServiceGrpc.SendTextMessageServiceBlockingStub stub = SendTextMessageServiceGrpc.newBlockingStub(mChannelSever);
                SendTextMessageRequest request = SendTextMessageRequest.newBuilder().setAppKey(new String(appkey)).setMasterSecret(new String(masterSecret)).setText("nihao").setTargetType("single").setTargetId("tangbin")
                        .setFromType("admin").setFromId("admin").setNoNotification(true).build();
                SendTextMessageResponse response = stub.sendTextMessageByTargetId(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SendTextMessageResponse>() {
            @Override
            public void onSuccess(SendTextMessageResponse sendTextMessageResponse) {
                Log.d(TAG, "onSuccess: " + sendTextMessageResponse.toString());
                if (!TextUtils.isEmpty(sendTextMessageResponse.getMessageId())) {
                    Log.d(TAG, "onSuccess: 分享推送成功");
                } else {
                    Log.d(TAG, "onSuccess: 分享推送失败");
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }

    private void collectPro() {
        Single.create(new SingleOnSubscribe<CollectResponse>() {
            @Override
            public void subscribe(SingleEmitter<CollectResponse> e) throws Exception {
                CollectServiceGrpc.CollectServiceBlockingStub stub = CollectServiceGrpc.newBlockingStub(managedChannel);
                CollectRequest collectRequest = CollectRequest.newBuilder().setDocId(articleId).setDocType(articleType).setUserId(preferencesHelper.getUserId()).build();
                CollectResponse response = stub.collect(collectRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<CollectResponse>() {
            @Override
            public void onSuccess(CollectResponse collectResponse) {
                Log.d(TAG, "onSuccess: " + collectResponse.toString());
                if (collectResponse.getCollectSuccess()) {
                    ToastUtil.show("添加收藏成功");
                } else {
                    ToastUtil.show("添加收藏失败");
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private void goRead() {
        Single.create(new SingleOnSubscribe<ReadResponse>() {
            @Override
            public void subscribe(SingleEmitter<ReadResponse> e) throws Exception {
                ReadServiceGrpc.ReadServiceBlockingStub stub = ReadServiceGrpc.newBlockingStub(managedChannel);
                ReadRequest readRequest = ReadRequest.newBuilder().setLanguage(detailResponse.getLanguage()).setLoginToken(preferencesHelper.getLoginToken()).
                        setResourceId(detailResponse.getResourceId()).setUserId(preferencesHelper.getUserId()).setSource(detailResponse.getResourceDb()).setResourceTitle(detailResponse.getTitle())
                        .setResourceType(detailResponse.getClassType()).build();
                ReadResponse readResponse = stub.read(readRequest);
                e.onSuccess(readResponse);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ReadResponse>() {
            @Override
            public void onSuccess(ReadResponse readResponse) {
                Log.d(TAG, "onSuccess: " + readResponse.toString());
                Intent intent = new Intent(DocDetailActivity.this, PayOrderActivity.class);
                intent.putExtra("response", readResponse);
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
