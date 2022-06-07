package com.example.student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.MenuItem;

import com.example.student.dashboard.CategoryFragment;
import com.example.student.dashboard.NewsFragment;
import com.google.android.material.navigation.NavigationBarView;


public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        NavigationBarView navigationBarView = findViewById(R.id.menu_dashboard);
        // initial fragment category
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_category,new CategoryFragment()).commit();

        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_dashboard_menu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_category,new CategoryFragment()).commit();
                        break;
                    case R.id.news_dashboard_menu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_category,new NewsFragment()).commit();
                        break;
                }
                return true;
            }
        });

    }
}