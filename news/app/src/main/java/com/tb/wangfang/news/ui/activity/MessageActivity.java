package com.tb.wangfang.news.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.ui.adapter.MessageAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.android.api.event.ConversationRefreshEvent;
import cn.jpush.im.android.api.event.MessageEvent;
import cn.jpush.im.android.api.event.OfflineMessageEvent;
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
    @BindView(R.id.tv_blank_content)
    TextView tvBlankContent;

    private String TAG = "MessageActivity";
    private Conversation cov;
    private MessageAdapter adapter;
    public static final String TYPE_DYNAMIC = "dynamic";
    public static final String TYPE_ORDER = "order";
    public static final String TYPE_FOCUS = "focus";
    public static final String TYPE_SYSTEM = "system";
    private String type;
    private List<Message> messages;

    @Override
    protected int getLayout() {
        JMessageClient.registerEventReceiver(this);
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_message;
    }

    @Override
    protected void initEventAndData() {
        type = getIntent().getStringExtra("type");
        if (type.equals(TYPE_DYNAMIC)) {
            cov = JMessageClient.getSingleConversation(Constants.JMESSAGE_FRUIT_ACCOUNT, "");
            tvBlankContent.setText("你还没有成果动态");
            tvTitle.setText("成果动态");
        } else if (type.equals(TYPE_ORDER)) {
            cov = JMessageClient.getSingleConversation(Constants.JMESSAGE_ORDER_ACCOUNT, "");
            tvBlankContent.setText("你还没有订阅消息");
            tvTitle.setText("订阅消息");
        } else if (type.equals(TYPE_FOCUS)) {
            cov = JMessageClient.getSingleConversation(Constants.JMESSAGE_FOCUS_ACCOUNT, "");
            tvBlankContent.setText("你还没有新增关注");
            tvTitle.setText("关注");
        } else if (type.equals(TYPE_SYSTEM)) {
            cov = JMessageClient.getSingleConversation(Constants.JMESSAGE_SYSTEM_ACCOUNT, "");
            tvBlankContent.setText("你还没有系统通知");
            tvTitle.setText("系统通知");
        }

        if (cov != null) {
            messages = cov.getAllMessage();
            cov.resetUnreadCount();
        } else {
            messages = new ArrayList<>();
        }
//        FocusMessageAdapter focusMessageAdapter=new FocusMessageAdapter()
        adapter = new MessageAdapter(this, messages);
        rvMessage.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvMessage.setAdapter(adapter);
        notifyView(adapter);
    }

    private void notifyView(MessageAdapter adapter) {
        if (adapter.getData().size() == 0) {
            rvMessage.setVisibility(View.GONE);
        } else {
            rvMessage.setVisibility(View.VISIBLE);
        }
    }

    public void onEvent(MessageEvent event) {
        if (cov != null) {
            messages = cov.getAllMessage();
            adapter.setNewData(messages);
            cov.resetUnreadCount();
            notifyView(adapter);
        } else {

        }
    }

    /**
     * 类似MessageEvent事件的接收，上层在需要的地方增加OfflineMessageEvent事件的接收
     * 即可实现离线消息的接收。
     **/
    public void onEvent(OfflineMessageEvent event) {
        //获取事件发生的会话对象
        Log.d(TAG, "onEvent: 同步离线");
        if (cov != null) {
            messages = cov.getAllMessage();
            adapter.setNewData(messages);
            cov.resetUnreadCount();
            notifyView(adapter);
        } else {

        }

//        System.out.println(String.format(Locale.SIMPLIFIED_CHINESE, "收到%d条来自%s的离线消息。\n", newMessageList.size(), conversation.getTargetId()));
    }


    /**
     * 如果在JMessageClient.init时启用了消息漫游功能，则每当一个会话的漫游消息同步完成时
     * sdk会发送此事件通知上层。
     **/
    public void onEvent(ConversationRefreshEvent event) {
        if (cov != null) {
            messages = cov.getAllMessage();
            adapter.setNewData(messages);
            cov.resetUnreadCount();
            notifyView(adapter);
            Log.d(TAG, "onEvent: 同步漫游" + messages.size());
        } else {

        }

//        //获取事件发生的原因，对于漫游完成触发的事件，此处的reason应该是
//        //MSG_ROAMING_COMPLETE
//        ConversationRefreshEvent.Reason reason = event.getReason();
//        System.out.println(String.format(Locale.SIMPLIFIED_CHINESE, "收到ConversationRefreshEvent事件,待刷新的会话是%s.\n", conversation.getTargetId()));
//        System.out.println("事件发生的原因 : " + reason);
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
