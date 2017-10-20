package com.carmelo.processkeeper.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class Service1 extends Service {
    private static final String TAG = "Service1";
    public Service1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG, "Service1 onCreate");
    }
}
