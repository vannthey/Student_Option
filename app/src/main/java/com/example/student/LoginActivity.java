package com.example.student;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //underline forgot password text
        TextView forgot_password_login = findViewById(R.id.forgot_password_login);
        forgot_password_login.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        Button student_btn_login = findViewById(R.id.student_btn_login);

        //send information about trouble login
        Button btn_forgot_password_send = findViewById(R.id.btn_forgot_password_send);

        forgot_password_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                //initialize layout
                LayoutInflater inflater = LoginActivity.this.getLayoutInflater();
                builder.setView(inflater.inflate(R.layout.custom_dialog_forgotpassword,null));
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        student_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

    }
}