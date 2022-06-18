package com.example.student;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.dashboard.dashboard_attendance.Adapter_attendance;

import java.util.ArrayList;
import java.util.Objects;

public class AttendanceActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter_attendance adapter_attendance;
    ArrayList<String> subject,hour,permission,absent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        Toolbar actionbar = findViewById(R.id.custom_toolbar_attendance);
        actionbar.setTitle("Attendance");
        setSupportActionBar(actionbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //add subject, hour, permission, absent
        subject = new ArrayList<>();
        hour = new ArrayList<>();
        permission = new ArrayList<>();
        absent = new ArrayList<>();

        subject.add("Microeconomic");
        hour.add("45");
        permission.add("5");
        absent.add("1");

        subject.add("History and Culture of South-East Asia");
        hour.add("45");
        permission.add("0");
        absent.add("2");

        subject.add("Public Administrator");
        hour.add("45");
        permission.add("5");
        absent.add("1");

        subject.add("Computer and Administration");
        hour.add("45");
        permission.add("0");
        absent.add("2");

        subject.add("English Language");
        hour.add("45");
        permission.add("5");
        absent.add("1");

        subject.add("Chinese Language");
        hour.add("45");
        permission.add("0");
        absent.add("2");

        recyclerView = findViewById(R.id.attendance_item_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter_attendance = new Adapter_attendance(subject, hour, permission, absent);
        recyclerView.setAdapter(adapter_attendance);

        recyclerView.setOnClickListener(v -> {

        });

    }
}