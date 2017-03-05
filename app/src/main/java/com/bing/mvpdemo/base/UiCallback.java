package com.bing.mvpdemo.base;

import android.os.Bundle;

/**
 * Created by wubz on 17/3/3.
 */

public interface UiCallback {

    int getLayoutId();

    void initData(Bundle savedInstanceState);

    boolean useEventBus();
}
