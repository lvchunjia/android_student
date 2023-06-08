package com.example.a11_broadcasttest;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {

    private static final String TAG = "BootCompleteReceiver";
    private static final String ACTION_BOOT = "android.intent.action.BOOT_COMPLETED";

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        // throw new UnsupportedOperationException("Not yet implemented");

        if (ACTION_BOOT.equals(intent.getAction())) {
            Toast.makeText(context, "Boot Complete", Toast.LENGTH_SHORT).show();
        }
    }
}