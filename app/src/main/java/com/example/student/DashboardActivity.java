package com.example.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.student.dashboard.Adapter;
import com.example.student.dashboard.MenuFragment;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        recyclerView = findViewById(R.id.grid_view_category);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("schedule");
        titles.add("Study Plan");
        titles.add("Attendance");
        titles.add("Feedback");
        titles.add("Score");

        images.add(R.drawable.ic_schedule_24);
        images.add(R.drawable.ic_study_plan_24);
        images.add(R.drawable.ic_attendance_24);
        images.add(R.drawable.ic_feedback_24);
        images.add(R.drawable.ic_score_24);

        adapter = new Adapter(this,titles,images);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(DashboardActivity.this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

        //call fragment menu
//        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new MenuFragment()).commit();
    }
}