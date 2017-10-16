package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.ui.adapter.MessageAdapter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.android.api.event.MessageEvent;
import cn.jpush.im.android.api.model.Conversation;
import cn.jpush.im.android.api.model.Message;
import io.grpc.ManagedChannel;

public class MessageActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @BindView(R.id.rv_message)
    RecyclerView rvMessage;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    private String TAG = "MessageActivity";

    @Override
    protected int getLayout() {
        JMessageClient.registerEventReceiver(this);
        return R.layout.activity_message;
    }

    @Override
    protected void initEventAndData() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        Conversation cov = JMessageClient.getSingleConversation("bintang", "");
        List<Message> messages = cov.getAllMessage();
        MessageAdapter adapter = new MessageAdapter(this, messages);
        rvMessage.setLayoutManager(new LinearLayoutManager(this));
        rvMessage.setAdapter(adapter);
    }

    public void onEvent(MessageEvent event) {
        Log.d(TAG, "onEvent: " + event.getMessage().getContent().getStringExtras().get("1"));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        JMessageClient.unRegisterEventReceiver(this);
    }


    @OnClick(R.id.iv_go_back)
    public void onViewClicked() {
        this.finish();
    }
}
