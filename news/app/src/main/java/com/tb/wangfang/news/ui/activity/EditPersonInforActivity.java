package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.Glide;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.GlideCircleTransform;
import com.tb.wangfang.news.widget.datapick.DatePicker;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;
import me.iwf.photopicker.PhotoPicker;

public class EditPersonInforActivity extends SimpleActivity {


    @BindView(R.id.iv_user_icon)
    ImageView ivUserIcon;
    @BindView(R.id.tv_user_name)
    TextView tvUserName;
    @BindView(R.id.et_nickname)
    TextView etNickname;
    @BindView(R.id.et_name)
    TextView etName;
    @BindView(R.id.et_id_country)
    TextView etIdCountry;
    @BindView(R.id.et_gender)
    TextView etGender;
    @BindView(R.id.et_birthday)
    TextView etBirthday;
    @BindView(R.id.et_job_title)
    TextView etJobTitle;
    @BindView(R.id.et_unit)
    TextView etUnit;
    @BindView(R.id.et_education)
    TextView etEducation;
    @BindView(R.id.et_graduate_school)
    TextView etGraduateSchool;
    @BindView(R.id.et_reward)
    TextView etReward;
    @BindView(R.id.et_subject)
    TextView etSubject;
    @BindView(R.id.et_interest)
    TextView etInterest;
    private String TAG = "EditPersonInforActivity";
    String[] s = new String[]{"男", "女"};

    @Override
    protected int getLayout() {
        return R.layout.activity_edit_person_infor;
    }

    @Override
    protected void initEventAndData() {

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == PhotoPicker.REQUEST_CODE) {
            if (data != null) {
                ArrayList<String> photos =
                        data.getStringArrayListExtra(PhotoPicker.KEY_SELECTED_PHOTOS);
                Glide.with(this).load(photos.get(0)).transform(new GlideCircleTransform(this)).into(ivUserIcon);
            }
        }
        if (resultCode == RESULT_OK && requestCode == editNackNameActivity.TYPE_NICKNAME) {
            if (data != null) {
                String nickname = data.getStringExtra("nickname");
                etNickname.setText(nickname);
            }
        }
        if (resultCode == RESULT_OK && requestCode == editNackNameActivity.TYPE_NAME) {
            if (data != null) {
                String name = data.getStringExtra("nickname");
                etName.setText(name);
            }
        }
        if (resultCode == RESULT_OK && requestCode == editNackNameActivity.TYPE_ID_CARD) {
            if (data != null) {
                String name = data.getStringExtra("nickname");
                etIdCountry.setText(name);
            }
        }
    }


    @OnClick({R.id.tv_return, R.id.iv_user_icon, R.id.rl_nickname, R.id.rl_name, R.id.rl_id_country, R.id.rl_gender, R.id.rl_birthday, R.id.rl_job_title, R.id.rl_unit, R.id.rl_education, R.id.rl_graduate_school, R.id.rl_reward, R.id.rl_subject, R.id.rl_interest})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.iv_user_icon:
                PhotoPicker.builder()
                        .setPhotoCount(1)
                        .setPreviewEnabled(false).start(this, PhotoPicker.REQUEST_CODE);
                Log.d(TAG, "onDraw: " + Thread.currentThread().getId());
                break;
            case R.id.rl_nickname:
                Intent intent = new Intent(this, editNackNameActivity.class);
                intent.putExtra("type", editNackNameActivity.TYPE_NICKNAME);
                startActivityForResult(intent, editNackNameActivity.TYPE_NICKNAME);
                break;
            case R.id.rl_name:
                Intent intent2 = new Intent(this, editNackNameActivity.class);
                intent2.putExtra("type", editNackNameActivity.TYPE_NAME);
                startActivityForResult(intent2, editNackNameActivity.TYPE_NAME);
                break;
            case R.id.rl_id_country:
                Intent intent3 = new Intent(this, editNackNameActivity.class);
                intent3.putExtra("type", editNackNameActivity.TYPE_ID_CARD);
                startActivityForResult(intent3, editNackNameActivity.TYPE_ID_CARD);
                break;
            case R.id.rl_gender:
                new MaterialDialog.Builder(this)
                        .title("请选择性别")
                        .items(s)
                        .itemsCallbackSingleChoice(
                                2, new MaterialDialog.ListCallbackSingleChoice() {
                                    @Override
                                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                        etGender.setText(text);
                                        return true;
                                    }
                                }
                        )
                        .positiveText("确定")
                        .show();
                break;
            case R.id.rl_birthday:
                final DatePicker picker = new DatePicker(this);
                picker.setCanceledOnTouchOutside(true);
                picker.setUseWeight(true);
                picker.setTopPadding(SystemUtil.dp2px(this, 10));
                picker.setRangeEnd(2111, 1, 11);
                picker.setRangeStart(2016, 8, 29);
                picker.setSelectedItem(2050, 10, 14);
                picker.setResetWhileWheel(false);
                picker.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
                    @Override
                    public void onDatePicked(String year, String month, String day) {
                        ToastUtil.show(year + "-" + month + "-" + day);
                    }
                });
                picker.setOnWheelListener(new DatePicker.OnWheelListener() {
                    @Override
                    public void onYearWheeled(int index, String year) {
                        picker.setTitleText(year + "-" + picker.getSelectedMonth() + "-" + picker.getSelectedDay());
                    }

                    @Override
                    public void onMonthWheeled(int index, String month) {
                        picker.setTitleText(picker.getSelectedYear() + "-" + month + "-" + picker.getSelectedDay());
                    }

                    @Override
                    public void onDayWheeled(int index, String day) {
                        picker.setTitleText(picker.getSelectedYear() + "-" + picker.getSelectedMonth() + "-" + day);
                    }
                });
                picker.show();

                break;
            case R.id.rl_job_title:
                break;
            case R.id.rl_unit:
                break;
            case R.id.rl_education:
                break;
            case R.id.rl_graduate_school:
                break;
            case R.id.rl_reward:
                break;
            case R.id.rl_subject:
                break;
            case R.id.rl_interest:
                break;
        }
    }
}
