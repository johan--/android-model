package com.tb.wangfang.news.ui.activity;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.FlowLayout;
import com.wanfang.subscribe.CancelSubscribeRequest;
import com.wanfang.subscribe.CancelSubscribeResponse;
import com.wanfang.subscribe.CancelSubscribeType;
import com.wanfang.subscribe.SubscribeKeywordListRequest;
import com.wanfang.subscribe.SubscribeKeywordListResponse;
import com.wanfang.subscribe.SubscribeKeywordMessage;
import com.wanfang.subscribe.SubscribePerioListRequest;
import com.wanfang.subscribe.SubscribePerioListResponse;
import com.wanfang.subscribe.SubscribePushEmailRequest;
import com.wanfang.subscribe.SubscribePushEmailResponse;
import com.wanfang.subscribe.SubscribeServiceGrpc;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class ManageSubscribeActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.fl_keyword)
    FlowLayout flKeyword;
    @BindView(R.id.fl_journal)
    FlowLayout flJournal;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    private String TAG = "ManageSubscribeActivity";
    private List<SubscribePerioListResponse.SubscribePerioMessage> subscribePerioMessages;
    private List<SubscribeKeywordMessage> keyWords;
    private MaterialDialog.Builder dialog;

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_manage_subscribe;
    }

    @Override
    protected void initEventAndData() {
        getKeyWord();
        getMyJournal();
        getEmail();
    }

    private void getEmail() {
        Single.create(new SingleOnSubscribe<SubscribePushEmailResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePushEmailResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePushEmailRequest request = SubscribePushEmailRequest.newBuilder().setUserId(preferencesHelper.getUserId()).build();
                SubscribePushEmailResponse response = stub.getSubscribePushEmail(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<SubscribePushEmailResponse>() {
                    @Override
                    public void onSuccess(SubscribePushEmailResponse response) {
                        Log.d(TAG, "onSuccess: " + response.toString());
                        tvEmail.setText(response.getEmail());

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }
                });
    }


    private void getKeyWord() {
        Single.create(new SingleOnSubscribe<SubscribeKeywordListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribeKeywordListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);

                SubscribeKeywordListRequest request = SubscribeKeywordListRequest.newBuilder().setUserId(preferencesHelper.getUserId()).setPageNumber(1).build();
                SubscribeKeywordListResponse response = stub.getSubscribeKeywordList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribeKeywordListResponse>() {
            @Override
            public void onSuccess(SubscribeKeywordListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                keyWords = response.getSubscribeKeywordList();
                for (int i = 0; i < keyWords.size(); i++) {
                    View view = getLayoutInflater().inflate(R.layout.item_manager_subscribe, null, true);
                    ViewGroup.LayoutParams vglp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(vglp);
                    params.setMargins(SystemUtil.dp2px(ManageSubscribeActivity.this, 8), SystemUtil.dp2px(5), SystemUtil.dp2px(5), SystemUtil.dp2px(8));
                    view.setLayoutParams(params);
                    TextView tvName = (TextView) view.findViewById(R.id.tv_name);
                    tvName.setText(keyWords.get(i).getKeyword());
                    ImageView ivDelete = (ImageView) view.findViewById(R.id.iv_delete);
                    ivDelete.setTag(keyWords.get(i).getSubscribeId().toString());
                    ivDelete.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(final View v) {
                            dialog = new MaterialDialog.Builder(ManageSubscribeActivity.this).content("确定删除此关键字吗？")
                                    .positiveText("确定").negativeText("取消").onPositive(new MaterialDialog.SingleButtonCallback() {
                                        @Override
                                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                            deleteKeyWord(v, CancelSubscribeType.DeleteKeyWord);
                                            dialog.dismiss();
                                        }
                                    }).onNegative(new MaterialDialog.SingleButtonCallback() {
                                        @Override
                                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                            dialog.dismiss();
                                        }
                                    });
                            dialog.show();
                        }
                    });
                    flKeyword.addView(view);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private void deleteKeyWord(final View view, final CancelSubscribeType deleteKeyWord) {
        Single.create(new SingleOnSubscribe<CancelSubscribeResponse>() {
            @Override
            public void subscribe(SingleEmitter<CancelSubscribeResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                CancelSubscribeRequest request = CancelSubscribeRequest.newBuilder().setCancelType(deleteKeyWord).setSubscribeId(view.getTag().toString()).build();
                CancelSubscribeResponse response = stub.cancelSubscribe(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<CancelSubscribeResponse>() {
            @Override
            public void onSuccess(CancelSubscribeResponse response) {
                if (response.getCancelSubscribeSuccess()) {
                    ToastUtil.show("删除成功");
                    if (deleteKeyWord == CancelSubscribeType.DeleteKeyWord) {
                        flKeyword.removeView((View) view.getParent());
                    } else {
                        flJournal.removeView((View) view.getParent());
                    }
                } else {
                    ToastUtil.show("删除失败");
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });


    }


    private void getMyJournal() {

        Single.create(new SingleOnSubscribe<SubscribePerioListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubscribePerioListResponse> e) throws Exception {
                SubscribeServiceGrpc.SubscribeServiceBlockingStub stub = SubscribeServiceGrpc.newBlockingStub(managedChannel);
                SubscribePerioListRequest request = SubscribePerioListRequest.newBuilder().setPageSize(20).setPageNumber(1).setUserId(preferencesHelper.getUserId()).build();
                SubscribePerioListResponse response = stub.getSubscribePerioList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<SubscribePerioListResponse>() {
            @Override
            public void onSuccess(SubscribePerioListResponse response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                subscribePerioMessages = response.getSubscribePerioList();
                for (int i = 0; i < subscribePerioMessages.size(); i++) {
                    View view = getLayoutInflater().inflate(R.layout.item_manager_subscribe, null, true);
                    ViewGroup.LayoutParams vglp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(vglp);
                    params.setMargins(SystemUtil.dp2px(ManageSubscribeActivity.this, 8), SystemUtil.dp2px(5), SystemUtil.dp2px(5), SystemUtil.dp2px(8));
                    view.setLayoutParams(params);
                    TextView tvName = (TextView) view.findViewById(R.id.tv_name);
                    tvName.setText(subscribePerioMessages.get(i).getPerioName());
                    ImageView ivDelete = (ImageView) view.findViewById(R.id.iv_delete);
                    ivDelete.setTag(subscribePerioMessages.get(i).getPerioId().toString());
                    ivDelete.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(final View v) {
                            dialog = new MaterialDialog.Builder(ManageSubscribeActivity.this).content("确定删除此关键字吗？")
                                    .positiveText("确定").negativeText("取消").onPositive(new MaterialDialog.SingleButtonCallback() {
                                        @Override
                                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                            deleteKeyWord(v, CancelSubscribeType.DeletePerio);
                                            dialog.dismiss();
                                        }
                                    }).onNegative(new MaterialDialog.SingleButtonCallback() {
                                        @Override
                                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                            dialog.dismiss();
                                        }
                                    });
                            dialog.show();
                        }
                    });
                    flJournal.addView(view);
                }


            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }


}
