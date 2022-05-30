package com.example.student;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.example.student.dashboard.Adapter;
import com.example.student.dashboard.CategoryFragment;
import com.example.student.dashboard.MenuFragment;


public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
//        call fragment category
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_category,new CategoryFragment()).commit();
//        call fragment menu
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_menu, new MenuFragment()).commit();
    }
}