package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.google.protobuf.Any;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.ToastUtil;
import com.wanfang.personal.InfoGraduatedSchool;
import com.wanfang.personal.InfoIdNumber;
import com.wanfang.personal.InfoNickName;
import com.wanfang.personal.InfoRealName;
import com.wanfang.personal.InfoWorkUnit;
import com.wanfang.personal.MyInfoUpdateRequest;
import com.wanfang.personal.MyInfoUpdateResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

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

public class EditNackNameActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.et_name)
    EditText etName;
    final static int TYPE_NICKNAME = 110;
    final static int TYPE_NAME = 1;
    final static int TYPE_ID_CARD = 2;
    final static int TYPE_UNIT = 101;
    final static int TYPE_SCHOOL = 102;

    private int type;
    private MaterialDialog mdialog;

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_edit_nack_name;
    }

    @Override
    protected void initEventAndData() {
        type = getIntent().getIntExtra("type", 0);
        String content = getIntent().getStringExtra("content");
        if (!TextUtils.isEmpty(content)) {
            etName.setText(content);
            etName.setSelection(etName.length());
        }
        if (type == TYPE_NICKNAME) {
            tvPageTitle.setText("昵称");
            etName.setHint("请输入昵称");
        } else if (type == TYPE_NAME) {
            tvPageTitle.setText("姓名");
            etName.setHint("请输入姓名");
        } else if (type == TYPE_UNIT) {
            tvPageTitle.setText("当前单位/院校");
            etName.setHint("请输入当前单位或当前院校");
        } else if (type == TYPE_SCHOOL) {
            tvPageTitle.setText("毕业院校");
            etName.setHint("请输入毕业院校");
        } else if (type == TYPE_ID_CARD) {
            tvPageTitle.setText("身份证号");
            etName.setHint("请输入身份证号");
            etName.addTextChangedListener(new TextWatcher() {

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void afterTextChanged(Editable edt) {

                    try {
                        String temp = edt.toString();
                        String tem = temp.substring(temp.length() - 1, temp.length());
                        char[] temC = tem.toCharArray();
                        int mid = temC[0];
                        if (mid >= 48 && mid <= 57) {//数字
                            return;
                        }
                        if (mid >= 65 && mid <= 90) {//大写字母
                            return;
                        }
                        if (mid > 97 && mid <= 122) {//小写字母
                            return;
                        }

                        edt.delete(temp.length() - 1, temp.length());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }


    @OnClick({R.id.tv_return, R.id.tv_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_save:
                if (!TextUtils.isEmpty(etName.getText().toString())) {
                    if (!TextUtils.isEmpty(etName.getText().toString().trim())) {
                        mdialog = new MaterialDialog.Builder(this)
                                .title("修改中")
                                .content("请等待")
                                .progress(true, 0)
                                .progressIndeterminateStyle(true)
                                .show();
                        submitInfo(etName.getText().toString().trim(), type);

                    } else {
                        if (type == TYPE_NICKNAME) {
                            ToastUtil.show("昵称不能是空格");
                        } else if (type == TYPE_NAME) {
                            ToastUtil.show("姓名不能是空格");
                        } else if (type == TYPE_ID_CARD) {
                            ToastUtil.show("身份证号不能是空格");
                        } else if (type == TYPE_UNIT) {
                            ToastUtil.show("当前单位/院校不能是空格");
                        } else if (type == TYPE_SCHOOL) {
                            ToastUtil.show("毕业院校不能是空格");
                        }

                    }
                } else {
                    if (type == TYPE_NICKNAME) {
                        ToastUtil.show("昵称不能为空");
                    } else if (type == TYPE_NAME) {
                        ToastUtil.show("姓名不能为空");
                    } else if (type == TYPE_ID_CARD) {
                        ToastUtil.show("身份证号不能为空");
                    } else if (type == TYPE_UNIT) {
                        ToastUtil.show("当前单位/院校不能为空");
                    } else if (type == TYPE_SCHOOL) {
                        ToastUtil.show("毕业院校不能为空");
                    }
                }

                break;
        }
    }

    private void submitInfo(final String trim, final int type) {
        Single.create(new SingleOnSubscribe<MyInfoUpdateResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyInfoUpdateResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                Any any = null;
                if (type == TYPE_NICKNAME) {
                    InfoNickName infoNickName = InfoNickName.newBuilder().setNickName(trim).build();
                    any = Any.pack(infoNickName);
                } else if (type == TYPE_NAME) {
                    InfoRealName infoRealName = InfoRealName.newBuilder().setRealName(trim).build();
                    any = Any.pack(infoRealName);
                } else if (type == TYPE_ID_CARD) {
                    InfoIdNumber infoIdNumber = InfoIdNumber.newBuilder().setIdNumber(trim).build();
                    any = Any.pack(infoIdNumber);
                }else if (type == TYPE_UNIT) {
                    InfoWorkUnit infoWorkUnit= InfoWorkUnit.newBuilder().setWorkUnit(trim).build();
                    any = Any.pack(infoWorkUnit);
                } else if (type == TYPE_SCHOOL) {
                    InfoGraduatedSchool infoGraduatedSchool = InfoGraduatedSchool.newBuilder().setGraduatedSchool(trim).build();
                    any = Any.pack(infoGraduatedSchool);
                }
                MyInfoUpdateRequest myInfoUpdateRequest = MyInfoUpdateRequest.newBuilder().setUserId(preferencesHelper.getUserId()).addField(any).build();
                MyInfoUpdateResponse response = stub.updateUserInfo(myInfoUpdateRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyInfoUpdateResponse>() {
            @Override
            public void onSuccess(MyInfoUpdateResponse myInfoUpdateResponse) {
                mdialog.dismiss();
                Intent intent = new Intent();
                intent.putExtra("nickname", trim);
                setResult(RESULT_OK, intent);
                finish();
            }

            @Override
            public void onError(Throwable e) {
                mdialog.dismiss();
                ToastUtil.show("访问服务器错误");
            }
        });
    }
}
