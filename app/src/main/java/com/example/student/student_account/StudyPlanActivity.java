package com.example.student.student_account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.student.R;

public class StudyPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studyplan);
        Toolbar actionbar = findViewById(R.id.custom_toolbar_studyplan);
        actionbar.setTitle("Study Plan");
        setSupportActionBar(actionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView subject_tittle_studyplan = findViewById(R.id.subject_title_studyplan);
        subject_tittle_studyplan.setText("IT");
        Button freshmen,sophomore,junior,senior;
    }
}