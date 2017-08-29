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

public class EditRewardActivity extends SimpleActivity {


    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(R.id.et_experience)
    EditText etExperience;
    @BindView(R.id.tv_limit)
    TextView tvLimit;
    private int num = 100;
    public final static int TYPE_REWARD = 8;
    public final static int TYPE_INTREST = 9;
    private int type;

    @Override
    protected int getLayout() {
        return R.layout.activity_edit_reward;
    }

    @Override
    protected void initEventAndData() {
        if (!TextUtils.isEmpty(getIntent().getStringExtra("experience"))) {
            etExperience.setText(getIntent().getStringExtra("experience"));
            etExperience.setSelection(etExperience.length());
        }
        type = getIntent().getIntExtra("type", TYPE_REWARD);
        if (type == TYPE_REWARD) {
            tvPageTitle.setText("获奖经历");
        } else if (type == TYPE_INTREST) {
            tvPageTitle.setText("感兴趣的内容");
        }
//etNoteContent是EditText
        etExperience.addTextChangedListener(new TextWatcher() {
            private CharSequence wordNum;//记录输入的字数
            private int selectionStart;
            private int selectionEnd;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                wordNum = s;//实时记录输入的字数
            }

            @Override
            public void afterTextChanged(Editable s) {
                int number = num - s.length();
                //TextView显示剩余字数
                tvLimit.setText(num - number + "/" + num);
                selectionStart = etExperience.getSelectionStart();
                selectionEnd = etExperience.getSelectionEnd();
                if (wordNum.length() > num) {
                    //删除多余输入的字（不会显示出来）
                    s.delete(selectionStart - 1, selectionEnd);
                    int tempSelection = selectionEnd;
                    etExperience.setText(s);
                    etExperience.setSelection(tempSelection);//设置光标在最后
                }
            }
        });
    }


    @OnClick({R.id.tv_return, R.id.tv_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.tv_save:
                if (!TextUtils.isEmpty(etExperience.getText().toString()) && !TextUtils.isEmpty(etExperience.getText().toString().trim())) {
                    Intent intent = new Intent();
                    intent.putExtra("experience", etExperience.getText().toString().trim());
                    setResult(RESULT_OK, intent);
                    finish();
                } else {

                    ToastUtil.show("填写内容不能为空!");
                }
                break;
        }
    }
}
