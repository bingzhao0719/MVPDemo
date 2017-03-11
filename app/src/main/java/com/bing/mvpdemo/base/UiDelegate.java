package com.bing.mvpdemo.base;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wubz on 17/3/11.
 */

public class UiDelegate {

    private Context mContext;

    private UiDelegate(Context context) {
        this.mContext = context;
    }

    public static UiDelegate create(Context context) {
        return new UiDelegate(context);
    }

    public void toastLong(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }

    public void toastShort(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
