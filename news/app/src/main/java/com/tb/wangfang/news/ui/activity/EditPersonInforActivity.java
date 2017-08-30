package com.tb.wangfang.news.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.Glide;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.GlideCircleTransform;
import com.tb.wangfang.news.widget.WaveView;
import com.tb.wangfang.news.widget.datapick.DatePicker;

import java.util.ArrayList;
import java.util.List;

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
    @BindView(R.id.wv_ge)
    WaveView wvGe;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.rl_name)
    RelativeLayout rlName;
    @BindView(R.id.tv_id_country)
    TextView tvIdCountry;
    @BindView(R.id.rl_id_country)
    RelativeLayout rlIdCountry;
    @BindView(R.id.tv_gender)
    TextView tvGender;
    @BindView(R.id.rl_gender)
    RelativeLayout rlGender;
    @BindView(R.id.tv_birthday)
    TextView tvBirthday;
    @BindView(R.id.rl_birthday)
    RelativeLayout rlBirthday;
    @BindView(R.id.tv_job_title)
    TextView tvJobTitle;
    @BindView(R.id.rl_job_title)
    RelativeLayout rlJobTitle;
    @BindView(R.id.tv_unit)
    TextView tvUnit;
    @BindView(R.id.rl_unit)
    RelativeLayout rlUnit;
    @BindView(R.id.tv_education)
    TextView tvEducation;
    @BindView(R.id.rl_education)
    RelativeLayout rlEducation;
    @BindView(R.id.tv_graduate_school)
    TextView tvGraduateSchool;
    @BindView(R.id.rl_graduate_school)
    RelativeLayout rlGraduateSchool;
    @BindView(R.id.tv_reward)
    TextView tvReward;
    @BindView(R.id.rl_reward)
    RelativeLayout rlReward;
    @BindView(R.id.tv_subject)
    TextView tvSubject;
    @BindView(R.id.rl_subject)
    RelativeLayout rlSubject;
    @BindView(R.id.tv_interest)
    TextView tvInterest;
    @BindView(R.id.rl_interest)
    RelativeLayout rlInterest;
    private String TAG = "EditPersonInforActivity";
    String[] s = new String[]{"男", "女"};

    @Override
    protected int getLayout() {
        return R.layout.activity_edit_person_infor;
    }

    @Override
    protected void initEventAndData() {


        List<Animator> animators = new ArrayList<>();

        // horizontal animation.
        // wave waves infinitely.
        ObjectAnimator waveShiftAnim = ObjectAnimator.ofFloat(
                wvGe, "waveShiftRatio", 0f, 1f);
        waveShiftAnim.setRepeatCount(ValueAnimator.INFINITE);
        waveShiftAnim.setDuration(1000);
        waveShiftAnim.setInterpolator(new LinearInterpolator());
        animators.add(waveShiftAnim);


        wvGe.setWaterLevelRatio(0.3f);
        // amplitude animation.
        // wave grows big then grows small, repeatedly
        ObjectAnimator amplitudeAnim = ObjectAnimator.ofFloat(
                wvGe, "amplitudeRatio", 0.1f, 0.3f);
        amplitudeAnim.setRepeatCount(ValueAnimator.INFINITE);
        amplitudeAnim.setRepeatMode(ValueAnimator.REVERSE);
        amplitudeAnim.setDuration(5000);
        amplitudeAnim.setInterpolator(new LinearInterpolator());
        animators.add(amplitudeAnim);

        AnimatorSet mAnimatorSet = new AnimatorSet();
        mAnimatorSet.playTogether(animators);
        wvGe.setShowWave(true);
        if (mAnimatorSet != null) {
            mAnimatorSet.start();
        }
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
            } else {
                etNickname.setHint("未填写");
                etNickname.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == editNackNameActivity.TYPE_NAME) {
            if (data != null) {
                String name = data.getStringExtra("nickname");
                etName.setText(name);
            } else {
                etName.setHint("未填写");
                etName.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == editNackNameActivity.TYPE_ID_CARD) {
            if (data != null) {
                String name = data.getStringExtra("nickname");
                etIdCountry.setText(name);
            } else {
                etIdCountry.setHint("未填写");
                etIdCountry.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == PersonEditListActivity.TYPE_JOB_TITLE) {
            if (data != null) {
                String item = data.getStringExtra("item");
                etJobTitle.setText(item);
            } else {
                etJobTitle.setHint("未填写");
                etJobTitle.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == PersonEditListActivity.TYPE_UNIT) {
            if (data != null) {
                String unit = data.getStringExtra("item");
                etUnit.setText(unit);
            } else {
                etUnit.setHint("未填写");
                etUnit.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == PersonEditListActivity.TYPE_EDUCATION) {
            if (data != null) {
                String unit = data.getStringExtra("item");
                etEducation.setText(unit);
            } else {
                etEducation.setHint("未填写");
                etEducation.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == PersonEditListActivity.TYPE_GRADUATE_SCHOOL) {
            if (data != null) {
                String unit = data.getStringExtra("item");
                etGraduateSchool.setText(unit);
            } else {
                etGraduateSchool.setHint("未填写");
                etGraduateSchool.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == PersonEditListActivity.TYPE_SUBJECT) {
            if (data != null) {
                String unit = data.getStringExtra("item");
                etSubject.setText(unit);
            } else {
                etSubject.setHint("未填写");
                etSubject.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == 8) {
            if (data != null) {
                String experience = data.getStringExtra("experience");
                etReward.setText(experience);
            } else {
                etReward.setHint("未填写");
                etReward.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == 9) {
            if (data != null) {
                String experience = data.getStringExtra("experience");
                etInterest.setText(experience);
            } else {
                etInterest.setHint("未填写");
                etInterest.setText("");
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
                intent.putExtra("content", etNickname.getText().toString().trim());
                startActivityForResult(intent, editNackNameActivity.TYPE_NICKNAME);
                break;
            case R.id.rl_name:
                Intent intent2 = new Intent(this, editNackNameActivity.class);
                intent2.putExtra("type", editNackNameActivity.TYPE_NAME);
                intent2.putExtra("content", etName.getText().toString().trim());
                startActivityForResult(intent2, editNackNameActivity.TYPE_NAME);
                break;
            case R.id.rl_id_country:
                Intent intent3 = new Intent(this, editNackNameActivity.class);
                intent3.putExtra("type", editNackNameActivity.TYPE_ID_CARD);
                intent3.putExtra("content", etIdCountry.getText().toString().trim());
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
                Intent intent4 = new Intent(this, PersonEditListActivity.class);
                intent4.putExtra("type", PersonEditListActivity.TYPE_JOB_TITLE);
                startActivityForResult(intent4, PersonEditListActivity.TYPE_JOB_TITLE);
                break;
            case R.id.rl_unit:
                Intent intent5 = new Intent(this, PersonEditListActivity.class);
                intent5.putExtra("type", PersonEditListActivity.TYPE_UNIT);
                startActivityForResult(intent5, PersonEditListActivity.TYPE_UNIT);
                break;
            case R.id.rl_education:
                Intent intent6 = new Intent(this, PersonEditListActivity.class);
                intent6.putExtra("type", PersonEditListActivity.TYPE_EDUCATION);
                startActivityForResult(intent6, PersonEditListActivity.TYPE_EDUCATION);
                break;
            case R.id.rl_graduate_school:
                Intent intent7 = new Intent(this, PersonEditListActivity.class);
                intent7.putExtra("type", PersonEditListActivity.TYPE_GRADUATE_SCHOOL);
                startActivityForResult(intent7, PersonEditListActivity.TYPE_GRADUATE_SCHOOL);
                break;
            case R.id.rl_reward:
                Intent intent9 = new Intent(this, EditRewardActivity.class);
                intent9.putExtra("experience", etReward.getText().toString().trim());
                startActivityForResult(intent9, 8);
                break;
            case R.id.rl_subject:
                Intent intent8 = new Intent(this, PersonEditListActivity.class);
                intent8.putExtra("type", PersonEditListActivity.TYPE_SUBJECT);
                startActivityForResult(intent8, PersonEditListActivity.TYPE_SUBJECT);
                break;
            case R.id.rl_interest:
                Intent intent10 = new Intent(this, EditRewardActivity.class);
                intent10.putExtra("experience", etInterest.getText().toString().trim());
                startActivityForResult(intent10, 9);
                break;
        }
    }


}
