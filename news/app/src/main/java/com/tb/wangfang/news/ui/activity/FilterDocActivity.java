package com.tb.wangfang.news.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.tb.wangfang.news.R;
import com.tb.wangfang.news.base.BaseActivity;
import com.tb.wangfang.news.base.contract.FilterDocContract;
import com.tb.wangfang.news.model.bean.Level0;
import com.tb.wangfang.news.model.bean.Level1;
import com.tb.wangfang.news.model.bean.Level2;
import com.tb.wangfang.news.model.bean.Level3;
import com.tb.wangfang.news.model.bean.SearchDocItem;
import com.tb.wangfang.news.presenter.FilterDocPresenter;
import com.tb.wangfang.news.ui.adapter.FilterExpandAdapter;
import com.tb.wangfang.news.ui.adapter.SearchDocumentAdapter;
import com.tb.wangfang.news.utils.SnackbarUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
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
    MaterialSpinner msSeletOne;
    @BindView(R.id.ms_selet_two)
    MaterialSpinner msSeletTwo;
    @BindView(R.id.ms_selet_three)
    MaterialSpinner msSeletThree;
    private SearchDocumentAdapter docAdapter;
    private ArrayList<SearchDocItem> searchDocItemArrayList = new ArrayList<>();
    ArrayList<MultiItemEntity> multiItemEntityArrayList = new ArrayList<>();
    private int page = 1;
    private String text;
    private FilterExpandAdapter expandAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_filter_doc;
    }

    @Override
    protected void initEventAndData() {
        //初始化搜索控件
        text = getIntent().getExtras().getString("text");
        msSeletOne.setItems("Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow");
        msSeletOne.setOnItemSelectedListener(this);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        rvContent.setLayoutManager(new LinearLayoutManager(this));
        //假数据
        for (int i = 0; i < 30; i++) {
            SearchDocItem item = new SearchDocItem();
            item.setDescription("违法科技为飞机无法访问广告位" + i);
            searchDocItemArrayList.add(item);
        }
        docAdapter = new SearchDocumentAdapter(searchDocItemArrayList);
        docAdapter.setOnLoadMoreListener(this, rvContent);
        docAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        docAdapter.setPreLoadNumber(2);
        rvContent.setAdapter(docAdapter);

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
                startActivity(intent);
            }
        });
        docAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(FilterDocActivity.this, JournalActivity.class);
                startActivity(intent);
            }
        });
        mPresenter.search(text, page);
    }


    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }


    @OnClick({R.id.iv_go_back, R.id.iv_menu, R.id.tv_reset, R.id.tv_complete})
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
                for (int i = 0; i < expandAdapter.getData().size(); i++) {
                    expandAdapter.getData().get(i);
                }
                break;
            case R.id.tv_complete:
                int m = multiItemEntityArrayList.size();
                Log.d("tb", "onViewClicked: " + m);
                break;
        }
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
    public void refreshView(List<SearchDocItem> searchDocItems) {

        docAdapter.setNewData(searchDocItems);
        swipeLayout.setRefreshing(false);
        docAdapter.setEnableLoadMore(true);

    }

    @Override
    public void loadMoreView(List<SearchDocItem> searchDocItems) {
        swipeLayout.setEnabled(false);
        docAdapter.addData(searchDocItems);
        docAdapter.loadMoreComplete();
        swipeLayout.setEnabled(true);

    }

    @Override
    public void loadFilterView(List<Level0> searchDocItems) {
        multiItemEntityArrayList.clear();
        for (int i = 0; i < 3; i++) {
            Level0 level0 = new Level0();
            level0.setText("氛围妇女节窝囊废" + i);
            for (int j = 0; j < 3; j++) {
                Level1 level1 = new Level1();
                level1.setText(j + "蜂窝肺");
                level1.setParentId(i);
                level1.setChildId(j);
                level0.addSubItem(level1);
            }

            multiItemEntityArrayList.add(level0);

        }
        Level2 level2 = new Level2();
        level2.setText("年份");
        Level3 level3 = new Level3();
        level2.addSubItem(level3);
        multiItemEntityArrayList.add(level2);
        expandAdapter.setNewData(multiItemEntityArrayList);

    }


    @Override
    public void onRefresh() {

        page = 1;
        docAdapter.setEnableLoadMore(false);
        mPresenter.search(text, page);


    }

    @Override
    public void onLoadMoreRequested() {
        mPresenter.search(text, ++page);
    }


    @Override
    public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
        switch (view.getId()) {
            case R.id.ms_selet_one:
                SnackbarUtil.show(findViewById(android.R.id.content), item);
                break;
        }
    }


}
