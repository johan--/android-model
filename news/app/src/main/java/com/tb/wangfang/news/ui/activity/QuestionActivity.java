package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.model.bean.ItemQuestion;
import com.tb.wangfang.news.ui.adapter.QueestionIvAdapter;
import com.tb.wangfang.news.utils.ToastUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;
import me.iwf.photopicker.PhotoPicker;

public class QuestionActivity extends SimpleActivity {


    @BindView(R.id.edit_question)
    EditText editQuestion;
    @BindView(R.id.rv_iv)
    RecyclerView rvIv;
    @BindView(R.id.edit_contact)
    EditText editContact;
    ArrayList<ItemQuestion> questionsList = new ArrayList<>();
    int gapSize = 3;
    private QueestionIvAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_question;
    }

    @Override
    protected void initEventAndData() {
        questionsList.add(new ItemQuestion(QueestionIvAdapter.TYPE_INSERT_1, null));
        adapter = new QueestionIvAdapter(this, questionsList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rvIv.setAdapter(adapter);
        rvIv.setLayoutManager(gridLayoutManager);
        adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (view.getId() == R.id.rl_insert) {
                    if (gapSize > 0) {
                        PhotoPicker.builder()
                                .setPhotoCount(gapSize)
                                .setPreviewEnabled(false).start(QuestionActivity.this, PhotoPicker.REQUEST_CODE);
                    } else {
                        ToastUtil.show("只能提交3张图片");
                    }
                } else if (view.getId() == R.id.iv_delete) {
                    if (questionsList.size() == 3 && questionsList.get(2).getItemType() == QueestionIvAdapter.TYPE_IMAGE_0) {
                        questionsList.add(new ItemQuestion(QueestionIvAdapter.TYPE_INSERT_1, null));
                    }
                    questionsList.remove(position);
                    gapSize = 4 - questionsList.size();
                    adapter.notifyDataSetChanged();
                }
            }
        });
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ArrayList<String> paths = new ArrayList<String>();
                for (int i = 0; i < questionsList.size(); i++) {
                    if (!TextUtils.isEmpty(questionsList.get(i).getImgUrl())) {
                        paths.add(questionsList.get(i).getImgUrl());
                    }

                }

                Intent intent = new Intent(QuestionActivity.this, ImageBrowseActivity.class);
                intent.putStringArrayListExtra("paths", paths);
                intent.putExtra("position", position);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(QuestionActivity.this, view, "image");
                startActivity(intent, options.toBundle());
            }
        });

    }


    @OnClick({R.id.tv_return, R.id.btn_submit, R.id.btn_call_phone})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:
                finish();
                break;
            case R.id.btn_submit:
                break;
            case R.id.btn_call_phone:
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == PhotoPicker.REQUEST_CODE) {
            if (data != null) {
                ArrayList<String> photos = data.getStringArrayListExtra(PhotoPicker.KEY_SELECTED_PHOTOS);
                ArrayList<ItemQuestion> photosQuestion = new ArrayList<>();
                for (int i = 0; i < photos.size(); i++) {
                    ItemQuestion question = new ItemQuestion(QueestionIvAdapter.TYPE_IMAGE_0, photos.get(i));
                    if (!questionsList.contains(question)) {
                        questionsList.add(questionsList.size() - 1, question);
                    }

                }
                if (questionsList.size() > 3) {
                    questionsList.remove(3);
                }
                adapter.notifyDataSetChanged();
                gapSize = 4 - questionsList.size();


            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBackPressedSupport() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            pop();
        } else {
            finishAfterTransition();
        }
    }
}
