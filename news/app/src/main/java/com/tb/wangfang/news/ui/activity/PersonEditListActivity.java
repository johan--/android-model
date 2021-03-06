package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.protobuf.Any;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.bean.MapMessage;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.ui.adapter.SelectPersonInfoAdapter;
import com.tb.wangfang.news.utils.ToastUtil;
import com.tb.wangfang.news.widget.SearchEditText;
import com.wanfang.personal.EducationLevelListRequest;
import com.wanfang.personal.EducationLevelListResponse;
import com.wanfang.personal.InfoEducationLevel;
import com.wanfang.personal.InfoSubject;
import com.wanfang.personal.InfoUserRoles;
import com.wanfang.personal.MyInfoUpdateRequest;
import com.wanfang.personal.MyInfoUpdateResponse;
import com.wanfang.personal.PersonalCenterServiceGrpc;
import com.wanfang.personal.SubjectListRequest;
import com.wanfang.personal.SubjectListResponse;
import com.wanfang.personal.SubjectMessage;
import com.wanfang.personal.UserRolesListRequest;
import com.wanfang.personal.UserRolesListResponse;

import java.util.ArrayList;
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

import static com.tb.wangfang.news.R.id.et_search;

public class PersonEditListActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.tv_page_title)
    TextView tvPageTitle;
    @BindView(et_search)
    SearchEditText etSearch;
    @BindView(R.id.rv)
    RecyclerView rv;
    public final static int TYPE_JOB_TITLE = 0;
    public final static int TYPE_UNIT = 1;
    public final static int TYPE_EDUCATION = 2;
    public final static int TYPE_GRADUATE_SCHOOL = 3;
    public final static int TYPE_GRADUATE_SCHOOL_DEPARTMENT = 30;
    public final static int TYPE_UNIT_DEPARTMENT = 10;
    public final static int TYPE_SUBJECT = 5;
    public final static int TYPE_SUBJECT_ONE = 6;
    public final static int TYPE_SUBJECT_TWO = 7;
    int type = 0;
    private SelectPersonInfoAdapter adapter;
    private MaterialDialog mdialog;
    private String TAG = "PersonEdit";
    private List<SubjectMessage> subjectMessages;
    private SubjectMessage subjectMessage;


    @Override
    protected int getLayout() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_person_edit_list;
    }

    @Override
    protected void initEventAndData() {
        etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    if (!TextUtils.isEmpty(etSearch.getText().toString()) && !TextUtils.isEmpty(etSearch.getText().toString().trim())) {

                    } else {
                        ToastUtil.shortShow("请输入搜索关键字");
                    }
                }
                return false;
            }
        });
        type = getIntent().getIntExtra("type", 0);
        subjectMessage = (SubjectMessage) getIntent().getSerializableExtra("data");
        ArrayList<MapMessage> arrayList = new ArrayList<>();
        if (null != subjectMessage) {
            for (int i = 0; i < subjectMessage.getSubSubjectList().size(); i++) {
                MapMessage message = new MapMessage();
                message.setHasNext(subjectMessage.getSubSubjectList().get(i).getHasSubSubject());
                message.setValue(subjectMessage.getSubSubjectList().get(i).getSubjectField().getValue());
                message.setKey(subjectMessage.getSubSubjectList().get(i).getSubjectField().getKey());
                arrayList.add(message);
            }
        }

        adapter = new SelectPersonInfoAdapter(arrayList, type);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                MapMessage mapMessage = (MapMessage) adapter.getData().get(position);
                if (mapMessage.isHasNext()) {
                    if (type == TYPE_SUBJECT) {
                        Intent intent = new Intent(PersonEditListActivity.this, PersonEditListActivity.class);
                        if (subjectMessage != null) {
                            intent.putExtra("data", subjectMessage.getSubSubjectList().get(position));
                        } else {
                            intent.putExtra("data", subjectMessages.get(position));
                        }
                        intent.putExtra("type", type);
                        startActivityForResult(intent, type);
                    }

                } else {

                    submitSelectedPosition(type, mapMessage);

                }


//                Intent intent = new Intent();
//                if (type == TYPE_JOB_TITLE || type == TYPE_UNIT_DEPARTMENT || type == TYPE_EDUCATION || type == TYPE_GRADUATE_SCHOOL_DEPARTMENT ||
//                        type == TYPE_SUBJECT_TWO) {
//                    String index = ((MapMessage) adapter.getData().get(position)).getKey();
////                    submitSelectedPosition(type, index);
//                    return;
//                }
//                intent.setClass(PersonEditListActivity.this, PersonEditListActivity.class);
//                if (type == TYPE_UNIT) {
//                    intent.putExtra("item", (String) adapter.getData().get(position));
//                    intent.putExtra("type", TYPE_UNIT_DEPARTMENT);
//                    startActivityForResult(intent, TYPE_UNIT);
//                }
//                if (type == TYPE_GRADUATE_SCHOOL) {
//                    intent.putExtra("item", (String) adapter.getData().get(position));
//                    intent.putExtra("type", TYPE_GRADUATE_SCHOOL_DEPARTMENT);
//                    startActivityForResult(intent, TYPE_GRADUATE_SCHOOL);
//                }
//                if (type == TYPE_SUBJECT) {
//                    SubjectMessage subjectMessage = (SubjectMessage) adapter.getData().get(position);
//                    if (subjectMessage.getHasSubSubject()) {
//                        intent.putExtra("item", (MapMessage) adapter.getData().get(position));
//                        intent.putExtra("type", TYPE_SUBJECT);
//                        startActivityForResult(intent, TYPE_SUBJECT);
//                    }
//                }
//                if (type == TYPE_SUBJECT_ONE) {
//                    intent.putExtra("item", (String) adapter.getData().get(position));
//                    intent.putExtra("type", TYPE_SUBJECT_TWO);
//                    startActivityForResult(intent, TYPE_SUBJECT_ONE);
//                }

            }
        });
        if (subjectMessage == null) {
            addData(arrayList, type);
        }
    }

    private void submitSelectedPosition(final int type, final MapMessage mapMessage) {
        mdialog = new MaterialDialog.Builder(this)
                .title("修改中")
                .content("请等待")
                .progress(true, 0)
                .progressIndeterminateStyle(true)
                .show();
        Single.create(new SingleOnSubscribe<MyInfoUpdateResponse>() {
            @Override
            public void subscribe(SingleEmitter<MyInfoUpdateResponse> e) throws Exception {
                PersonalCenterServiceGrpc.PersonalCenterServiceBlockingStub stub = PersonalCenterServiceGrpc.newBlockingStub(managedChannel);
                Any any = null;
                switch (type) {
                    case TYPE_SUBJECT:
                        InfoSubject infoSubject = InfoSubject.newBuilder().setSubject(mapMessage.getKey()).build();
                        any = Any.pack(infoSubject);
                        break;
                    case TYPE_JOB_TITLE:
                        InfoUserRoles infoUserRoles = InfoUserRoles.newBuilder().setUserRoles(mapMessage.getKey()).build();
                        any = Any.pack(infoUserRoles);
                        break;
                    case TYPE_EDUCATION:
                        InfoEducationLevel infoEducationLevel = InfoEducationLevel.newBuilder().setEducationLevel(mapMessage.getKey()).build();
                        any = Any.pack(infoEducationLevel);
                        break;
                }
                MyInfoUpdateRequest myInfoUpdateRequest = MyInfoUpdateRequest.newBuilder().setUserId(preferencesHelper.getUserId()).addField(any).build();
                MyInfoUpdateResponse response = stub.updateUserInfo(myInfoUpdateRequest);
                e.onSuccess(response);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<MyInfoUpdateResponse>() {
            @Override
            public void onSuccess(MyInfoUpdateResponse myInfoUpdateResponse) {
                mdialog.dismiss();
                Intent intent = new Intent();
                intent.putExtra("item", mapMessage.getValue());
                PersonEditListActivity.this.setResult(RESULT_OK, intent);
                finish();
            }

            @Override
            public void onError(Throwable e) {
                mdialog.dismiss();
                ToastUtil.show("访问错误");
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case TYPE_UNIT:
            case TYPE_SUBJECT:
            case TYPE_GRADUATE_SCHOOL:
            case TYPE_SUBJECT_ONE:
                if (resultCode == RESULT_OK) {
                    setResult(RESULT_OK, data);
                    finish();
                }

                break;

        }
    }

    private void addData(final ArrayList<MapMessage> arrayList, int type) {
        switch (type) {
            case TYPE_JOB_TITLE:
                tvPageTitle.setText("职称");
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
                        arrayList.clear();
                        Map<String, String> map = userRolesListResponse.getRolesMap();
                        for (String key : map.keySet()) {
                            MapMessage message = new MapMessage();
                            message.setKey(key);
                            message.setValue(map.get(key));
                            message.setHasNext(false);
                            arrayList.add(message);
                        }
                        adapter.setNewData(arrayList);
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });

                break;
            case TYPE_SUBJECT:
                tvPageTitle.setText("学科");
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
                                Log.d(TAG, "onSuccess: " + subjectListResponse.getSubjectList().toString());
                                arrayList.clear();
                                subjectMessages = subjectListResponse.getSubjectList().getSubSubjectList();
                                for (int i = 0; i < subjectMessages.size(); i++) {
                                    MapMessage message = new MapMessage();
                                    message.setValue(subjectMessages.get(i).getSubjectField().getValue());
                                    message.setKey(subjectMessages.get(i).getSubjectField().getKey());
                                    message.setHasNext(subjectMessages.get(i).getHasSubSubject());
                                    arrayList.add(message);
                                }
                                adapter.setNewData(arrayList);

                            }

                            @Override
                            public void onError(Throwable e) {
                                ToastUtil.show("网络出错");
                            }
                        });
                break;
            case TYPE_UNIT:
                tvPageTitle.setText("当前单位/院校");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT);
                break;
            case TYPE_UNIT_DEPARTMENT:
                tvPageTitle.setText("所在院系");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT_DEPARTMENT);
                break;
            case TYPE_GRADUATE_SCHOOL_DEPARTMENT:
                tvPageTitle.setText("所在院系");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_UNIT_DEPARTMENT);
                break;
            case TYPE_EDUCATION:
                tvPageTitle.setText("最高学历");
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
                        arrayList.clear();
                        Map<String, String> map = educationLevelListResponse.getEducationLevelsMap();
                        for (String key : map.keySet()) {
                            MapMessage message = new MapMessage();
                            message.setKey(key);
                            message.setValue(map.get(key));
                            message.setHasNext(false);
                            arrayList.add(message);
                        }
                        adapter = new SelectPersonInfoAdapter(arrayList, TYPE_EDUCATION);
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.show("网络出错");
                    }
                });
                break;
            case TYPE_GRADUATE_SCHOOL:
                tvPageTitle.setText("毕业院校");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_GRADUATE_SCHOOL);
                break;
            case TYPE_SUBJECT_ONE:
                tvPageTitle.setText("学科");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_SUBJECT_ONE);
                break;
            case TYPE_SUBJECT_TWO:
                tvPageTitle.setText("学科");
                adapter = new SelectPersonInfoAdapter(arrayList, TYPE_SUBJECT_TWO);
                break;
        }


    }


    @OnClick(R.id.tv_return)
    public void onViewClicked() {
        finish();
    }
}
