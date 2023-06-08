package com.example.a09_fragmenttest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());
        // RightFragment rightFragment = getFragmentManager().getPrimaryNavigationFragment();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            replaceFragment(new AnotherRightFragment());

        }

    }

    private void replaceFragment(Fragment fragment) {
        // FragmentManager fragmentManager = getSupportFragmentManager();
        // FragmentTransaction transaction = fragmentManager.beginTransaction();
        // transaction.replace(R.id.right_layout, fragment);
        //
        // transaction.addToBackStack(null);
        //
        // transaction.commit();

    }
}