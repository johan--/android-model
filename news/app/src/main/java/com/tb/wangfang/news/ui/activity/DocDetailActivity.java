package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
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
import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.bean.ConfArticle;
import com.tb.wangfang.news.model.bean.DegreeArticleBean;
import com.tb.wangfang.news.model.bean.LegisBean;
import com.tb.wangfang.news.model.bean.PatentElementBean;
import com.tb.wangfang.news.model.bean.PerioArticelBean;
import com.tb.wangfang.news.model.bean.RelatePapers;
import com.tb.wangfang.news.model.bean.StandardsBean;
import com.tb.wangfang.news.model.bean.TechResultBean;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.SimilarPageAdapter;
import com.tb.wangfang.news.utils.FileUtil;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.AutoLinearLayoutManager;
import com.wanfang.collect.CancelCollectReqeust;
import com.wanfang.collect.CancelCollectResponse;
import com.wanfang.collect.CheckISCollectedRequest;
import com.wanfang.collect.CheckISCollectedResponse;
import com.wanfang.collect.CollectRequest;
import com.wanfang.collect.CollectResponse;
import com.wanfang.collect.CollectServiceGrpc;
import com.wanfang.read.ReadRequest;
import com.wanfang.read.ReadResponse;
import com.wanfang.read.ReadServiceGrpc;
import com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest;
import com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse;
import com.wanfangdata.grpcservice.message.jmessage.SendTextMessageServiceGrpc;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
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
import okhttp3.Call;

import static com.tb.wangfang.news.R.id.tv_china_class_num;
import static com.tb.wangfang.news.R.id.tv_fruit_class;
import static com.tb.wangfang.news.R.id.tv_identity_dapart;
import static com.tb.wangfang.news.R.id.tv_key_word;
import static com.tb.wangfang.news.R.id.tv_progress_num;
import static com.tb.wangfang.news.R.id.tv_province;
import static com.tb.wangfang.news.R.id.tv_publish_data;
import static com.tb.wangfang.news.R.id.tv_summary_num;
import static com.tb.wangfang.news.app.Constants.SEARCH_DETAIL;

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
    @BindView(R.id.ll_read_online)
    LinearLayout llReadOnline;
    @BindView(R.id.ll_collect)
    LinearLayout llCollect;


    private String TAG = "DocDetailActivity";
    private String articleId;
    private String articleType;
    private ManagedChannel mChannelSever;
    private MaterialDialog dialog;
    private LayoutInflater inflater;
    private String language;
    private String resourceId;
    private String resourceDb;
    private String resourceTitle;
    private String classType;
    private MaterialDialog materialDialog;
    private String author;
    private String time;
    private String journal;
    private TextView tvContent;
    private String shareType = "";
    private TextView tvTitle;


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
        inflater = getLayoutInflater();
        scrollView.setNestedScrollingEnabled(false);
        articleId = getIntent().getStringExtra(Constants.ARTICLE_ID);
        articleType = getIntent().getStringExtra(Constants.ARTICLE_TYPE);
        dialog = new MaterialDialog.Builder(this).content("加载中...").progress(true, 0).progressIndeterminateStyle(false).build();
        dialog.show();
        checkIsCollected();
        getDocDetail(articleId, articleType);
        if (articleType.equals("conf_artical")) {
            llReadOnline.setVisibility(View.INVISIBLE);
        }

    }

    private void checkIsCollected() {
        Single.create(new SingleOnSubscribe<CheckISCollectedResponse>() {
            @Override
            public void subscribe(SingleEmitter<CheckISCollectedResponse> e) throws Exception {
                CollectServiceGrpc.CollectServiceBlockingStub stub = CollectServiceGrpc.newBlockingStub(managedChannel);
                CheckISCollectedRequest collectRequest = CheckISCollectedRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setDocuId(articleId).setDocuType(articleType).build();
                CheckISCollectedResponse response = stub.checkISCollected(collectRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<CheckISCollectedResponse>() {
            @Override
            public void onSuccess(CheckISCollectedResponse collectResponse) {
                Log.d(TAG, "onSuccess: " + collectResponse.toString());
                TextView tvCollect = (TextView) llCollect.getChildAt(0);
                tvCollect.setVisibility(View.VISIBLE);
                if (collectResponse.getIsCollected()) {
                    tvCollect.setText("取消收藏");
                } else {
                    tvCollect.setText("收藏");
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }

    private void getDocDetail(final String articleId, final String articleType) {

        OkHttpUtils.get().url(SEARCH_DETAIL).addParams("params", articleId).addParams("clstype", articleType).build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.d(TAG, "onError: " + e.getMessage());
                        ToastUtil.show("服务器异常");
                        dialog.dismiss();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.d(TAG, "onResponse: " + response);

                        if (articleType.equals("perio_artical")) {
                            initViewPerioArticle(response);
                            shareType = "perio";
                        } else if (articleType.equals("degree_artical")) {
                            initViewDegreeArtcle(response);
                            shareType = "degree";
                        } else if (articleType.equals("patent_element")) {
                            initViewPatentElement(response);
                            shareType = "patent";
                        } else if (articleType.equals("conf_artical")) {
                            initViewConfArticle(response);
                            shareType = "conference";
                        } else if (articleType.equals("standards")) {
                            initViewStandards(response);
                            shareType = "standards";
                        } else if (articleType.equals("legislations")) {
                            initViewLeaislations(response);
                            shareType = "legislations";
                        } else if (articleType.equals("tech_result")) {
                            initViewTechResult(response);
                            shareType = "techResult";
                        }

                        scrollView.setVisibility(View.VISIBLE);
                        scrollView.smoothScrollTo(0, 0);
                        dialog.dismiss();
                    }


                });

    }

    private void initViewTechResult(String response) {
        Gson gson = new Gson();
        TechResultBean bean = gson.fromJson(response, TechResultBean.class);
        View view = inflater.inflate(R.layout.frag_article_fruit, viewStub, false);
        viewStub.addView(view);


        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvContent = (TextView) findViewById(R.id.tv_content);
        TextView tvProgressNum = (TextView) findViewById(tv_progress_num);
        TextView tvLimitUse = (TextView) findViewById(R.id.tv_limit_use);
        TextView tvProvince = (TextView) findViewById(tv_province);
        TextView tvChinaClassNum = (TextView) findViewById(tv_china_class_num);
        TextView tvFruitClass = (TextView) findViewById(tv_fruit_class);
        TextView tvPublishData = (TextView) findViewById(tv_publish_data);
        TextView tvKeyWord = (TextView) findViewById(tv_key_word);
        LinearLayout llIdentityDapart = (LinearLayout) findViewById(R.id.ll_identity_dapart);
        TextView tvIdentityDapart = (TextView) findViewById(tv_identity_dapart);
        LinearLayout llIdentityData = (LinearLayout) findViewById(R.id.ll_identity_data);
        TextView tvIdentityData = (TextView) findViewById(R.id.tv_identity_data);
        LinearLayout llRecommendApartment = (LinearLayout) findViewById(R.id.ll_recommend_apartment);
        TextView tvRecommendApartment = (TextView) findViewById(R.id.tv_recommend_apartment);
        LinearLayout llRegisterNum = (LinearLayout) findViewById(R.id.ll_register_num);
        TextView tvRegisterNum = (TextView) findViewById(R.id.tv_register_num);
        LinearLayout llTimeStartEnd = (LinearLayout) findViewById(R.id.ll_time_start_end);
        TextView tvTimeStartEnd = (TextView) findViewById(R.id.tv_time_start_end);
        LinearLayout llCompleteCompany = (LinearLayout) findViewById(R.id.ll_complete_company);
        TextView tvCompleteCompany = (TextView) findViewById(R.id.tv_complete_company);
        LinearLayout llCompleter = (LinearLayout) findViewById(R.id.ll_completer);
        TextView tvCompleter = (TextView) findViewById(R.id.tv_completer);
        LinearLayout llPromotionInfo = (LinearLayout) findViewById(R.id.ll_promotion_info);
        TextView tvPromotionInfo = (TextView) findViewById(R.id.tv_promotion_info);
        LinearLayout llPromotionRange = (LinearLayout) findViewById(R.id.ll_promotion_range);
        TextView tvPromotionRange = (TextView) findViewById(R.id.tv_promotion_range);
        LinearLayout llPromotionTail = (LinearLayout) findViewById(R.id.ll_promotion_tail);
        TextView tvPromotionTail = (TextView) findViewById(R.id.tv_promotion_tail);
        LinearLayout llPromotionMethod = (LinearLayout) findViewById(R.id.ll_promotion_method);
        TextView tvPromotionMethod = (TextView) findViewById(R.id.tv_promotion_method);
        LinearLayout llPromotionForecast = (LinearLayout) findViewById(R.id.ll_promotion_forecast);
        TextView tvPromotionForecast = (TextView) findViewById(R.id.tv_promotion_forecast);
        LinearLayout llUnitName = (LinearLayout) findViewById(R.id.ll_unit_name);
        TextView tvUnitName = (TextView) findViewById(R.id.tv_unit_name);
        LinearLayout llUnitSity = (LinearLayout) findViewById(R.id.ll_unit_sity);
        TextView tvUnitSity = (TextView) findViewById(R.id.tv_unit_sity);
        LinearLayout llPersonName = (LinearLayout) findViewById(R.id.ll_person_name);
        TextView tvPersonName = (TextView) findViewById(R.id.tv_person_name);
        LinearLayout llSityCode = (LinearLayout) findViewById(R.id.ll_sity_code);
        TextView tvSityCode = (TextView) findViewById(R.id.tv_sity_code);


        LinearLayout llTransferCont = (LinearLayout) findViewById(R.id.ll_transfer_cont);
        TextView tvTransferCont = (TextView) findViewById(R.id.tv_transfer_cont);
        LinearLayout llItransferMode = (LinearLayout) findViewById(R.id.ll_Itransfer_mode);
        TextView tvTransferMode = (TextView) findViewById(R.id.tv_transfer_mode);
        LinearLayout llTransferCond = (LinearLayout) findViewById(R.id.ll_transfer_cond);
        TextView tvTransferCond = (TextView) findViewById(R.id.tv_transfer_cond);
        LinearLayout llTransferRange = (LinearLayout) findViewById(R.id.ll_transfer_range);
        TextView tvTransferRange = (TextView) findViewById(R.id.tv_transfer_range);
        LinearLayout llTransferFee = (LinearLayout) findViewById(R.id.ll_transfer_fee);
        TextView tvItransferFee = (TextView) findViewById(R.id.tv_Itransfer_fee);
        LinearLayout llTransferDesc = (LinearLayout) findViewById(R.id.ll_transfer_desc);
        TextView tvTransferDesc = (TextView) findViewById(R.id.tv_transfer_desc);
        LinearLayout llInvestDesc = (LinearLayout) findViewById(R.id.ll_invest_desc);
        TextView tvInvestDesc = (TextView) findViewById(R.id.tv_invest_desc);
        LinearLayout llInvestAmt = (LinearLayout) findViewById(R.id.ll_invest_amt);
        TextView tvInvestAmt = (TextView) findViewById(R.id.tv_invest_amt);
        LinearLayout llInvestNote = (LinearLayout) findViewById(R.id.ll_invest_note);
        TextView tvInvestNote = (TextView) findViewById(R.id.tv_invest_note);


        LinearLayout llPatentAppNum = (LinearLayout) findViewById(R.id.ll_patent_app_num);
        TextView tvPatentAppNum = (TextView) findViewById(R.id.tv_patent_app_num);
        LinearLayout llPatentAppSum = (LinearLayout) findViewById(R.id.ll_patent_app_sum);
        TextView tvPatentAppSum = (TextView) findViewById(R.id.tv_patent_app_sum);
        LinearLayout llPatentPeimitNum = (LinearLayout) findViewById(R.id.ll_patent_peimit_num);
        TextView tvPatentPeimitNum = (TextView) findViewById(R.id.tv_patent_peimit_num);
        LinearLayout llIndustryClass = (LinearLayout) findViewById(R.id.ll_Industry_class);
        TextView tvIndustryClass = (TextView) findViewById(R.id.tv_Industry_class);
        LinearLayout llIndustryClassNum = (LinearLayout) findViewById(R.id.ll_Industry_class_num);
        TextView tvIndustryClassNum = (TextView) findViewById(R.id.tv_Industry_class_num);


        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            tvTitle.setText(SystemUtil.getObjectString(bean.getData().get(0).getTitle()));
            tvContent.setText(SystemUtil.getObjectString(bean.getData().get(0).getSummary()));
            tvProgressNum.setText(SystemUtil.getObjectString(bean.getData().get(0).getYear_num()));
            tvProvince.setText(SystemUtil.getObjectString(bean.getData().get(0).getProvince()));
            tvChinaClassNum.setText(SystemUtil.getObjectString(bean.getData().get(0).getClass_code()));
            tvFruitClass.setText(SystemUtil.getObjectString(bean.getData().get(0).getResult_type()));
            tvPublishData.setText(SystemUtil.getObjectString(bean.getData().get(0).getRe_pubdate()));
            tvKeyWord.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getKeywords().toString()));
            setText(SystemUtil.getObjectString(bean.getData().get(0).getIdentify_dept()), tvIdentityDapart, llIdentityDapart);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getIdentify_date()), tvIdentityData, llIdentityData);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getDeclare_date()), tvRecommendApartment, llRecommendApartment);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getReg_code()), tvRegisterNum, llRegisterNum);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getWork_date()), tvTimeStartEnd, llTimeStartEnd);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getIssue_unit()), tvCompleteCompany, llCompleteCompany);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getContact_per()), tvCompleter, llCompleter);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getP_app_id()), tvPatentAppNum, llPatentAppNum);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getPatent_cnt()), tvPatentAppSum, llPatentAppSum);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getGrant_id()), tvPatentPeimitNum, llPatentPeimitNum);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getIndustry_name()), tvIndustryClass, llIndustryClass);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getIndustry_code()), tvIndustryClassNum, llIndustryClassNum);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getTransfer_cont()), tvTransferCont, llTransferCont);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getTransfer_mode()), tvTransferMode, llItransferMode);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getTransfer_cond()), tvTransferCond, llTransferCond);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getTransfer_range()), tvTransferRange, llTransferRange);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getTransfer_fee()), tvItransferFee, llTransferFee);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getTransfer_desc()), tvTransferDesc, llTransferDesc);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getInvest_desc()), tvInvestDesc, llInvestDesc);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getInvest_amt()), tvInvestAmt, llInvestAmt);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getInvest_note()), tvInvestNote, llInvestNote);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getSpread_desc()), tvPromotionInfo, llPromotionInfo);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getSpread_range()), tvPromotionRange, llPromotionRange);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getSpread_track()), tvPromotionTail, llPromotionTail);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getSpread_mode()), tvPromotionMethod, llPromotionMethod);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getSpread()), tvPromotionForecast, llPromotionForecast);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getContact_unit()), tvUnitName, llUnitName);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getAddress()), tvUnitSity, llUnitSity);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getContact_per()), tvPersonName, llPersonName);
            setText(SystemUtil.getObjectString(bean.getData().get(0).getPostcode()), tvSityCode, llSityCode);
            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getNote_num());
            language = "";
            resourceId = SystemUtil.getObjectString(bean.getData().get(0).getResult_id());
            resourceDb = SystemUtil.getObjectString(bean.getData().get(0).getSource_db());
            resourceTitle = SystemUtil.getObjectString(bean.getData().get(0).getTitle());
            classType = SystemUtil.getObjectString(bean.getData().get(0).getClass_type());
            if (SystemUtil.getObjectString(bean.getData().get(0).getIs_full()).equals("1") || SystemUtil.getObjectString(bean.getData().get(0).getIs_fulltext()).equals("1")) {
                llReadOnline.setVisibility(View.VISIBLE);
            } else {
                llReadOnline.setVisibility(View.INVISIBLE);
            }

            if (bean.getData().get(0).getCommon_year() != null) {
                time = bean.getData().get(0).getCommon_year() + "年";
            }

            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getIndustry_name().toString());
            journal = bean.getData().get(0).getTitle().toString();

        }
    }

    private void setText(String title, TextView tvIdentityDapart, LinearLayout llIdentityDapart) {
        if (TextUtils.isEmpty(title)) {
            llIdentityDapart.setVisibility(View.GONE);
        } else {
            llIdentityDapart.setVisibility(View.VISIBLE);
            tvIdentityDapart.setText(title);
        }
    }

    private void initViewLeaislations(String response) {
        Gson gson = new Gson();
        LegisBean bean = gson.fromJson(response, LegisBean.class);
        View view = inflater.inflate(R.layout.frag_article_law, viewStub, false);
        viewStub.addView(view);
        tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
        tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
        TextView tvBankName = (TextView) viewStub.findViewById(R.id.tv_bank_name);
        TextView tvArticleId = (TextView) viewStub.findViewById(R.id.tv_article_id);
        TextView tvPublishUnis = (TextView) viewStub.findViewById(R.id.tv_publish_unit);
        TextView tvTimeLiness = (TextView) viewStub.findViewById(R.id.tv_timeliness);
        TextView tvPublishTime = (TextView) viewStub.findViewById(R.id.tv_publish_time);
        TextView tvContentClass = (TextView) viewStub.findViewById(R.id.tv_content_class);
        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            tvTitle.setText(SystemUtil.getObjectString(bean.getData().get(0).getTitle().toString()));
            tvContent.setText(bean.getData().get(0).getSummary().toString());
            tvBankName.setText(bean.getData().get(0).getDb_name().toString());
            tvArticleId.setText(bean.getData().get(0).getPublish_num().toString());
            tvPublishUnis.setText(bean.getData().get(0).getIssue_dept02().toString());
            tvTimeLiness.setText(bean.getData().get(0).getIs_valid().toString());
            tvPublishTime.setText(bean.getData().get(0).getIssue_date02().toString());
            tvContentClass.setText(bean.getData().get(0).getClass_name02().toString());
            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getNote_num());
            language = "";
            resourceId = SystemUtil.getObjectString(bean.getData().get(0).getLegis_id());
            resourceDb = SystemUtil.getObjectString(bean.getData().get(0).getSource_db());
            resourceTitle = SystemUtil.getObjectString(bean.getData().get(0).getTitle());
            classType = SystemUtil.getObjectString(bean.getData().get(0).getClass_type());

            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getIssue_dept());
            journal = SystemUtil.getObjectString(bean.getData().get(0).getTitle());

            if (SystemUtil.getObjectString(bean.getData().get(0).getIs_full()).equals("1") || SystemUtil.getObjectString(bean.getData().get(0).getIs_fulltext()).equals("1")) {
                llReadOnline.setVisibility(View.VISIBLE);
            } else {
                llReadOnline.setVisibility(View.INVISIBLE);
            }
            if (bean.getData().get(0).getCommon_year() != null) {
                time = bean.getData().get(0).getCommon_year() + "年";
            }
        }

    }

    private void initViewStandards(String response) {
        Gson gson = new Gson();
        StandardsBean bean = gson.fromJson(response, StandardsBean.class);
        View view = inflater.inflate(R.layout.frag_article_standard, viewStub, false);
        viewStub.addView(view);
        tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
        tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
        TextView tvStandardId = (TextView) viewStub.findViewById(R.id.tv_standard_id);
        TextView tvunit = (TextView) viewStub.findViewById(R.id.tv_unit);
        TextView tvTime = (TextView) viewStub.findViewById(R.id.tv_time);
        TextView tvStatue = (TextView) viewStub.findViewById(R.id.tv_statue);
        TextView tvMandatory = (TextView) viewStub.findViewById(R.id.tv_mandatory);
        TextView tvDoTime = (TextView) viewStub.findViewById(R.id.tv_do_time);
        TextView tvPageNum = (TextView) viewStub.findViewById(R.id.tv_page_num);
        TextView tvChinaClassNum = (TextView) viewStub.findViewById(tv_china_class_num);
        TextView tvStandardClassNum = (TextView) viewStub.findViewById(R.id.tv_standard_class_num);
        TextView tvCountryNum = (TextView) viewStub.findViewById(R.id.tv_country_num);
        TextView tvCountryName = (TextView) viewStub.findViewById(R.id.tv_country_name);
        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            tvTitle.setText(SystemUtil.getObjectString(bean.getData().get(0).getTitle()));
            tvContent.setText(SystemUtil.getObjectString(bean.getData().get(0).getSummary()));
            tvStandardId.setText(SystemUtil.getObjectString(bean.getData().get(0).getStand_num()));
            tvunit.setText(SystemUtil.getObjectString(bean.getData().get(0).getIssue_unit()));
            tvTime.setText(SystemUtil.getObjectString(bean.getData().get(0).getIssue_date()));
            tvStatue.setText(SystemUtil.getObjectString(bean.getData().get(0).getStand_status()));
            tvMandatory.setText(SystemUtil.getObjectString(bean.getData().get(0).getIs_force()));
            tvDoTime.setText(SystemUtil.getObjectString(bean.getData().get(0).getForce_date()));
            tvPageNum.setText(SystemUtil.getObjectString(bean.getData().get(0).getPage_cnt()));
            tvChinaClassNum.setText(SystemUtil.getObjectString(bean.getData().get(0).getCcs_code_c()));
            tvStandardClassNum.setText(SystemUtil.getObjectString(bean.getData().get(0).getCcs_code()));
            tvCountryNum.setText(SystemUtil.getObjectString(bean.getData().get(0).getIcs_code()));
            tvCountryName.setText(SystemUtil.getObjectString(bean.getData().get(0).getCountry()));
            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getNote_num());
            language = SystemUtil.getObjectString(bean.getData().get(0).getLanguage());
            resourceId = SystemUtil.getObjectString(bean.getData().get(0).getStand_id());
            resourceDb = SystemUtil.getObjectString(bean.getData().get(0).getSource_db());
            resourceTitle = SystemUtil.getObjectString(bean.getData().get(0).getTitle());
            classType = SystemUtil.getObjectString(bean.getData().get(0).getClass_type());

            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getDraft_unit());
            journal = SystemUtil.getObjectString(bean.getData().get(0).getTitle());

            if (SystemUtil.getObjectString(bean.getData().get(0).getIs_full()).equals("1") || SystemUtil.getObjectString(bean.getData().get(0).getIs_fulltext()).equals("1")) {
                llReadOnline.setVisibility(View.VISIBLE);
            } else {
                llReadOnline.setVisibility(View.INVISIBLE);
            }
            if (bean.getData().get(0).getCommon_year() != null) {
                time = bean.getData().get(0).getCommon_year() + "年";
            }
        }


    }

    private void initViewConfArticle(String response) {
        Gson gson = new Gson();
        ConfArticle bean = gson.fromJson(response, ConfArticle.class);
        View view = inflater.inflate(R.layout.frag_article_meeting, viewStub, false);
        viewStub.addView(view);
        tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
        tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
        TextView tvKeyWord = (TextView) viewStub.findViewById(tv_key_word);
        TextView tvAuthor = (TextView) viewStub.findViewById(R.id.tv_author);
        TextView tvMeetingName = (TextView) viewStub.findViewById(R.id.tv_meeting_name);
        TextView tvMeetingSity = (TextView) viewStub.findViewById(R.id.tv_meeting_sity);
        TextView tvPublishMeeting = (TextView) viewStub.findViewById(R.id.tv_publish_meeting);
        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            tvTitle.setText(SystemUtil.getObjectString(bean.getData().get(0).getTitle()));
            tvContent.setText(bean.getData().get(0).getSummary().toString());
            tvKeyWord.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getKeywords()));
            tvAuthor.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_name()));
            tvMeetingName.setText(SystemUtil.getObjectString(bean.getData().get(0).getConf_name02()));
            tvPublishMeeting.setText(SystemUtil.getObjectString(bean.getData().get(0).getHostunit_name02()));

            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getCite_num());
            language = SystemUtil.getObjectString(bean.getData().get(0).getLanguage());
            resourceId = SystemUtil.getObjectString(bean.getData().get(0).getArticle_id());
            resourceDb = SystemUtil.getObjectString(bean.getData().get(0).getSource_db());
            resourceTitle = SystemUtil.getObjectString(bean.getData().get(0).getTitle());
            classType = SystemUtil.getObjectString(bean.getData().get(0).getClass_type());

            //会议不能阅读
            llReadOnline.setVisibility(View.INVISIBLE);

            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_name());
            journal = SystemUtil.getObjectString(bean.getData().get(0).getTitle());
            if (bean.getData().get(0).getConf_year() != null) {
                time = bean.getData().get(0).getConf_year() + "年";
            }


        }

        if (bean != null && bean.getRelatePapers() != null) {
            ArrayList<RelatePapers> list = new ArrayList<>();
            for (int j = 0; j < bean.getRelatePapers().size(); j++) {
                RelatePapers papers = new RelatePapers();
                if (bean.getRelatePapers().get(j).getClass_type().equals("perio_artical")) {
                    papers.setId(bean.getRelatePapers().get(j).getArticle_id().toString());
                }
                papers.setType(bean.getRelatePapers().get(j).getClass_type().toString());
                papers.setTitle(bean.getRelatePapers().get(j).getTitle().toString());
                list.add(papers);
            }
            initSimilarPage(list);
        }

    }

    private void initViewPatentElement(String response) {
        Gson gson = new Gson();
        PatentElementBean bean = gson.fromJson(response, PatentElementBean.class);
        View view = inflater.inflate(R.layout.frag_article_patent, viewStub, false);
        viewStub.addView(view);
        tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
        tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
        TextView tvPatentClass = (TextView) viewStub.findViewById(R.id.tv_patent_class);
        TextView tvPatentId = (TextView) viewStub.findViewById(R.id.tv_patent_id);
        TextView tvDate = (TextView) viewStub.findViewById(R.id.tv_date);
        TextView tvPublishdate = (TextView) viewStub.findViewById(R.id.tv_publish_date);
        TextView tvApplicant = (TextView) viewStub.findViewById(R.id.tv_applicant);
        TextView tvApplicantSite = (TextView) viewStub.findViewById(R.id.tv_applicant_site);
        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            tvTitle.setText(SystemUtil.getObjectString(bean.getData().get(0).getTitle()));
            tvContent.setText(SystemUtil.getObjectString(bean.getData().get(0).getSummary()));
            tvPatentClass.setText(SystemUtil.getObjectString(bean.getData().get(0).getPatent_type()));
            tvPatentId.setText(SystemUtil.getObjectString(bean.getData().get(0).getPatent_id()));
            tvDate.setText(SystemUtil.getObjectString(bean.getData().get(0).getApp_date02()));
            tvPublishdate.setText(SystemUtil.getObjectString(bean.getData().get(0).getPub_date()));
            tvApplicant.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getInv_name()));
            tvApplicantSite.setText(SystemUtil.getObjectString(bean.getData().get(0).getApp_address()));

            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getPub_num());

            if (SystemUtil.getObjectString(bean.getData().get(0).getIs_full()).equals("1") || SystemUtil.getObjectString(bean.getData().get(0).getIs_fulltext()).equals("1")) {
                llReadOnline.setVisibility(View.VISIBLE);
            } else {
                llReadOnline.setVisibility(View.INVISIBLE);
            }
            //有问题
            language = "";
            resourceId = bean.getData().get(0).getPatent_id().toString();
            resourceDb = bean.getData().get(0).getSource_db().toString();
            resourceTitle = bean.getData().get(0).getTitle().toString();
            classType = bean.getData().get(0).getClass_type().toString();

            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAgy_org_name());

            journal = SystemUtil.getObjectString(bean.getData().get(0).getTitle());
            if (bean.getData().get(0).getCommon_year() != null) {

                time = bean.getData().get(0).getCommon_year() + "年";

            }
//            ArrayList<RelatePapers> list = new ArrayList<>();
//            for (int j = 0; j < bean.getRelatePapers().size(); j++) {
//                RelatePapers papers = new RelatePapers();
//                if (bean.getRelatePapers().get(j).getClass_type().equals("perio_artical")) {
//                    papers.setId(bean.getRelatePapers().get(j).getArticle_id());
//                }
//                papers.setType(bean.getRelatePapers().get(j).getClass_type());
//                papers.setTitle(bean.getRelatePapers().get(j).getTitle());
//                list.add(papers);
//            }
//            initSimilarPage(list);
        }
    }

    private void initViewDegreeArtcle(String response) {
        Gson gson = new Gson();
        DegreeArticleBean bean = gson.fromJson(response, DegreeArticleBean.class);
        View view = inflater.inflate(R.layout.frag_article_degree, viewStub, false);
        viewStub.addView(view);
        tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
        tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
        TextView tvKeyWord = (TextView) viewStub.findViewById(tv_key_word);
        TextView tvAuthor = (TextView) viewStub.findViewById(R.id.tv_author);
        TextView tvUnitPublish = (TextView) viewStub.findViewById(R.id.tv_unit_publish);
        TextView tvTeacherName = (TextView) viewStub.findViewById(R.id.tv_teacher_name);
        TextView tvTime = (TextView) viewStub.findViewById(R.id.tv_time);
        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            tvTitle.setText(bean.getData().get(0).getTitle().toString());
            tvContent.setText(bean.getData().get(0).getSummary().toString());
            tvKeyWord.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getKeywords()));
            tvAuthor.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_name()));
            tvUnitPublish.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getUnit_name02()));
            tvTeacherName.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getTutor_name()));
            tvTime.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPublish_year()));

            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getCite_num());
            language = bean.getData().get(0).getLanguage().toString() + "";
            resourceId = bean.getData().get(0).getArticle_id() + "";
            resourceDb = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getSource_db());
            resourceTitle = bean.getData().get(0).getTitle() + "";
            classType = bean.getData().get(0).getClass_type() + "";

            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_name().toString());
            journal = bean.getData().get(0).getTitle().toString();

            if (SystemUtil.getObjectString(bean.getData().get(0).getIs_full()).equals("1") || SystemUtil.getObjectString(bean.getData().get(0).getIs_fulltext()).equals("1")) {
                llReadOnline.setVisibility(View.VISIBLE);
            } else {
                llReadOnline.setVisibility(View.INVISIBLE);
            }
            if (bean.getData().get(0).getPublish_year() != null) {
                time = bean.getData().get(0).getPublish_year() + "年";
            }

        }
        if (bean != null && bean.getRelatePapers() != null) {
            ArrayList<RelatePapers> list = new ArrayList<>();
            for (int j = 0; j < bean.getRelatePapers().size(); j++) {
                RelatePapers papers = new RelatePapers();
                if (bean.getRelatePapers().get(j).getClass_type().equals("perio_artical")) {
                    papers.setId(bean.getRelatePapers().get(j).getArticle_id().toString());
                }
                papers.setType(bean.getRelatePapers().get(j).getClass_type().toString());
                papers.setTitle(bean.getRelatePapers().get(j).getTitle().toString());
                list.add(papers);
            }
            initSimilarPage(list);

        }


    }

    private void initViewPerioArticle(String response) {
        Gson gson = new Gson();
        PerioArticelBean bean = gson.fromJson(response, PerioArticelBean.class);
        View view_pro = inflater.inflate(R.layout.frag_article, viewStub, false);
        viewStub.addView(view_pro);

        tvTitle = (TextView) viewStub.findViewById(R.id.tv_title);
        tvContent = (TextView) viewStub.findViewById(R.id.tv_content);
        TextView tvAuthor = (TextView) viewStub.findViewById(R.id.tv_author);
        TextView tvUnit = (TextView) viewStub.findViewById(R.id.tv_unit);
        TextView tvKeyWord = (TextView) viewStub.findViewById(tv_key_word);
        TextView tvMagazine = (TextView) viewStub.findViewById(R.id.tv_magazine);
        TextView tvTime = (TextView) viewStub.findViewById(R.id.tv_time);
        if (bean != null && bean.getData() != null && bean.getData().get(0) != null) {
            if (TextUtils.isEmpty(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getTitle()))) {
                tvTitle.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getTitle()));
                tvTitle.setVisibility(View.VISIBLE);
            } else {
                tvTitle.setVisibility(View.GONE);
            }

            tvContent.setText(bean.getData().get(0).getSummary().toString());
            tvAuthor.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_name()));
            author = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_name().toString());
            journal = SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPerio_title());
            time = bean.getData().get(0).getCommon_year() + "年" + bean.getData().get(0).getIssue_num() + "期";
            tvUnit.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getAuthors_unit()));
            tvKeyWord.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getKeywords()));
            tvMagazine.setText(SystemUtil.getStringFromJsonarray(bean.getData().get(0).getPerio_title02()));
            tvTime.setText(bean.getData().get(0).getPublish_year() + "," + bean.getData().get(0).getIssue_num());
            language = bean.getData().get(0).getLanguage() + "";
            resourceId = bean.getData().get(0).getArticle_id() + "";
            resourceDb = bean.getData().get(0).getSource_db() + "";
            resourceTitle = bean.getData().get(0).getTitle() + "";
            classType = bean.getData().get(0).getClass_type() + "";
            tvSummaryNum.setText("文摘阅读 : " + bean.getData().get(0).getAbstract_reading_num());
            tvDownNum.setText("下载 : " + bean.getData().get(0).getDownload_num());
            tvLinkNum.setText("第三方链接 : " + bean.getData().get(0).getThirdparty_links_num());
            tvReferenceNum.setText("被用 : " + bean.getData().get(0).getCite_num());
            if (SystemUtil.getObjectString(bean.getData().get(0).getIs_full()).equals("1") || SystemUtil.getObjectString(bean.getData().get(0).getIs_fulltext()).equals("1")) {
                llReadOnline.setVisibility(View.VISIBLE);
            } else {
                llReadOnline.setVisibility(View.INVISIBLE);
            }

        }
        if (bean != null && bean.getRelatePapers() != null) {

            ArrayList<RelatePapers> list = new ArrayList<>();
            for (int j = 0; j < bean.getRelatePapers().size(); j++) {
                RelatePapers papers = new RelatePapers();
                if (bean.getRelatePapers().get(j).getClass_type().equals("perio_artical")) {
                    papers.setId(bean.getRelatePapers().get(j).getArticle_id().toString());
                }
                papers.setType(bean.getRelatePapers().get(j).getClass_type().toString());
                papers.setTitle(bean.getRelatePapers().get(j).getTitle().toString());
                list.add(papers);
            }
            initSimilarPage(list);
        }


    }

    private void initSimilarPage(ArrayList<RelatePapers> list) {
        rvSimilar.setLayoutManager(new AutoLinearLayoutManager(this));

        final SimilarPageAdapter pageAdapter = new SimilarPageAdapter(list);
        rvSimilar.setAdapter(pageAdapter);
        pageAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(DocDetailActivity.this, DocDetailActivity.class);
                intent.putExtra(Constants.ARTICLE_TYPE, pageAdapter.getData().get(position).getType());
                intent.putExtra(Constants.ARTICLE_ID, pageAdapter.getData().get(position).getId());
                startActivity(intent);
            }
        });


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
                TextView tvCollect = (TextView) llCollect.getChildAt(0);
                if (tvCollect.getText().toString().equals("收藏")) {
                    collectPro();
                } else {
                    unCollectPro();
                }

                break;
            case R.id.ll_share:
                sendJPush();
                showShare();
                break;
        }
    }

    private void unCollectPro() {
        Single.create(new SingleOnSubscribe<CancelCollectResponse>() {
            @Override
            public void subscribe(SingleEmitter<CancelCollectResponse> e) throws Exception {
                CollectServiceGrpc.CollectServiceBlockingStub stub = CollectServiceGrpc.newBlockingStub(managedChannel);
                CancelCollectReqeust collectRequest = CancelCollectReqeust.newBuilder().setDocId(articleId).setUserId(preferencesHelper.getUserId()).build();
                CancelCollectResponse response = stub.cancelCollect(collectRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<CancelCollectResponse>() {
            @Override
            public void onSuccess(CancelCollectResponse cancelCollectResponse) {
                Log.d(TAG, "onSuccess: " + cancelCollectResponse.toString());
                if (cancelCollectResponse.getCancelSuccess()) {
                    ToastUtil.show("取消收藏成功");
                    TextView tvCollect = (TextView) llCollect.getChildAt(0);
                    tvCollect.setText("收藏");

                } else {
                    ToastUtil.show("取消收藏失败");
                }

            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
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
                    TextView tvCollect = (TextView) llCollect.getChildAt(0);
                    tvCollect.setText("取消收藏");

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
        dialog = new MaterialDialog.Builder(DocDetailActivity.this).content("加载中...").progress(true, 0).progressIndeterminateStyle(false).build();
        dialog.show();

        Single.create(new SingleOnSubscribe<ReadResponse>() {
            @Override
            public void subscribe(SingleEmitter<ReadResponse> e) throws Exception {
                ReadServiceGrpc.ReadServiceBlockingStub stub = ReadServiceGrpc.newBlockingStub(managedChannel);
                ReadRequest readRequest = ReadRequest.newBuilder().setLanguage(language).setLoginToken(preferencesHelper.getLoginToken()).
                        setResourceId(resourceId).setUserId(preferencesHelper.getUserId()).setSource(resourceDb).setResourceTitle(resourceTitle)
                        .setResourceType(classType).build();
                ReadResponse readResponse = stub.read(readRequest);
                e.onSuccess(readResponse);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<ReadResponse>() {
            @Override
            public void onSuccess(ReadResponse readResponse) {
                Log.d(TAG, "onSuccess: readResponse" + readResponse);
                if (readResponse.getAlreadyBuy()) {


                    down(readResponse);
                } else if (readResponse.getHasTradePower()) {
                    dialog.dismiss();
                    Intent intent = new Intent(DocDetailActivity.this, PayOrderActivity.class);
                    intent.putExtra("response", readResponse);
                    intent.putExtra("type", classType);


                    intent.putExtra("author", author);
                    intent.putExtra("journal", journal);
                    intent.putExtra("time", time);

                    startActivity(intent);


                } else {
                    dialog.dismiss();
                    ToastUtil.show("您没有购买的权限");
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });

    }

    private void down(final ReadResponse readResponse) {

        String fileName = readResponse.getResourceFile().getFileName();
        String[] s = fileName.split("\\.");
        String fileType = "";
        if (s.length == 2) {
            fileType = s[1];
        }

        final String finalFileName = fileName;
        final String finalFileType = fileType;
        Single.create(new SingleOnSubscribe<String>() {
            @Override
            public void subscribe(SingleEmitter<String> e) throws Exception {
                ByteString byteString = readResponse.getResourceFile().getFileByte();
                boolean b = FileUtil.saveReadFile(byteString, getFilesDir().getAbsolutePath(), finalFileName);
                if (b) {
                    e.onSuccess("");
                } else {
                    e.onError(new Exception("error"));
                }

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<String>() {
            @Override
            public void onSuccess(String readResponse) {
                dialog.dismiss();
                Intent intent = new Intent(DocDetailActivity.this, ReadActivity.class);
                intent.putExtra("url", finalFileName);
                intent.putExtra("type", finalFileType);
                startActivity(intent);
            }

            @Override
            public void onError(Throwable e) {
                dialog.dismiss();
            }
        });


    }

    private void checkIsExistNative(String finalFileName, int size) {

    }

    private void showShare() {
        dialog.show();
        final String shareUrl = "new.wanfangdata.com.cn/details/detail.do?_type=" + shareType + "&id=" + articleId;
        final String title = tvTitle.getText().toString();
        final String content = tvContent.getText().toString();
        final OnekeyShare oks = new OnekeyShare();
        Single.create(new SingleOnSubscribe<String>() {
            @Override
            public void subscribe(SingleEmitter<String> e) throws Exception {
                BitmapDrawable bitmap = (BitmapDrawable) getResources().getDrawable(R.mipmap.ic_launcher);
                Bitmap img = bitmap.getBitmap();
                String path = FileUtil.getEncryFilePath("ic_launcher.png");
                boolean b = FileUtil.saveBitmap(img, path);
                if (b) {
                    e.onSuccess(path);
                } else {
                    e.onError(new Exception("e"));
                }

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<String>() {
            @Override
            public void onSuccess(String readResponse) {
                dialog.dismiss();
                //关闭sso授权
                oks.disableSSOWhenAuthorize();
                // 分享时Notification的图标和文字  2.5.9以后的版本不     调用此方法
                //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
                // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
                oks.setTitle(title);
                // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
                oks.setTitleUrl(shareUrl);
                // text是分享文本，所有平台都需要这个字段
                oks.setText(content);
                // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
                oks.setImagePath(readResponse);//确保SDcard下面存在此张图片
                // url仅在微信（包括好友和朋友圈）中使用
                oks.setUrl(shareUrl);
                // comment是我对这条分享的评论，仅在人人网和QQ空间使用
//        oks.setComment("我是测试评论文本");
                // site是分享此内容的网站名称，仅在QQ空间使用
                oks.setSite("万方App");
                // siteUrl是分享此内容的网站地址，仅在QQ空间使用
                oks.setSiteUrl("http://www.wanfangdata.com.cn/");

                // 启动分享GUI
                oks.show(DocDetailActivity.this);

            }

            @Override
            public void onError(Throwable e) {
                dialog.dismiss();
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
