package com.tb.wangfang.news.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.Glide;
import com.google.protobuf.Any;
import com.soundcloud.android.crop.Crop;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.utils.SystemUtil;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.GlideCircleTransform;
import com.tb.wangfang.news.widget.WaveView;
import com.tb.wangfang.news.widget.datapick.DatePicker;
import com.wanfang.personal.EducationLevelListRequest;
import com.wanfang.personal.EducationLevelListResponse;
import com.wanfang.personal.InfoBirthday;
import com.wanfang.personal.InfoSex;
import com.wanfang.personal.MyInfoRequest;
import com.wanfang.personal.MyInfoResponse;
import com.wanfang.personal.MyInfoUpdateRequest;
import com.wanfang.personal.MyInfoUpdateResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.SubjectListRequest;
import com.wanfang.personal.SubjectListResponse;
import com.wanfang.personal.SubjectMessage;
import com.wanfang.personal.UserRolesListRequest;
import com.wanfang.personal.UserRolesListResponse;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import me.iwf.photopicker.PhotoPicker;

import static com.tb.wangfang.news.ui.activity.EditNackNameActivity.TYPE_ID_CARD;
import static com.tb.wangfang.news.ui.activity.EditNackNameActivity.TYPE_NAME;
import static com.tb.wangfang.news.ui.activity.EditNackNameActivity.TYPE_SCHOOL;
import static com.tb.wangfang.news.ui.activity.EditNackNameActivity.TYPE_UNIT;

public class EditPersonInforActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;

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
    private Uri destination;
    private int UnifolderNum = 0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            UnifolderNum++;
            if (UnifolderNum == 3) {
                loadData();
            }
        }
    };


    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
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

        final AnimatorSet mAnimatorSet = new AnimatorSet();
        mAnimatorSet.playTogether(animators);
        wvGe.setShowWave(true);
        if (mAnimatorSet != null) {
            mAnimatorSet.start();
        }
        if (preferencesHelper.getUserRolesMap() == null) {
            loadMapTable();
        } else {
            loadData();
        }


    }

    private void loadData() {
        Single.create(new SingleOnSubscribe<MyInfoResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyInfoResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                MyInfoRequest request = MyInfoRequest.newBuilder().setUserId(preferencesHelper.getUserId()).build();
                MyInfoResponse response = stub.getUserInfo(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyInfoResponse>() {
            @Override
            public void onSuccess(MyInfoResponse myInfoResponse) {
                Map<String, String> rolemap = preferencesHelper.getUserRolesMap().getHashMap();
                Map<String, String> educationMap = preferencesHelper.getEducationMap().getHashMap();
                List<SubjectMessage> subjectList = preferencesHelper.getSubjectMap().getSubjectList().getSubSubjectList();
                HashMap<String, String> subjectMap = new HashMap<String, String>();
                CiclePushMap(subjectMap, subjectList);


                String avatarUrl = myInfoResponse.getAvatarUrl().getAvatarUrl();
                String award = myInfoResponse.getAward().getAward();
                String birthday = myInfoResponse.getBirthday().getBirthday();
                String nickName = myInfoResponse.getNickName().getNickName();
                String realName = myInfoResponse.getRealName().getRealName();
                String idNumber = myInfoResponse.getIdNumber().getIdNumber();
                String sex = myInfoResponse.getSex().getSex();
                String userRoles = myInfoResponse.getUserRoles().getUserRoles();
                String workUnit = myInfoResponse.getWorkUnit().getWorkUnit();
                String educationLevel = myInfoResponse.getEducationLevel().getEducationLevel();
                String graduatedSchool = myInfoResponse.getGraduatedSchool().getGraduatedSchool();
                String subject = myInfoResponse.getSubject().getSubject();
                String interestSubject = myInfoResponse.getInterestSubject().getInterestSubject();
                String infoEmail = myInfoResponse.getEmail().getEmail();
                if (!TextUtils.isEmpty(avatarUrl)) {
                    Glide.with(EditPersonInforActivity.this).load(avatarUrl)
                            .transform(new GlideCircleTransform(EditPersonInforActivity.this)).into(ivUserIcon);
                }
                if (!TextUtils.isEmpty(realName)) {
                    etName.setText(realName);
                    tvUserName.setText(realName);
                }
                if (!TextUtils.isEmpty(nickName)) {
                    etNickname.setText(nickName);
                    tvUserName.setText(nickName);
                }

                if (!TextUtils.isEmpty(idNumber)) {
                    etIdCountry.setText(idNumber);
                }
                if (!TextUtils.isEmpty(sex)) {
                    etGender.setText(sex);
                }
                if (!TextUtils.isEmpty(birthday)) {
                    etBirthday.setText(birthday);
                }
                if (!TextUtils.isEmpty(userRoles) && !TextUtils.isEmpty(rolemap.get(userRoles))) {

                    etJobTitle.setText(rolemap.get(userRoles));
                }
                if (!TextUtils.isEmpty(workUnit)) {
                    etUnit.setText(workUnit);
                }
                if (!TextUtils.isEmpty(educationLevel) && !TextUtils.isEmpty(educationMap.get(educationLevel))) {
                    etEducation.setText(educationMap.get(educationLevel));
                }
                if (!TextUtils.isEmpty(graduatedSchool)) {
                    etGraduateSchool.setText(graduatedSchool);
                }
                if (!TextUtils.isEmpty(award)) {
                    etReward.setText(award);
                }
                if (!TextUtils.isEmpty(subject) && !TextUtils.isEmpty(subjectMap.get(subject))) {
                    etSubject.setText(subjectMap.get(subject));
                }
                if (!TextUtils.isEmpty(interestSubject)) {
                    etInterest.setText(interestSubject);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }
        });
    }

    private void CiclePushMap(HashMap<String, String> subjectMap, List<SubjectMessage> subjectList) {
        for (int i = 0; i < subjectList.size(); i++) {
            if (subjectList.get(i).getHasSubSubject()) {
                CiclePushMap(subjectMap, subjectList.get(i).getSubSubjectList());
            }
            subjectMap.put(subjectList.get(i).getSubjectField().getKey(), subjectList.get(i).getSubjectField().getValue());
        }
    }

    private void loadMapTable() {
        Single.create(new SingleOnSubscribe<UserRolesListResponse>() {
            @Override
            public void subscribe(SingleEmitter<UserRolesListResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                UserRolesListRequest request = UserRolesListRequest.newBuilder().build();
                UserRolesListResponse response = stub.getRolesList(request);
                e.onSuccess(response);

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<UserRolesListResponse>() {
            @Override
            public void onSuccess(UserRolesListResponse userRolesListResponse) {
                preferencesHelper.storeUserRolesMap(userRolesListResponse);
                handler.sendMessage(new Message());
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("网络出错");
            }
        });

        Single.create(new SingleOnSubscribe<SubjectListResponse>() {
            @Override
            public void subscribe(SingleEmitter<SubjectListResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                SubjectListRequest request = SubjectListRequest.newBuilder().build();
                SubjectListResponse response = stub.getSubjectList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<SubjectListResponse>() {
                    @Override
                    public void onSuccess(SubjectListResponse subjectListResponse) {
                        preferencesHelper.storeSubjectMap(subjectListResponse);
                        handler.sendMessage(new Message());
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });

        Single.create(new SingleOnSubscribe<EducationLevelListResponse>() {
            @Override
            public void subscribe(SingleEmitter<EducationLevelListResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                EducationLevelListRequest request = EducationLevelListRequest.newBuilder().build();
                EducationLevelListResponse response = stub.getEducationLevelList(request);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<EducationLevelListResponse>() {
            @Override
            public void onSuccess(EducationLevelListResponse educationLevelListResponse) {
                preferencesHelper.storeEducationMap(educationLevelListResponse);
                handler.sendMessage(new Message());
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("网络出错");
            }
        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Crop.REQUEST_CROP && resultCode == RESULT_OK) {
            Glide.with(this).load(destination).transform(new GlideCircleTransform(this)).into(ivUserIcon);
        }
        if (resultCode == RESULT_OK && requestCode == PhotoPicker.REQUEST_CODE) {
            if (data != null) {
                ArrayList<String> photos =
                        data.getStringArrayListExtra(PhotoPicker.KEY_SELECTED_PHOTOS);
                Log.d(TAG, "onActivityResult: " + photos.get(0));
                String imgUrl = photos.get(0);
                String imgName = imgUrl.substring(imgUrl.lastIndexOf("/") + 1);
                File file = new File(getCacheDir(), imgName);
                destination = Uri.fromFile(file);
                Uri source = Uri.parse("file://" + photos.get(0));
                Crop.of(source, destination).asSquare().start(this);
            }
        }
        if (resultCode == RESULT_OK && requestCode == EditNackNameActivity.TYPE_NICKNAME) {
            if (data != null) {
                String nickname = data.getStringExtra("nickname");
                etNickname.setText(nickname);
            } else {
                etNickname.setHint("未填写");
                etNickname.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == TYPE_NAME) {
            if (data != null) {
                String name = data.getStringExtra("nickname");
                etName.setText(name);
            } else {
                etName.setHint("未填写");
                etName.setText("");
            }
        }
        if (resultCode == RESULT_OK && requestCode == TYPE_ID_CARD) {
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
        if (resultCode == RESULT_OK && requestCode == EditNackNameActivity.TYPE_UNIT) {
            if (data != null) {
                String unit = data.getStringExtra("nickname");
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
        if (resultCode == RESULT_OK && requestCode == EditNackNameActivity.TYPE_SCHOOL) {
            if (data != null) {
                String unit = data.getStringExtra("nickname");
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
//                PhotoPicker.builder()
//                        .setPhotoCount(1)
//                        .setPreviewEnabled(false).start(this, PhotoPicker.REQUEST_CODE);
                Log.d(TAG, "onDraw: " + Thread.currentThread().getId());
                break;
            case R.id.rl_nickname:
                Intent intent = new Intent(this, EditNackNameActivity.class);
                intent.putExtra("type", EditNackNameActivity.TYPE_NICKNAME);
                intent.putExtra("content", etNickname.getText().toString().trim());
                startActivityForResult(intent, EditNackNameActivity.TYPE_NICKNAME);
                break;
            case R.id.rl_name:
                Intent intent2 = new Intent(this, EditNackNameActivity.class);
                intent2.putExtra("type", TYPE_NAME);
                intent2.putExtra("content", etName.getText().toString().trim());
                startActivityForResult(intent2, TYPE_NAME);
                break;
            case R.id.rl_id_country:
                Intent intent3 = new Intent(this, EditNackNameActivity.class);
                intent3.putExtra("type", TYPE_ID_CARD);
                intent3.putExtra("content", etIdCountry.getText().toString().trim());
                startActivityForResult(intent3, TYPE_ID_CARD);
                break;
            case R.id.rl_gender:
                new MaterialDialog.Builder(this)
                        .title("请选择性别")
                        .items(s)
                        .itemsCallbackSingleChoice(
                                etGender.getText().toString().equals("男") ? 0 : 1, new MaterialDialog.ListCallbackSingleChoice() {
                                    @Override
                                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                                        submitMale(text.toString());
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
                picker.setRangeEnd(2018, 1, 1);
                picker.setRangeStart(1940, 1, 1);
                picker.setSelectedItem(1992, 1, 1);
                picker.setResetWhileWheel(false);
                picker.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
                    @Override
                    public void onDatePicked(String year, String month, String day) {
                        submitBirthDay(year + "-" + month + "-" + day);
                        tvBirthday.setText(year + "-" + month + "-" + day);
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
                picker.setCancelTextColor(getResources().getColor(R.color.colorPrimaryDark));
                picker.setSubmitTextColor(getResources().getColor(R.color.colorPrimaryDark));
                picker.setPressedTextColor(getResources().getColor(R.color.colorPrimary));
                picker.setDividerColor(getResources().getColor(R.color.colorPrimaryDark));
                picker.setTopLineColor(getResources().getColor(R.color.colorPrimaryDark));
                picker.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                picker.setTitleTextColor(getResources().getColor(R.color.black_text));
                picker.setTitleTextSize(16);
                picker.setCancelTextSize(16);
                picker.setSubmitTextSize(16);
                picker.setSubmitTextSize(16);
                picker.show();
                break;
            case R.id.rl_job_title:
                Intent intent4 = new Intent(this, PersonEditListActivity.class);
                intent4.putExtra("type", PersonEditListActivity.TYPE_JOB_TITLE);
                startActivityForResult(intent4, PersonEditListActivity.TYPE_JOB_TITLE);
                break;
            case R.id.rl_unit:
                Intent intent5 = new Intent(this, EditNackNameActivity.class);
                intent5.putExtra("type", TYPE_UNIT);
                intent5.putExtra("content", etUnit.getText().toString().trim());
                startActivityForResult(intent5, TYPE_UNIT);


                break;
            case R.id.rl_education:
                Intent intent6 = new Intent(this, PersonEditListActivity.class);
                intent6.putExtra("type", PersonEditListActivity.TYPE_EDUCATION);
                startActivityForResult(intent6, PersonEditListActivity.TYPE_EDUCATION);
                break;
            case R.id.rl_graduate_school:

                Intent intent7 = new Intent(this, EditNackNameActivity.class);
                intent7.putExtra("type", TYPE_SCHOOL);
                intent7.putExtra("content", etGraduateSchool.getText().toString().trim());
                startActivityForResult(intent7, TYPE_SCHOOL);

                break;
            case R.id.rl_reward:
                Intent intent9 = new Intent(this, EditRewardActivity.class);
                intent9.putExtra("experience", etReward.getText().toString().trim());
                intent9.putExtra("type", EditRewardActivity.TYPE_REWARD);
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
                intent10.putExtra("type", EditRewardActivity.TYPE_INTREST);
                startActivityForResult(intent10, 9);
                break;
        }
    }

    private void submitBirthDay(final String s) {
        Single.create(new SingleOnSubscribe<MyInfoUpdateResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyInfoUpdateResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                Any any = null;
                InfoBirthday infoBirthday = InfoBirthday.newBuilder().setBirthday(s).build();
                any = Any.pack(infoBirthday);
                MyInfoUpdateRequest myInfoUpdateRequest = MyInfoUpdateRequest.newBuilder().setUserId(preferencesHelper.getUserId()).addField(any).build();
                MyInfoUpdateResponse response = stub.updateUserInfo(myInfoUpdateRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyInfoUpdateResponse>() {
            @Override
            public void onSuccess(MyInfoUpdateResponse myInfoUpdateResponse) {
                etBirthday.setText(s);
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("访问服务器错误");
            }
        });
    }

    private void submitMale(final String text) {
        Single.create(new SingleOnSubscribe<MyInfoUpdateResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyInfoUpdateResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                Any any = null;

                InfoSex infoSex = InfoSex.newBuilder().setSex(text).build();
                any = Any.pack(infoSex);
                MyInfoUpdateRequest myInfoUpdateRequest = MyInfoUpdateRequest.newBuilder().setUserId(preferencesHelper.getUserId()).addField(any).build();
                MyInfoUpdateResponse response = stub.updateUserInfo(myInfoUpdateRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyInfoUpdateResponse>() {
            @Override
            public void onSuccess(MyInfoUpdateResponse myInfoUpdateResponse) {
                etGender.setText(text);
            }

            @Override
            public void onError(Throwable e) {
                ToastUtil.show("访问服务器错误");
            }
        });

    }


}
