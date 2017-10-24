package com.tb.wangfang.news.ui.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseFragment;
import com.tb.wangfang.news.base.contract.FourthContract;
import com.tb.wangfang.news.model.prefs.ImplPreferencesHelper;
import com.tb.wangfang.news.presenter.FourthPresenter;
import com.tb.wangfang.news.ui.activity.EditPersonInforActivity;
import com.tb.wangfang.news.ui.activity.HelpActivity;
import com.tb.wangfang.news.ui.activity.LoginActivity;
import com.tb.wangfang.news.ui.activity.MessageActivity;
import com.tb.wangfang.news.ui.activity.MyOrderActivity;
import com.tb.wangfang.news.ui.activity.MySubscribeActivity;
import com.tb.wangfang.news.ui.activity.MyWalletActivity;
import com.tb.wangfang.news.ui.activity.MycollectActivity;
import com.tb.wangfang.news.ui.activity.SettingActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by tangbin on 2017/5/9.
 */

public class FourthFragment extends BaseFragment<FourthPresenter> implements FourthContract.View {


    @BindView(R.id.iv_user_icon)
    ImageView ivUserIcon;
    @BindView(R.id.tv_user_name)
    TextView tvUserName;
    @BindView(R.id.tv_edit_personnal)
    TextView tvEditPersonnal;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @Inject
    ImplPreferencesHelper PreferencesHelper;

    public static FourthFragment newInstance() {
        FourthFragment fragment = new FourthFragment();

        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_fourth;
    }

    @Override
    protected void initEventAndData() {


    }

    @Override
    public void showUpdateDialog(String versionContent) {

    }

    @Override
    public void startDownloadService() {

    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }


    @OnClick({R.id.tv_edit_personnal, R.id.tv_register, R.id.rl_mycollect, R.id.rl_myorder, R.id.rl_help, R.id.rl_setting, R.id.rl_my_subscibe, R.id.rl_message_center, R.id.rl_my_wallet})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_my_wallet:
                Intent intent8 = new Intent(getActivity(), MyWalletActivity.class);
                startActivity(intent8);
                break;

            case R.id.tv_edit_personnal:
                Intent intent2 = new Intent(getActivity(), EditPersonInforActivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_register:
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_mycollect:
                Intent intent5 = new Intent(getActivity(), MycollectActivity.class);
                startActivity(intent5);
                break;
            case R.id.rl_myorder:
                Intent intent3 = new Intent(getActivity(), MyOrderActivity.class);
                startActivity(intent3);
                break;
            case R.id.rl_help:
                Intent intent4 = new Intent(getActivity(), HelpActivity.class);

                startActivity(intent4);
                break;
            case R.id.rl_setting:
                Intent intent1 = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent1);
                break;
            case R.id.rl_my_subscibe:
                Intent intent6 = new Intent(getActivity(), MySubscribeActivity.class);
                startActivity(intent6);
                break;
            case R.id.rl_message_center:
                Intent intent7 = new Intent(getActivity(), MessageActivity.class);
                startActivity(intent7);
                break;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (PreferencesHelper.getLoginState()) {
            tvRegister.setVisibility(View.GONE);
            tvEditPersonnal.setVisibility(View.VISIBLE);
        } else {
            tvRegister.setVisibility(View.VISIBLE);
            tvEditPersonnal.setVisibility(View.GONE);
        }
    }
}