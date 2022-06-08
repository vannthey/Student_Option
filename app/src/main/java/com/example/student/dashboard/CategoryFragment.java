package com.example.student.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.student.AttendanceActivity;
import com.example.student.FeedbackActivity;
import com.example.student.ProfileActivity;
import com.example.student.R;

public class CategoryFragment extends Fragment {
    GridView gridView;
    String[] titles = {"Schedule", "Study Plan", "Attendance", "Feedback", "Score"};
    int[] images = {R.drawable.ic_schedule_24, R.drawable.ic_study_plan_24, R.drawable.ic_attendance_24, R.drawable.ic_feedback_24, R.drawable.ic_score_24};
    int[] images_background = {R.drawable.usea, R.drawable.usea, R.drawable.usea, R.drawable.usea, R.drawable.usea};

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
        profile_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        //profile picture
        gridView = view.findViewById(R.id.grid_view_dashboard);
        gridView.setAdapter(new Adapter_category(this.getContext(), titles, images, images_background));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), titles[position], Toast.LENGTH_SHORT).show();
                if (titles[position] == "Schedule") {

                } else if (titles[position] == "Study Plan") {

                } else if (titles[position] == "Attendance") {
                    Intent intent = new Intent(getActivity(), AttendanceActivity.class);
                    startActivity(intent);
                } else if (titles[position] == "Feedback") {
                    Intent intent = new Intent(getActivity(), FeedbackActivity.class);
                    startActivity(intent);
                } else if (titles[position] == "Score") {

                }
            }
        });
        return view;
    }
}