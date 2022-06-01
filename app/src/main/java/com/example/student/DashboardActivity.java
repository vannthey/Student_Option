package com.example.student;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.student.dashboard.Adapter;
import com.example.student.dashboard.CategoryFragment;
import com.example.student.dashboard.MenuFragment;


public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //name student on dashboard
        TextView student_name_dashboard = findViewById(R.id.student_name_dashboard);
        //student rank on dashboard
        TextView student_rank_dashboard = findViewById(R.id.student_rank_dashboard);
        TextView student_credit_dashboar = findViewById(R.id.student_credit_dashboard);

        student_rank_dashboard.setText("#2nd Rank");
        student_credit_dashboar.setText("500");
        student_name_dashboard.setText("Thorng Vanthey");
//        call fragment category
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_category,new CategoryFragment()).commit();
//        call fragment menu
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame_menu, new MenuFragment()).commit();
    }
}