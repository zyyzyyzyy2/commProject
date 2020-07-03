package com.example.communityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class projentry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projentry);
        initButton();
    }

    private void initButton(){
        //登录界面按钮
        findViewById(R.id.projentry_bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //停车界面按钮
        findViewById(R.id.projentry_bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //交费界面按钮
        findViewById(R.id.projentry_bt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //报修界面按钮
        findViewById(R.id.projentry_bt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //预定家政服务界面按钮
        findViewById(R.id.projentry_bt5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //主页面按钮
        findViewById(R.id.projentry_bt6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
