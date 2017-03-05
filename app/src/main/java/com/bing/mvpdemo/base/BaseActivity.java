package com.bing.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wubz on 17/3/3.
 */

public abstract class BaseActivity extends AppCompatActivity implements UiCallback {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
        }
        initData(savedInstanceState);
    }

    @Override
    public boolean useEventBus() {
        return false;
    }
}
