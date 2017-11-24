package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.bean.Level0;
import com.tb.wangfang.news.model.bean.Level1;
import com.tb.wangfang.news.model.bean.Level2;
import com.tb.wangfang.news.model.bean.Level3;
import com.tb.wangfang.news.model.bean.SearchFilterListBean;
import com.tb.wangfang.news.model.bean.SearchReplyBean;
import com.tb.wangfang.news.presenter.FilterDocPresenter;
import com.tb.wangfang.news.ui.adapter.FilterExpandAdapter;
import com.tb.wangfang.news.ui.adapter.SearchDocumentAdapter;
import com.tb.wangfang.news.utils.SnackbarUtil;
import com.tb.wangfang.news.widget.FlowLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FilterDocActivity extends BaseActivity<FilterDocPresenter> implements FilterDocContract.View, DrawerLayout.DrawerListener, BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener, MaterialSpinner.OnItemSelectedListener<String> {

    @BindView(R.id.iv_go_back)
    ImageView ivGoBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    @BindView(R.id.lv_right_menu)
    RecyclerView lvRightMenu;
    @BindView(R.id.dl_right)
    DrawerLayout dlRight;
    @BindView(R.id.rv_content)
    RecyclerView rvContent;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    @BindView(R.id.ms_selet_one)
    TextView msSeletOne;
    @BindView(R.id.ms_selet_two)
    TextView msSeletTwo;
    @BindView(R.id.ms_selet_three)
    TextView msSeletThree;
    @BindView(R.id.ms_selet_four)
    TextView msSeletFour;
    @BindView(R.id.fl_condition)
    FlowLayout flCondition;
    @BindView(R.id.tv_sign_one)
    TextView tvSignOne;
    @BindView(R.id.tv_reset)
    TextView tvReset;
    @BindView(R.id.tv_complete)
    TextView tvComplete;
    @BindView(R.id.ll_sign_two)
    LinearLayout llSignTwo;
    @BindView(R.id.rl_selet_one)
    RelativeLayout rlSeletOne;
    @BindView(R.id.rl_selet_two)
    RelativeLayout rlSeletTwo;
    @BindView(R.id.rl_selet_three)
    RelativeLayout rlSeletThree;
    @BindView(R.id.rl_selet_four)
    RelativeLayout rlSeletFour;
    @BindView(R.id.iv_selected_one)
    ImageView ivSelectedOne;
    @BindView(R.id.iv_selected_two)
    ImageView ivSelectedTwo;
    @BindView(R.id.iv_selected_three)
    ImageView ivSelectedThree;
    @BindView(R.id.iv_selected_four)
    ImageView ivSelectedFour;
    private SearchDocumentAdapter docAdapter;
    ArrayList<MultiItemEntity> multiItemEntityArrayList = new ArrayList<>();
    private int page = 1;
    private String text;
    private FilterExpandAdapter expandAdapter;
    private ArrayList<View> viewArrayList = new ArrayList<>();
    private String navigation;
    private String startDate;
    private String endDate;
    private String TAG = "FilterDocActivity";
    private String sortField = "";

    @Override
    protected int getLayout() {
        return R.layout.activity_filter_doc;
    }

    @Override
    protected void initEventAndData() {
        //初始化搜索控件
        text = getIntent().getExtras().getString("text");
//        msSeletOne.setItems("Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow");
//        msSeletOne.setOnItemSelectedListener(this);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        rvContent.setLayoutManager(new LinearLayoutManager(this));

        docAdapter = new SearchDocumentAdapter(null);
        docAdapter.setOnLoadMoreListener(this, rvContent);
        docAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        docAdapter.setPreLoadNumber(2);
        rvContent.setAdapter(docAdapter);
        docAdapter.setEmptyView(R.layout.normal_empty_layout);

        //初始化筛选控件
        expandAdapter = new FilterExpandAdapter(multiItemEntityArrayList);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return expandAdapter.getItemViewType(position) == FilterExpandAdapter.TYPE_LEVEL_1 ? 1 : 2;
            }
        });
        lvRightMenu.setAdapter(expandAdapter);
        lvRightMenu.setLayoutManager(gridLayoutManager);


        docAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(FilterDocActivity.this, DocDetailActivity.class);
                if (docAdapter.getData().get(position).getClass_type().equals("perio_artical") || docAdapter.getData().get(position).getClass_type().equals("degree_artical")) {
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getArticle_id().toString());
                } else if (docAdapter.getData().get(position).getClass_type().equals("patent_element")) {
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getPatent_id().toString());
                } else if (docAdapter.getData().get(position).getClass_type().equals("conf_artical")) {
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getArticle_id().toString());
                } else if (docAdapter.getData().get(position).getClass_type().equals("standards")) {
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getStand_id().toString());
                } else if (docAdapter.getData().get(position).getClass_type().equals("legislations")) {
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getLegis_id().toString());
                } else if (docAdapter.getData().get(position).getClass_type().equals("tech_result")) {
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getResult_id().toString());
                }
                intent.putExtra(Constants.ARTICLE_TYPE, docAdapter.getData().get(position).getClass_type().toString());
                startActivity(intent);
            }
        });
        docAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (!TextUtils.isEmpty(docAdapter.getData().get(position).getPerio_id().toString())) {
                    Intent intent = new Intent(FilterDocActivity.this, JournalActivity.class);
                    intent.putExtra(Constants.ARTICLE_ID, docAdapter.getData().get(position).getPerio_id().toString());
                    startActivity(intent);
                }

            }
        });
        mPresenter.search(text, page, "", "", "", "");
        mPresenter.searchNavigation(text, null, null, null);
    }


    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }


    @OnClick({R.id.iv_go_back, R.id.iv_menu, R.id.tv_reset, R.id.tv_complete, R.id.rl_selet_one, R.id.rl_selet_two, R.id.rl_selet_three, R.id.rl_selet_four})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_go_back:
                finish();
                break;
            case R.id.iv_menu:
                if (dlRight.isDrawerOpen(Gravity.RIGHT)) {
                    dlRight.closeDrawer(Gravity.RIGHT);
                } else {
                    dlRight.openDrawer(Gravity.RIGHT);
                }
                break;
            case R.id.tv_reset:
//                for (int i = 0; i < expandAdapter.getData().size(); i++) {
//                    if (expandAdapter.getData().get(i) instanceof Level0) {
//                        Level0 level0 = (Level0) expandAdapter.getData().get(i);
//                        level0.setSeletedPosition(-1);
//                        for (int j = 0; j < level0.getSubItems().size(); j++) {
//                            Level1 level1 = level0.getSubItem(j);
//                            level1.setSelected(false);
//                        }
//                    }
//                }
//                expandAdapter.notifyDataSetChanged();
                mPresenter.search(text, page, "", "", "", "");
                mPresenter.searchNavigation(text, null, null, null);
                flCondition.removeAllViews();
                viewArrayList.clear();
                dlRight.closeDrawer(Gravity.RIGHT);
                break;
            case R.id.tv_complete:
                viewArrayList.clear();
                page = 1;
                docAdapter.setNewData(null);
                flCondition.removeAllViews();

                final ArrayList<String> stringArray = new ArrayList<>();
                for (int i = 0; i < expandAdapter.getData().size(); i++) {
                    if (expandAdapter.getData().get(i) instanceof Level0) {
                        Level0 level0 = (Level0) expandAdapter.getData().get(i);
                        for (int j = 0; j < level0.getSubItems().size(); j++) {
                            Level1 level1 = level0.getSubItem(j);
                            if (level1.isSelected()) {
                                View view1 = getLayoutInflater().inflate(R.layout.item_search_condition, flCondition, false);
                                TextView tvCondition = (TextView) view1.findViewById(R.id.tv_condition);
                                tvCondition.setText(level1.getShowName());
                                viewArrayList.add(view1);
                                stringArray.add(level0.getShowName().substring(0, 2) + ":" + level1.getValue());
                            }
                        }
                    }
                }
                for (int i = 0; i < viewArrayList.size(); i++) {
                    View view2 = viewArrayList.get(i);
                    final ImageView ivDelete = (ImageView) view2.findViewById(R.id.iv_delete);
                    ivDelete.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int position = flCondition.indexOfChild((View) ivDelete.getParent());
                            flCondition.removeView((View) ivDelete.getParent());
                            stringArray.remove(position);
                            navigation = "";
                            for (int i = 0; i < stringArray.size(); i++) {
                                if (i == 0) {
                                    navigation += stringArray.get(i);
                                } else {
                                    navigation += "*" + stringArray.get(i);
                                }
                            }
                            Log.d(TAG, "onViewClicked: navigation" + navigation);
                            mPresenter.searchNavigation(text, navigation, startDate, endDate);

                            mPresenter.search(text, page, navigation, startDate, endDate, sortField);
                        }
                    });
                    flCondition.addView(view2);
                }

                navigation = "";
                for (int i = 0; i < stringArray.size(); i++) {
                    if (i == 0) {
                        navigation += stringArray.get(i);
                    } else {
                        navigation += "*" + stringArray.get(i);
                    }
                }
                Log.d(TAG, "onViewClicked: navigation" + navigation);
                startDate = expandAdapter.getStartTime();
                endDate = expandAdapter.getEndTime();
                dlRight.closeDrawer(Gravity.RIGHT);
                mPresenter.searchNavigation(text, navigation, startDate, endDate);
                mPresenter.search(text, page, navigation, startDate, endDate, sortField);
                break;
            case R.id.rl_selet_one:
                if (sortField.equals("相关度:desc")) {
                    sortField = "相关度:asc";
                    setDrabelRight(ivSelectedOne, R.mipmap.asc);
                } else {
                    sortField = "相关度:desc";
                    setDrabelRight(ivSelectedOne, R.mipmap.desc);
                }
                page = 1;
                docAdapter.setNewData(null);
                mPresenter.search(text, page, navigation, startDate, endDate, sortField);
                break;
            case R.id.rl_selet_two:
                if (sortField.equals("发表时间:desc")) {
                    sortField = "发表时间:asc";
                    setDrabelRight(ivSelectedTwo, R.mipmap.asc);
                } else {
                    sortField = "发表时间:desc";
                    setDrabelRight(ivSelectedTwo, R.mipmap.desc);
                }
                page = 1;
                docAdapter.setNewData(null);
                mPresenter.search(text, page, navigation, startDate, endDate, sortField);
                break;
            case R.id.rl_selet_three:
                if (sortField.equals("热度:desc")) {
                    sortField = "热度:asc";
                    setDrabelRight(ivSelectedThree, R.mipmap.asc);
                } else {
                    sortField = "热度:desc";
                    setDrabelRight(ivSelectedThree, R.mipmap.desc);
                }
                page = 1;
                docAdapter.setNewData(null);
                mPresenter.search(text, page, navigation, startDate, endDate, sortField);
                break;
            case R.id.rl_selet_four:
                if (sortField.equals("被引量:desc")) {
                    sortField = "被引量:asc";
                    setDrabelRight(ivSelectedFour, R.mipmap.asc);
                } else {
                    sortField = "被引量:desc";
                    setDrabelRight(ivSelectedFour, R.mipmap.desc);
                }
                page = 1;
                docAdapter.setNewData(null);
                mPresenter.search(text, page, navigation, startDate, endDate, sortField);
                break;
        }
    }

    private void setDrabelRight(ImageView msSeletOne, int ms_selet_four) {
        ivSelectedOne.setImageResource(0);
        ivSelectedTwo.setImageResource(0);
        ivSelectedThree.setImageResource(0);
        ivSelectedFour.setImageResource(0);
        Drawable drawable = getResources().getDrawable(ms_selet_four);
        msSeletOne.setImageDrawable(drawable);

    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {

    }

    @Override
    public void onDrawerOpened(View drawerView) {

    }

    @Override
    public void onDrawerClosed(View drawerView) {

    }

    @Override
    public void onDrawerStateChanged(int newState) {

    }


    @Override
    public void loadFilterView(SearchFilterListBean searchFilterListBean) {
        multiItemEntityArrayList.clear();
        if (searchFilterListBean == null || searchFilterListBean.getData() == null) {
            expandAdapter.setNewData(null);
            return;
        }

        for (int i = 0; i < searchFilterListBean.getData().size(); i++) {
            SearchFilterListBean.DataBean dataBean = searchFilterListBean.getData().get(i);
            if (searchFilterListBean.getData().get(i).getPId().equals("-1")) {
                Level0 level0 = new Level0();
                level0.setId(dataBean.getId());
                level0.setName(dataBean.getName());
                level0.setValue(dataBean.getValue());
                level0.setShowName(dataBean.getShowName());
                level0.setFacetField(dataBean.getFacetField());
                multiItemEntityArrayList.add(level0);
            }
        }
        for (int i = 0; i < searchFilterListBean.getData().size(); i++) {
            SearchFilterListBean.DataBean dataBean = searchFilterListBean.getData().get(i);
            if (!searchFilterListBean.getData().get(i).getPId().equals("-1")) {
                Level1 level1 = new Level1();
                level1.setId(dataBean.getId());
                level1.setName(dataBean.getName());
                level1.setValue(dataBean.getValue());
                level1.setShowName(dataBean.getShowName());
                level1.setFacetField(dataBean.getFacetField());
                level1.setpId(dataBean.getPId());
                for (int j = 0; j < multiItemEntityArrayList.size(); j++) {
                    if (level1.getpId().equals(((Level0) multiItemEntityArrayList.get(j)).getId())) {
                        ((Level0) multiItemEntityArrayList.get(j)).addSubItem(level1);
                    }
                }
            }
        }
        //如果每一个选项只有一项默认选择;
        for (int i = 0; i < multiItemEntityArrayList.size(); i++) {
            Level0 level0 = (Level0) multiItemEntityArrayList.get(i);
            if (level0.getSubItems().size() == 1) {
                level0.getSubItems().get(0).setSelected(true);
                level0.setExpanded(true);
            }
        }

        Level2 level2 = new Level2();
        level2.setText("年份");
        Level3 level3 = new Level3();
        level2.addSubItem(level3);
        multiItemEntityArrayList.add(level2);
        expandAdapter.setNewData(multiItemEntityArrayList);


    }

    @Override
    public void loadSearchContent(SearchReplyBean searchReplyBean) {

        swipeLayout.setEnabled(true);
        swipeLayout.setRefreshing(false);
        docAdapter.setEnableLoadMore(true);
        docAdapter.loadMoreComplete();
        if (searchReplyBean != null && searchReplyBean.getData() != null) {
            docAdapter.addData(searchReplyBean.getData());
            if (searchReplyBean.getData().size() < 20) {
                docAdapter.loadMoreEnd(false);
            }
        }

    }


    @Override
    public void onRefresh() {
        docAdapter.setEnableLoadMore(false);
        docAdapter.setNewData(null);
        page = 1;


        mPresenter.search(text, page, navigation, startDate, endDate, sortField);
        mPresenter.searchNavigation(text, navigation, startDate, endDate);

    }

    @Override
    public void onLoadMoreRequested() {
        swipeLayout.setEnabled(false);
        page++;
        mPresenter.search(text, page, navigation, startDate, endDate, sortField);
    }


    @Override
    public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
        switch (view.getId()) {
            case R.id.ms_selet_one:
                SnackbarUtil.show(findViewById(android.R.id.content), item);
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
