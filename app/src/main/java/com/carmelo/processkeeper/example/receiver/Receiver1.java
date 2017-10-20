package com.carmelo.processkeeper.example.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver1 extends BroadcastReceiver {
    private static final String TAG = "Receiver1";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "Receiver1 onReceive.");
    }
}
