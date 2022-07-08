package com.example.student;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.student_login_toolbar);
        setSupportActionBar(toolbar);
        setTitle("Student");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button student_btn_login = findViewById(R.id.student_btn_login);

        student_btn_login.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
        });

    }
}