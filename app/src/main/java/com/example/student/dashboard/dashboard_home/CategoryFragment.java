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
    GridView gridView_category, gridView_card_rank_credit;
    //category
    String[] title_category = {"Schedule", "Study Plan", "Attendance", "Feedback", "Score"};
    int[] image_category = {R.drawable.ic_schedule_24, R.drawable.ic_study_plan_24, R.drawable.ic_attendance_24, R.drawable.ic_feedback_24, R.drawable.ic_score_24};

    //for card view rank and credit on dashboard
    String[] rank_credit = {"#1st Rank", "300"};
    String[] label_rank_credit = {"Student Rank", "Total Credit"};
    int[] image_rank_credit = {R.drawable.rank, R.drawable.credit};

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        //name student on dashboard
        TextView student_name_dashboard = view.findViewById(R.id.student_name_dashboard);
        //set text
        student_name_dashboard.setText("Thorng Vanthey");


        //profile image
        de.hdodenhof.circleimageview.CircleImageView profile_dashboard = view.findViewById(R.id.profile_dashboard);
        profile_dashboard.setOnClickListener(v -> startActivity(new Intent(getActivity(), ProfileActivity.class)));

        gridView_card_rank_credit = view.findViewById(R.id.gridview_rank_credit);
        gridView_card_rank_credit.setAdapter(new Adapter_rank_credit(this.getContext(), rank_credit, label_rank_credit, image_rank_credit));

        gridView_category = view.findViewById(R.id.grid_view_dashboard);
        gridView_category.setAdapter(new Adapter_category(this.getContext(), title_category, image_category));
        gridView_category.setOnItemClickListener((parent, view1, position, id) -> {
            Toast.makeText(getContext(), title_category[position], Toast.LENGTH_SHORT).show();
            if (Objects.equals(title_category[position], "Schedule")) {
                startActivity(new Intent(getActivity(), ScheduleActivity.class));
            } else if (Objects.equals(title_category[position], "Study Plan")) {
                startActivity(new Intent(getActivity(), StudyPlanActivity.class));
            } else if (Objects.equals(title_category[position], "Attendance")) {
                startActivity(new Intent(getActivity(), AttendanceActivity.class));
            } else if (Objects.equals(title_category[position], "Feedback")) {
                startActivity(new Intent(getActivity(), FeedbackActivity.class));
            } else if (Objects.equals(title_category[position], "Score")) {
                startActivity(new Intent(getActivity(), ScoreActivity.class));
            }
        });
        return view;
    }
}