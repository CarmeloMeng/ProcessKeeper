package com.carmelo.processkeeper.example;

import android.app.Application;
import android.content.Context;
import android.content.Intent;


import com.carmelo.processkeeper.DaemonClient;
import com.carmelo.processkeeper.DaemonConfigurations;

import com.carmelo.processkeeper.example.receiver.Receiver1;
import com.carmelo.processkeeper.example.receiver.Receiver2;
import com.carmelo.processkeeper.example.service.Service1;
import com.carmelo.processkeeper.example.service.Service2;

/**
 * Created by Carmelo on 2017/9/27.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        startService(new Intent(this, Service1.class));
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        DaemonClient mDaemonClient = new DaemonClient(createDaemonConfigurations());
        mDaemonClient.onAttachBaseContext(base);
    }


    private DaemonConfigurations createDaemonConfigurations() {
        DaemonConfigurations.DaemonConfiguration configuration1 = new DaemonConfigurations.DaemonConfiguration(
                "com.carmelo.processkeeper.example:process1",
                Service1.class.getCanonicalName(),
                Receiver1.class.getCanonicalName());
        DaemonConfigurations.DaemonConfiguration configuration2 = new DaemonConfigurations.DaemonConfiguration(
                "com.carmelo.processkeeper.example:process2",
                Service2.class.getCanonicalName(),
                Receiver2.class.getCanonicalName());
        DaemonConfigurations.DaemonListener listener = new MyDaemonListener();
        //return new DaemonConfigurations(configuration1, configuration2);//listener can be null
        return new DaemonConfigurations(configuration1, configuration2, listener);
    }


    class MyDaemonListener implements DaemonConfigurations.DaemonListener {
        @Override
        public void onPersistentStart(Context context) {
        }

        @Override
        public void onDaemonAssistantStart(Context context) {
        }

        @Override
        public void onWatchDaemonDead() {
        }
    }
}
