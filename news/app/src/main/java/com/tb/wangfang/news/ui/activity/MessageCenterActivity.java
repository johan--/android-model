package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.App;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.SimpleActivity;
import com.tb.wangfang.news.di.component.DaggerActivityComponent;
import com.tb.wangfang.news.di.module.ActivityModule;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.android.api.event.ConversationRefreshEvent;
import cn.jpush.im.android.api.event.MessageEvent;
import cn.jpush.im.android.api.event.OfflineMessageEvent;
import cn.jpush.im.android.api.model.Conversation;
import io.grpc.ManagedChannel;

public class MessageCenterActivity extends SimpleActivity {
    @Inject
    ManagedChannel managedChannel;
    @Inject
    ImplPreferencesHelper preferencesHelper;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    @BindView(R.id.tv_dynamic)
    TextView tvDynamic;
    @BindView(R.id.rl_dynamic)
    RelativeLayout rlDynamic;
    @BindView(R.id.tv_order_message)
    TextView tvOrderMessage;
    @BindView(R.id.tv_focus)
    TextView tvFocus;
    @BindView(R.id.tv_system)
    TextView tvSystem;
    @BindView(R.id.tv_fruit_unread)
    TextView tvFruitUnread;
    @BindView(R.id.tv_order_unread)
    TextView tvOrderUnread;
    @BindView(R.id.tv_focus_unread)
    TextView tvFocusUnread;
    @BindView(R.id.tv_system_unread)
    TextView tvSystemUnread;
    private Conversation fruitCov;
    private Conversation orderCov;
    private Conversation focusCov;
    private Conversation systemCov;
    private int fruitUnRead = 0;
    private int orderUnRead = 0;
    private int focusUnRead = 0;
    private int systemUnRead = 0;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            tvFruitUnread.setText(fruitUnRead + "");
            tvOrderUnread.setText(orderUnRead + "");
            tvFocusUnread.setText(focusUnRead + "");
            tvSystemUnread.setText(systemUnRead + "");
        }
    };

    @Override
    protected int getLayout() {
        JMessageClient.registerEventReceiver(this);
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        return R.layout.activity_message_center;
    }

    @Override
    protected void initEventAndData() {
        fruitCov = JMessageClient.getSingleConversation(Constants.JMESSAGE_FRUIT_ACCOUNT, "");
        orderCov = JMessageClient.getSingleConversation(Constants.JMESSAGE_ORDER_ACCOUNT, "");
        focusCov = JMessageClient.getSingleConversation(Constants.JMESSAGE_FOCUS_ACCOUNT, "");
        systemCov = JMessageClient.getSingleConversation(Constants.JMESSAGE_SYSTEM_ACCOUNT, "");
        if (fruitCov != null) {
            fruitUnRead = fruitCov.getUnReadMsgCnt();
        }
        if (focusCov != null) {
            focusUnRead = focusCov.getUnReadMsgCnt();
        }
        if (orderCov != null) {
            orderUnRead = orderCov.getUnReadMsgCnt();
        }
        if (systemCov != null) {
            systemUnRead = systemCov.getUnReadMsgCnt();
        }
        tvFruitUnread.setText(fruitUnRead + "");
        tvOrderUnread.setText(orderUnRead + "");
        tvFocusUnread.setText(focusUnRead + "");
        tvSystemUnread.setText(systemUnRead + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (fruitCov != null) {
            fruitUnRead = fruitCov.getUnReadMsgCnt();
        }
        if (focusCov != null) {
            focusUnRead = focusCov.getUnReadMsgCnt();
        }
        if (orderCov != null) {
            orderUnRead = orderCov.getUnReadMsgCnt();
        }
        if (systemCov != null) {
            systemUnRead = systemCov.getUnReadMsgCnt();
        }
        handler.sendMessage(new Message());

    }

    @OnClick({R.id.iv_go_back, R.id.iv_menu, R.id.rl_dynamic, R.id.rl_order, R.id.rl_focus, R.id.rl_system})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_go_back:
                finish();
                break;
            case R.id.iv_menu:
                new MaterialDialog.Builder(this)
                        .content("将所有消息标记为已读？")
                        .positiveText("确定").onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        if (fruitCov != null) {
                            fruitCov.resetUnreadCount();
                        }
                        if (focusCov != null) {
                            focusCov.resetUnreadCount();
                        }
                        if (orderCov != null) {
                            orderCov.resetUnreadCount();
                        }
                        if (systemCov != null) {
                            systemCov.resetUnreadCount();
                        }
                        tvFruitUnread.setText(0 + "");
                        tvOrderUnread.setText(0 + "");
                        tvFocusUnread.setText(0 + "");
                        tvSystemUnread.setText(0 + "");
                        handler.sendMessage(new Message());
                    }
                }).negativeText("取消").negativeColor(getResources().getColor(R.color.gray_ccc))
                        .show();
                break;
            case R.id.rl_dynamic:
                Intent intent = new Intent(this, MessageActivity.class);
                intent.putExtra("type", MessageActivity.TYPE_DYNAMIC);
                startActivity(intent);
                break;
            case R.id.rl_order:
                Intent intent2 = new Intent(this, MessageActivity.class);
                intent2.putExtra("type", MessageActivity.TYPE_ORDER);
                startActivity(intent2);
                break;
            case R.id.rl_focus:
                Intent intent3 = new Intent(this, MessageActivity.class);
                intent3.putExtra("type", MessageActivity.TYPE_FOCUS);
                startActivity(intent3);
                break;
            case R.id.rl_system:
                Intent intent4 = new Intent(this, MessageActivity.class);
                intent4.putExtra("type", MessageActivity.TYPE_SYSTEM);
                startActivity(intent4);
                break;
        }
    }

    /**
     * 收到消息
     */
    public void onEvent(MessageEvent event) {
        if (fruitCov != null) {
            fruitUnRead = fruitCov.getUnReadMsgCnt();
        }
        if (focusCov != null) {
            focusUnRead = focusCov.getUnReadMsgCnt();
        }
        if (orderCov != null) {
            orderUnRead = orderCov.getUnReadMsgCnt();
        }
        if (systemCov != null) {
            systemUnRead = systemCov.getUnReadMsgCnt();
        }
        handler.sendMessage(new Message());

    }

    /**
     * 接收离线消息
     *
     * @param event 离线消息事件
     */
    public void onEvent(OfflineMessageEvent event) {
        if (fruitCov != null) {
            fruitUnRead = fruitCov.getUnReadMsgCnt();
        }
        if (focusCov != null) {
            focusUnRead = focusCov.getUnReadMsgCnt();
        }
        if (orderCov != null) {
            orderUnRead = orderCov.getUnReadMsgCnt();
        }
        if (systemCov != null) {
            systemUnRead = systemCov.getUnReadMsgCnt();
        }
        handler.sendMessage(new Message());
    }

    /**
     * 消息漫游完成事件
     *
     * @param event 漫游完成后， 刷新会话事件
     */
    public void onEvent(ConversationRefreshEvent event) {
        if (fruitCov != null) {
            fruitUnRead = fruitCov.getUnReadMsgCnt();
        }
        if (focusCov != null) {
            focusUnRead = focusCov.getUnReadMsgCnt();
        }
        if (orderCov != null) {
            orderUnRead = orderCov.getUnReadMsgCnt();
        }
        if (systemCov != null) {
            systemUnRead = systemCov.getUnReadMsgCnt();
        }
        handler.sendMessage(new Message());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        JMessageClient.unRegisterEventReceiver(this);
    }


}
