package com.example.administrator.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test(View view) {
        startActivity(new Intent(MainActivity.this,ExamActiviity.class));
    }

    public void exit(View view) {
        finish();
    }
}
