package com.bing.mvpdemo;

import android.os.Bundle;

import com.bing.mvpdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public boolean useEventBus() {
        return false;
    }
}
