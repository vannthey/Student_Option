package com.example.student.dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.student.DashboardActivity;
import com.example.student.FeedbackActivity;
import com.example.student.R;

public class CategoryFragment extends Fragment {
    GridView gridView;
    String[] titles = {"Schedule", "Study Plan", "Attendance", "Feedback", "Score"};
    int[] images = {R.drawable.ic_schedule_24, R.drawable.ic_study_plan_24, R.drawable.ic_attendance_24, R.drawable.ic_feedback_24, R.drawable.ic_score_24};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        gridView = view.findViewById(R.id.grid_view_dashboard);
        gridView.setAdapter(new Adapter(this.getContext(), titles, images));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), titles[position], Toast.LENGTH_SHORT).show();
               if (titles[position]=="Schedule"){

               }else if (titles[position]=="Study Plan"){

               }else if (titles[position]=="Attendance"){

               }else if (titles[position]=="Feedback"){
                   Intent intent = new Intent(getActivity(), FeedbackActivity.class);
                   startActivity(intent);
               }else if (titles[position]=="Score"){

               }
            }
        });
        return view;
    }
}