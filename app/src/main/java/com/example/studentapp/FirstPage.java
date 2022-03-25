package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        new Handler().postDelayed(new Runnable() {
            public void run(){
                Intent intent = new Intent(FirstPage.this,MainActivity.class);
                startActivity(intent);
            }
        },2000);
    }
}