package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.InputType;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.LoginContract;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.presenter.LoginPresenter;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.CodeUtils;
import com.wanfang.grpcCommon.MsgError;
import com.wanfang.personal.LoginResponse;


import java.util.HashMap;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.wechat.friends.Wechat;

import static android.support.design.widget.TabLayout.OnTabSelectedListener;
import static android.support.design.widget.TabLayout.Tab;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View, PlatformActionListener {

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.tv_return)
    ImageView tvReturn;
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
    @BindView(R.id.tv_find_password)
    TextView tvFindPassword;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @BindView(R.id.iv_qq_share)
    ImageView ivQqShare;
    @BindView(R.id.iv_weichat_share)
    ImageView ivWeichatShare;
    @BindView(R.id.iv_weibo_share)
    ImageView ivWeiboShare;
    @BindView(R.id.edit_account)
    AppCompatEditText editAccount;
    @BindView(R.id.edit_password)
    AppCompatEditText editPassword;
    @BindView(R.id.iv_password_is_see)
    ImageView ivPasswordIsSee;
    @BindView(R.id.edit_graph_code)
    AppCompatEditText editGraphCode;
    @BindView(R.id.iv_graph)
    ImageView ivGraph;
    @BindView(R.id.ll_common)
    LinearLayout llCommon;
    boolean passwordIsSee = false;
    @Inject
    ImplPreferencesHelper PreferencesHelper;
    private MaterialDialog mdialog;
    private String TAG = "LoginActivity";


    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initEventAndData() {
        tvFindPassword.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvFindPassword.getPaint().setAntiAlias(true);
        tvRegister.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvRegister.getPaint().setAntiAlias(true);
        tabLayout.addTab(tabLayout.newTab().setText("快捷登录"));
        tabLayout.addTab(tabLayout.newTab().setText("普通登录"));
        tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                if (tab.getText().equals("快捷登录")) {
                    llQuick.setVisibility(View.VISIBLE);
                    llCommon.setVisibility(View.GONE);
                } else {
                    llQuick.setVisibility(View.GONE);
                    llCommon.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onTabUnselected(Tab tab) {

            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });
        ivGraph.setImageBitmap(CodeUtils.getInstance().createBitmap(SystemUtil.dp2px(this, 80), SystemUtil.dp2px(this, 40)));

    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation

        editPassword.setInputType(InputType.TYPE_CLASS_TEXT
                | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        editGraphCode.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        editAccount.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

    }

    @OnClick({R.id.tv_return, R.id.tv_pre_num, R.id.tv_get_code, R.id.ll_quick, R.id.btn_login, R.id.tv_find_password, R.id.tv_register, R.id.iv_qq_share,
            R.id.iv_weichat_share, R.id.iv_weibo_share, R.id.iv_graph})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                this.finish();
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

                        if (checkSMSCountIsLessThanTen()) {
//                            SharedPreferences sharedPreferences = App.getInstance().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
//                            String oldData = sharedPreferences.getString(Constants.SMS_RECORD, "");
//                            SharedPreferences.Editor editor = sharedPreferences.edit();//获取编辑器
//                            editor.putString(Constants.SMS_RECORD, oldData + DateUtils.formatDate("yyyy-MM-dd HH:mm") + ",");
//                            editor.commit();//提交修改
                            mPresenter.getPhoneCaptcha(phone, tvPreNum.getText().toString().replace("+", ""));

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
            case R.id.ll_quick:

                String DynamicCode = editSecurity.getText().toString();

                break;
            case R.id.btn_login:
                if (tabLayout.getSelectedTabPosition() == 0) {
                    String phoneNum = editPhonenum.getText().toString();
                    String captcha = editSecurity.getText().toString();
                    if (!TextUtils.isEmpty(phoneNum) && !TextUtils.isEmpty(phoneNum.trim())) {
                        if (!TextUtils.isEmpty(captcha) && !TextUtils.isEmpty(captcha.trim()) && captcha.trim().equals(mPresenter.getPhoneCaprcha())) {
                            mdialog = new MaterialDialog.Builder(this)
                                    .title("登录中")
                                    .progress(true, 0)
                                    .progressIndeterminateStyle(true)
                                    .show();
                            mPresenter.quickLogin(phoneNum, captcha, SystemUtil.getDeviceId(this));
                        } else {
                            ToastUtil.show("请输入正确的手机验证码");
                        }

                    } else {
                        ToastUtil.show("请输入手机号码");
                    }
                } else {
                    String account = editAccount.getText().toString();
                    String passWord = editPassword.getText().toString();
                    String graphCode = editGraphCode.getText().toString();
                    if (!TextUtils.isEmpty(account) && !TextUtils.isEmpty(account.trim())) {
                        if (!TextUtils.isEmpty(passWord) && !TextUtils.isEmpty(passWord.trim())) {
                            if (!TextUtils.isEmpty(graphCode) && !TextUtils.isEmpty(graphCode.trim())) {
                                if (graphCode.equals(CodeUtils.getInstance().getCode())) {
                                    mdialog = new MaterialDialog.Builder(this)
                                            .title("登录中")
                                            .progress(true, 0)
                                            .progressIndeterminateStyle(true)
                                            .show();
                                    mPresenter.AccountLogin(account, passWord);
                                } else {
                                    ToastUtil.show("图形码不正确，请重新输入");
                                }
                            } else {
                                ToastUtil.show("请输入图形验证码");
                            }
                        } else {
                            ToastUtil.show("请输入密码");
                        }
                    } else {
                        ToastUtil.show("请输入账号");
                    }
                }

                break;
            case R.id.tv_find_password:
                Intent intent1 = new Intent(this, FindPassWordActivity1.class);
                startActivity(intent1);
                break;
            case R.id.tv_register:
                Intent intent2 = new Intent(this, RegisterActivity.class);
                startActivity(intent2);
                break;
            case R.id.iv_qq_share:
                break;
            case R.id.iv_weichat_share:
                weichatLogin();
                break;
            case R.id.iv_weibo_share:
                weiboLogin();
                break;
            case R.id.iv_graph:
                ivGraph.setImageBitmap(CodeUtils.getInstance().createBitmap(SystemUtil.dp2px(this, 80), SystemUtil.dp2px(this, 40)));
                break;
        }
    }

    private boolean checkSMSCountIsLessThanTen() {

        return mPresenter.checkDifftimeCount();

    }

    private void weiboLogin() {
        Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);
        weibo.SSOSetting(false);  //设置false表示使用SSO授权方式
        weibo.setPlatformActionListener(this); // 设置分享事件回调
        weibo.authorize();//单独授权
        weibo.showUser(null);//授权并获取用户信息
    }

    private void weichatLogin() {

        Platform wechat = ShareSDK.getPlatform(Wechat.NAME);
        wechat.SSOSetting(false);
//回调信息，可以在这里获取基本的授权返回的信息，但是注意如果做提示和UI操作要传到主线程handler里去执行
        wechat.setPlatformActionListener(this);
//authorize与showUser单独调用一个即可
        wechat.authorize();//单独授权,OnComplete返回的hashmap是空的
        wechat.showUser(null);
//移除授权
//weibo.removeAccount(true);
    }


    @OnClick(R.id.iv_password_is_see)
    public void onViewClicked() {
        if (passwordIsSee) {
            ivPasswordIsSee.setImageResource(R.mipmap.password_open);
            passwordIsSee = false;
            // 显示为普通文本
            editPassword
                    .setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            // 使光标始终在最后位置
            Editable etable = editPassword.getText();
            Selection.setSelection(etable, etable.length());

        } else {
            ivPasswordIsSee.setImageResource(R.mipmap.password_close);
            passwordIsSee = true;
            // 显示为密码
            editPassword.setInputType(InputType.TYPE_CLASS_TEXT
                    | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            // 使光标始终在最后位置
            Editable etable = editPassword.getText();
            Selection.setSelection(etable, etable.length());
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && data != null) {
            tvPreNum.setText(data.getExtras().getString("phone"));
        }
    }

    @Override
    public void loginSuccess(LoginResponse response) {
        if (mdialog != null) {
            mdialog.dismiss();
        }

        if (TextUtils.isEmpty(response.getLoginToken())) {
            if (response.getError().getErrorMessage().getErrorCode() == MsgError.ErrorCode.NO_REGIST) {
                ToastUtil.shortShow("用户名不存在");
            } else if (response.getError().getErrorMessage().getErrorCode() == MsgError.ErrorCode.PASS_ERROR) {
                ToastUtil.shortShow("密码错误");
            } else {
                ToastUtil.show("访问失败");
            }

        } else {
            ToastUtil.shortShow("登录成功");
            PreferencesHelper.setLoginState(true);
            finish();
        }
    }


    @Override
    public void showCountDown(int num) {
        if (num > 0) {
            tvGetCode.setText(num + "s");
        } else {
            tvGetCode.setText("获取验证码");

        }
    }

    @Override
    public void showDialoge(final String id, final String type) {
        new MaterialDialog.Builder(this).title("请绑定万方账号")
                .items(R.array.third_select)
                .itemsCallback(new MaterialDialog.ListCallback() {
                    @Override
                    public void onSelection(MaterialDialog dialog, View itemView, int position, CharSequence text) {
                        if (position == 0) {
                            Intent intent = new Intent(LoginActivity.this, BindwanfangAccountActivity.class);
                            intent.putExtra("uid", id);
                            intent.putExtra("type", type);
                            startActivity(intent);
                        } else {
                            Intent intent2 = new Intent(LoginActivity.this, RegisterActivity.class);
                            intent2.putExtra("uid", id);
                            intent2.putExtra("type", type);
                            startActivity(intent2);
                        }
                    }
                }).show();

    }

    @Override
    public void prefinish() {
        finish();
    }

    @Override
    public void setCodeBtnEnable() {
        tvGetCode.setEnabled(true);
    }

    @Override
    public void setCodeBtnDisable() {
        tvGetCode.setEnabled(false);
    }

    @Override
    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        String id = null;
        int type = 0;// 第三方类型code(0：QQ，1：微博，2：微信)
        if (platform.getName().equals("Wechat")) {
            id = (String) hashMap.get("openid");//授权用户唯一标识
            String unionid = (String) hashMap.get("unionid");// 当且仅当该移动应用已获得该用户的userinfo授权时，才会出现该字段
            type = 2;
        }
        mPresenter.thirdLogin(id, type);
    }


    @Override
    public void onError(Platform platform, int i, Throwable throwable) {
        if (platform.getName().equals("Wechat")) {
            if (i == 1) {
                ToastUtil.show("请安装微信客户端");
            }
        } else {
            ToastUtil.show(throwable.getMessage());
        }
    }

    @Override
    public void onCancel(Platform platform, int i) {
        Log.d(TAG, "onCancel: " + i);
        ToastUtil.show("oncancel");
    }
}
