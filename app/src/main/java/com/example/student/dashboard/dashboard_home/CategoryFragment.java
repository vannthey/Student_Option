package com.example.student.dashboard.dashboard_home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.student.ScheduleActivity;
import com.example.student.ScoreActivity;
import com.example.student.StudyPlanActivity;
import com.example.student.AttendanceActivity;
import com.example.student.FeedbackActivity;
import com.example.student.ProfileActivity;
import com.example.student.R;

import java.util.Objects;

public class CategoryFragment extends Fragment {
    GridView gridView;
    String[] titles = {"Schedule", "Study Plan", "Attendance", "Feedback", "Score"};
    int[] images = {R.drawable.ic_schedule_24, R.drawable.ic_study_plan_24, R.drawable.ic_attendance_24, R.drawable.ic_feedback_24, R.drawable.ic_score_24};
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        //name student on dashboard
        TextView student_name_dashboard = view.findViewById(R.id.student_name_dashboard);
        //student rank on dashboard
        TextView student_rank_dashboard = view.findViewById(R.id.student_rank_dashboard);
        //student credit on dashboard
        TextView student_credit_dashboard = view.findViewById(R.id.student_credit_dashboard);
        //set text
        student_rank_dashboard.setText("#2nd Rank");
        student_credit_dashboard.setText("500");
        student_name_dashboard.setText("Thorng Vanthey");
        de.hdodenhof.circleimageview.CircleImageView profile_dashboard = view.findViewById(R.id.profile_dashboard);
        profile_dashboard.setOnClickListener(v -> startActivity(new Intent(getActivity(), ProfileActivity.class)));
        //profile picture
        gridView = view.findViewById(R.id.grid_view_dashboard);
        gridView.setAdapter(new Adapter_category(this.getContext(), titles, images));
        gridView.setOnItemClickListener((parent, view1, position, id) -> {
            Toast.makeText(getContext(), titles[position], Toast.LENGTH_SHORT).show();
            if (Objects.equals(titles[position], "Schedule")) {
                startActivity(new Intent(getActivity(), ScheduleActivity.class));
            } else if (Objects.equals(titles[position], "Study Plan")) {
                startActivity(new Intent(getActivity(), StudyPlanActivity.class));
            } else if (Objects.equals(titles[position], "Attendance")) {
                startActivity(new Intent(getActivity(), AttendanceActivity.class));
            } else if (Objects.equals(titles[position], "Feedback")) {
                startActivity(new Intent(getActivity(), FeedbackActivity.class));
            } else if (Objects.equals(titles[position], "Score")) {
                startActivity(new Intent(getActivity(), ScoreActivity.class));
            }
        });
        return view;
    }
}