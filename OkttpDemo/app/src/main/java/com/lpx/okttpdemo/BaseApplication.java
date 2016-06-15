package com.lpx.okttpdemo;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * Created by liaopeixin on 2016/6/15.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        Logger.init().hideThreadInfo();// 不显示接口信息
        Logger.init();
    }

}
