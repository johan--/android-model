package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.CodeUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class BindEmaillActivity extends SimpleActivity {


    @BindView(R.id.tv_return)
    ImageView tvReturn;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    @BindView(R.id.edit_account)
    AppCompatEditText editAccount;
    @BindView(R.id.edit_graph_code)
    AppCompatEditText editGraphCode;
    @BindView(R.id.iv_graph)
    ImageView ivGraph;
    private MaterialDialog mdialog;

    @Override
    protected int getLayout() {
        return R.layout.activity_bind_emaill;
    }

    @Override
    protected void initEventAndData() {
        ivGraph.setImageBitmap(CodeUtils.getInstance().createBitmap(SystemUtil.dp2px(this, 80), SystemUtil.dp2px(this, 40)));

    }


    @OnClick({R.id.tv_return, R.id.iv_menu, R.id.iv_graph, R.id.btn_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                break;
            case R.id.iv_menu:
                break;
            case R.id.iv_graph:
                break;
            case R.id.btn_login:
                String account = editAccount.getText().toString();
                String graphCode = editGraphCode.getText().toString();
                if (!TextUtils.isEmpty(account) && !TextUtils.isEmpty(account.trim())) {
//                            if (!TextUtils.isEmpty(graphCode) && !TextUtils.isEmpty(graphCode.trim())) {
//                                if (graphCode.equals(CodeUtils.getInstance().getCode())) {
                    mdialog = new MaterialDialog.Builder(this)
                            .title("绑定中")
                            .progress(true, 0)
                            .progressIndeterminateStyle(true)
                            .show();
                    BindLogin(account);
//                                } else {
//                                    ToastUtil.show("图形码不正确，请重新输入");
//                                }
//                            } else {
//                                ToastUtil.show("请输入图形验证码");
//                            }
                } else {
                    ToastUtil.show("请输入账号");
                }
                break;
        }
    }

    private void BindLogin(String account) {

    }

}
