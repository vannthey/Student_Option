package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //underline forgot password text
        TextView forgot_password_login = findViewById(R.id.forgot_password_login);
        forgot_password_login.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        Button student_btn_login = findViewById(R.id.student_btn_login);

        student_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

    }
}