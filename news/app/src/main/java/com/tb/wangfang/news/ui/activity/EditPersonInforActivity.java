package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.widget.GlideCircleTransform;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;
import me.iwf.photopicker.PhotoPicker;

public class EditPersonInforActivity extends SimpleActivity {


    @BindView(R.id.iv_user_icon)
    ImageView ivUserIcon;
    @BindView(R.id.tv_user_name)
    TextView tvUserName;
    private String TAG="EditPersonInforActivity";

    @Override
    protected int getLayout() {
        return R.layout.activity_edit_person_infor;
    }

    @Override
    protected void initEventAndData() {
        Log.d(TAG, "onDraw: "+Thread.currentThread().getId());
    }

    @OnClick({R.id.tv_return, R.id.iv_user_icon, R.id.tv_nick_name, R.id.tv_name, R.id.tv_last_name, R.id.tv_id_country, R.id.tv_sex, R.id.tv_birthday, R.id.tv_job_title, R.id.tv_unit, R.id.tv_education, R.id.tv_graduate_school, R.id.tv_reward, R.id.tv_subject, R.id.tv_interest})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.iv_user_icon:
                PhotoPicker.builder()
                        .setPhotoCount(1)
                        .setPreviewEnabled(false).start(this, PhotoPicker.REQUEST_CODE);
                break;
            case R.id.tv_nick_name:
                break;
            case R.id.tv_name:
                break;
            case R.id.tv_last_name:
                break;
            case R.id.tv_id_country:
                break;
            case R.id.tv_sex:
                break;
            case R.id.tv_birthday:
                break;
            case R.id.tv_job_title:
                break;
            case R.id.tv_unit:
                break;
            case R.id.tv_education:
                break;
            case R.id.tv_graduate_school:
                break;
            case R.id.tv_reward:
                break;
            case R.id.tv_subject:
                break;
            case R.id.tv_interest:
                break;
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
    }
}
