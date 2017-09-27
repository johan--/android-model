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
import com.wanfang.personal.LoginResponse;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

import static android.support.design.widget.TabLayout.OnTabSelectedListener;
import static android.support.design.widget.TabLayout.Tab;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {

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
                break;
            case R.id.ll_quick:
                break;
            case R.id.btn_login:
                String account = editAccount.getText().toString();
                String passWord = editPassword.getText().toString();
                String graphCode = editGraphCode.getText().toString();
                if (!TextUtils.isEmpty(account) && !TextUtils.isEmpty(account.trim())) {
                    if (!TextUtils.isEmpty(passWord) && !TextUtils.isEmpty(passWord.trim())) {
                        if (!TextUtils.isEmpty(graphCode) && !TextUtils.isEmpty(graphCode.trim())) {
                            if (graphCode.equals(CodeUtils.getInstance().getCode())) {
                                mdialog = new MaterialDialog.Builder(this)
                                        .title("登录中")
                                        .content("请等待")
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
                break;
            case R.id.iv_weibo_share:
                break;
            case R.id.iv_graph:
                ivGraph.setImageBitmap(CodeUtils.getInstance().createBitmap(SystemUtil.dp2px(this, 80), SystemUtil.dp2px(this, 40)));
                break;
        }
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
        mdialog.dismiss();
        if (response == null) {
            ToastUtil.show("访问失败");
            PreferencesHelper.setLoginState(true);
            finish();
        } else {
            ToastUtil.show("登录成功");
            PreferencesHelper.setLoginState(true);
            finish();
        }
    }
}
