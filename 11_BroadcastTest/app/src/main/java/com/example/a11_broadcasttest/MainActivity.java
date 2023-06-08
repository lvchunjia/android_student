package com.example.a11_broadcasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final int FLAG_RECEIVER_INCLUDE_BACKGROUND = 0x01000000;
    private IntentFilter intentFilter;
    private NetworkChangeReceive networkChangeReceive;

    private LocalReceiver localReceiver;
    private LocalBroadcastManager localBroadcastManager;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // intentFilter = new IntentFilter();
        // intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        // networkChangeReceive = new NetworkChangeReceive();
        // registerReceiver(networkChangeReceive, intentFilter);

        localBroadcastManager = LocalBroadcastManager.getInstance(this);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: send");
                // Intent intent = new Intent("com.example.a12_broadcasttest2.MY_BROADCAST");
                Intent intent = new Intent("com.example.a11_broadcasttest.LOCAL_BROADCAST");
                // intent.setComponent(new ComponentName("com.example.a11_broadcasttest", "com.example.a11_broadcasttest.MyBroadcastReceiver"));
                // intent.addFlags(FLAG_RECEIVER_INCLUDE_BACKGROUND);
                // intent.setPackage("com.example.a12_broadcasttest2");
                // sendBroadcast(intent);
                // sendOrderedBroadcast(intent, null);

                localBroadcastManager.sendBroadcast(intent);
            }
        });

        intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.a11_broadcasttest.LOCAL_BROADCAST");
        localReceiver = new LocalReceiver();
        localBroadcastManager.registerReceiver(localReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // unregisterReceiver(networkChangeReceive);

        localBroadcastManager.unregisterReceiver(localReceiver);
    }

    class NetworkChangeReceive extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            // ConnectivityManager connectionManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            // NetworkInfo networkInfo = connectionManager.getActiveNetwork();
            // NetworkCapabilities networkCapabilities = connectionManager.getNetworkCapabilities(networkInfo);
            // if (networkCapabilities != null) {
            //     Toast.makeText(context, "network is available", Toast.LENGTH_SHORT).show();
            // } else {
            //     Toast.makeText(context, "network is unavailable", Toast.LENGTH_SHORT).show();
            // }

        }
    }
    
    class LocalReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "received local broadcast", Toast.LENGTH_SHORT).show();
        }
    }
}