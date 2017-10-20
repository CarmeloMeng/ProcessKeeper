package com.carmelo.processkeeper.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class Service2 extends Service {
    private static final String TAG = "Service2";

    public Service2() {
        Log.v(TAG, "Service1 onCreate");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
