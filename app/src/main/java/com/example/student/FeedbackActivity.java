package com.example.student;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.student.R;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Toolbar actionbar = findViewById(R.id.custom_toolbar_feedback);
        actionbar.setTitle("Give Feedback");
        setSupportActionBar(actionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}