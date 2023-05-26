package com.example.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Log.d(TAG, "onCreate: " + getTaskId());

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1、提示
                //  Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();

                // 2、销毁活动
                // finish();

                // 3、显示intent
                // Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // startActivity(intent);

                // 4、隐式intent
                // Intent intent = new Intent("com.example.activitytest.ACTION_START");
                // intent.addCategory("com.example.activitytest.MY_CATEGORY");
                // startActivity(intent);

                // 5、隐式 Intent 的用法
                // Intent intent = new Intent(Intent.ACTION_VIEW);
                // intent.setData(Uri.parse("https://www.baidu.com"));
                // startActivity(intent);

                // 6、隐式 Intent 拨号 的用法
                // Intent intent = new Intent(Intent.ACTION_DIAL);
                // intent.setData(Uri.parse("tel: 10086"));
                // startActivity(intent);

                // // 7、Intent 传递数据
                // String data = "Hello SecondActivity";
                // Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // intent.putExtra("extra_data", data);
                // startActivity(intent);

                // 8、返回数据
                // Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // startActivityForResult(intent, 1);

                //  9/  standard
                // Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // startActivity(intent);

                SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.add_item) {
            Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.remove_item) {
            Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String returnedData = data.getStringExtra("data_return");
                Log.d(TAG, "onActivityResult: " + returnedData);
            }
        }
    }


}