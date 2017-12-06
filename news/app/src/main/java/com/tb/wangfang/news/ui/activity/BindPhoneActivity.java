package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.wanfang.personal.GetPhoneCaptchaRequest;
import com.wanfang.personal.GetPhoneCaptchaResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.grpc.ManagedChannel;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import static me.iwf.photopicker.PhotoPreview.REQUEST_CODE;


public class BindPhoneActivity extends SimpleActivity {

    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    @BindView(R.id.tv_pre_num)
    TextView tvPreNum;
    @BindView(R.id.edit_phonenum)
    AppCompatEditText editPhonenum;
    @BindView(R.id.edit_security)
    AppCompatEditText editSecurity;
    @BindView(R.id.tv_get_code)
    TextView tvGetCode;
    @BindView(R.id.ll_quick)
    LinearLayout llQuick;
    @BindView(R.id.btn_login)
    Button btnLogin;
    private String phoneCaprcha;
    private int countDown = 60;
    private String TAG = "BindPhoneActivity";
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                if (countDown > 0) {
                    countDown--;
                    Message message = new Message();
                    message.what = 0;
                    handler.sendMessageDelayed(message, 1000);
                    tvGetCode.setText(countDown + "s");

                } else {
                    handler.removeMessages(0);
                    tvGetCode.setText("获取验证码");
                    countDown = 60;
                    tvGetCode.setEnabled(true);
                }
            }
        }
    };

    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_bind_phone;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_return, R.id.iv_menu, R.id.tv_pre_num, R.id.tv_get_code, R.id.btn_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
                break;
            case R.id.iv_menu:
                Intent intent2 = new Intent(BindPhoneActivity.this, CaptureActivity.class);
                startActivityForResult(intent2, REQUEST_CODE);
                break;
            case R.id.tv_pre_num:
                Intent intent = new Intent(this, CountryCodeActivity.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.tv_get_code:
                String phone = editPhonenum.getText().toString();
                if (!TextUtils.isEmpty(phone) && !TextUtils.isEmpty(phone.trim())) {
                    phone = phone.trim();
                    if (SystemUtil.isMobileNO(phone)) {

                        if (preferencesHelper.CheckSmsTen()) {
//                            SharedPreferences sharedPreferences = App.getInstance().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
//                            String oldData = sharedPreferences.getString(Constants.SMS_RECORD, "");
//                            SharedPreferences.Editor editor = sharedPreferences.edit();//获取编辑器
//                            editor.putString(Constants.SMS_RECORD, oldData + DateUtils.formatDate("yyyy-MM-dd HH:mm") + ",");
//                            editor.commit();//提交修改
                            getPhoneCaptcha(phone, tvPreNum.getText().toString().replace("+", ""));

                        } else {
                            ToastUtil.shortShow("发送验证短信已超过数量限制");
                        }

                    } else {
                        ToastUtil.show("手机格式不正确");
                    }
                } else {
                    ToastUtil.show("手机号码不能为空");
                }
                break;

            case R.id.btn_login:
                break;
        }
    }

    private void getPhoneCaptcha(final String phone, String nation) {
        phoneCaprcha = SystemUtil.getRandomSixNum();
        btnLogin.setEnabled(false);
        Single.create(new SingleOnSubscribe<GetPhoneCaptchaResponse>() {
            @Override
            public void subscribe(SingleEmitter<GetPhoneCaptchaResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                GetPhoneCaptchaRequest request = GetPhoneCaptchaRequest.newBuilder().setPhoneNumber(phone).setNation("0086").setMessageType("Register").setPhoneCaptcha(phoneCaprcha).build();
                GetPhoneCaptchaResponse response = stub.getPhoneCaptcha(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<GetPhoneCaptchaResponse>() {
            @Override
            public void onSuccess(GetPhoneCaptchaResponse response) {
                Log.d(TAG, "onSuccess: " + response.getStatus());
                if (response.getStatus() == 200) {
                    Message msg = new Message();
                    msg.what = 0;
                    handler.sendMessage(msg);
                    ToastUtil.show("发送成功");
                    preferencesHelper.putCurrentTime();

                } else {
                    ToastUtil.show("发送失败");
                    tvGetCode.setEnabled(true);
                }


            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.shortShow("服务器错误");

            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /**
         * 处理二维码扫描结果
         */
        if (requestCode == REQUEST_CODE) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(BindPhoneActivity.this, "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(BindPhoneActivity.this, "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
