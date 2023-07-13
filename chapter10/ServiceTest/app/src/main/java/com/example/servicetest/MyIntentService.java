package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;


public class MyIntentService extends IntentService {
    private static final String TAG = "MyIntentService";


    public MyIntentService() {
        super(TAG);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // 打印当前线程的 id
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(TAG, "onHandleIntent: " + "Thread id is " + Thread.currentThread().getId());

    }
}
