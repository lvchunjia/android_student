package com.example.a02_activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}