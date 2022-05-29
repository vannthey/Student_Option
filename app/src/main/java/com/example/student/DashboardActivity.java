package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.student.dashboard.MenuFragment;

public class DashboardActivity extends AppCompatActivity {
    DashboardActivity dashboardActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //call fragment menu
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new MenuFragment()).commit();
    }
}