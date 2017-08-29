package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;

public class editNackNameActivity extends SimpleActivity {


    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.et_name)
    EditText etName;
    final static int TYPE_NICKNAME = 0;
    final static int TYPE_NAME = 1;
    final static int TYPE_ID_CARD = 2;

    private int type;

    @Override
    protected int getLayout() {
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
                        Intent intent = new Intent();
                        intent.putExtra("nickname", etName.getText().toString().trim());
                        setResult(RESULT_OK, intent);
                        finish();
                    } else {
                        if (type == TYPE_NICKNAME) {
                            ToastUtil.show("昵称不能是空格");
                        } else if (type == TYPE_NAME) {
                            ToastUtil.show("姓名不能是空格");
                        } else if (type == TYPE_ID_CARD) {
                            ToastUtil.show("身份证号不能是空格");
                        }

                    }
                } else {
                    if (type == TYPE_NICKNAME) {
                        ToastUtil.show("昵称不能为空");
                    } else if (type == TYPE_NAME) {
                        ToastUtil.show("姓名不能为空");
                    } else if (type == TYPE_ID_CARD) {
                        ToastUtil.show("身份证号不能为空");
                    }
                }

                break;
        }
    }
}
