package com.bing.mvpdemo;


import android.os.Bundle;

import com.bing.mvpdemo.base.BaseFrag;


public class TestFrag extends BaseFrag {


    public TestFrag() {
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    @Override
    public boolean useEventBus() {
        return false;
    }
}
