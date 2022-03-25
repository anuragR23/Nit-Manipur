package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login = findViewById(R.id.Login);
        EditText Password = findViewById(R.id.Password);
        Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
        findViewById(R.id.Show_Password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                CheckBox chkbox = (CheckBox) view.findViewById(R.id.Show_Password);
                if(chkbox.isChecked() == false){
                    Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
}