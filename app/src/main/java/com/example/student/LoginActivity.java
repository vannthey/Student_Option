package com.example.student;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("InflateParams")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //underline forgot password text
        TextView forgot_password_login = findViewById(R.id.forgot_password_login);
//        forgot_password_login.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        Button student_btn_login = findViewById(R.id.student_btn_login);

        //send information about trouble login
        Button btn_forgot_password_send = findViewById(R.id.btn_forgot_password_send);
        //error
//        btn_forgot_password_send.setOnClickListener(v -> Toast.makeText(this, "Sent", Toast.LENGTH_SHORT).show());

        forgot_password_login.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
            //initialize layout
            LayoutInflater inflater = LoginActivity.this.getLayoutInflater();
            builder.setView(inflater.inflate(R.layout.custom_dialog_forgotpassword, null));
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        });
        student_btn_login.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(intent);
        });

    }
}