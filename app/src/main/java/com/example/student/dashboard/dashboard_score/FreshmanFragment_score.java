package com.example.student.dashboard.dashboard_score;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.R;
import com.example.student.dashboard.dashboard_score.Adapter_score.Adapter_Freshman_S1_Score;
import com.example.student.dashboard.dashboard_score.Adapter_score.Adapter_Freshman_S2_Score;

import java.util.ArrayList;
import java.util.List;

public class FreshmanFragment_score extends Fragment {
    RecyclerView recyclerView_s1;
    RecyclerView recyclerView_s2;

    List<String> Subject_S1, Rank_S1, Grade_S1, Total_S1;
    List<String> Subject_S2, Rank_S2, Grade_S2, Total_S2;

    Adapter_Freshman_S1_Score adapter_freshman_s1_score;
    Adapter_Freshman_S2_Score adapter_freshman_s2_score;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_freshman_score, container, false);

        Subject_S1 = new ArrayList<>();
        Rank_S1 = new ArrayList<>();
        Grade_S1 = new ArrayList<>();
        Total_S1 = new ArrayList<>();

        Subject_S2 = new ArrayList<>();
        Rank_S2 = new ArrayList<>();
        Grade_S2 = new ArrayList<>();
        Total_S2 = new ArrayList<>();

        setViewSemester1();
        recyclerView_s1 = view.findViewById(R.id.recycler_view_s1_score);
        recyclerView_s1.setHasFixedSize(true);
        recyclerView_s1.setLayoutManager(new LinearLayoutManager(getContext()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        adapter_freshman_s1_score = new Adapter_Freshman_S1_Score(Subject_S1, Rank_S1, Grade_S1, Total_S1);
        recyclerView_s1.setAdapter(adapter_freshman_s1_score);

        setViewSemester2();
        recyclerView_s2 = view.findViewById(R.id.recycler_view_s2_score);
        recyclerView_s2.setHasFixedSize(true);
        recyclerView_s2.setLayoutManager(new LinearLayoutManager(getContext()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        adapter_freshman_s2_score = new Adapter_Freshman_S2_Score(Subject_S2, Rank_S2, Grade_S2, Total_S2);
        recyclerView_s2.setAdapter(adapter_freshman_s2_score);
        recyclerView_s2.setNestedScrollingEnabled(false);
        return view;
    }

    private void setViewSemester1() {
        Subject_S1.add("Java Programing");
        Rank_S1.add("#1");
        Grade_S1.add("A+");
        Total_S1.add("600");

        Subject_S1.add("Data Structure");
        Rank_S1.add("#1");
        Grade_S1.add("A+");
        Total_S1.add("600");

        Subject_S1.add("Network Administration I");
        Rank_S1.add("#1");
        Grade_S1.add("A+");
        Total_S1.add("600");

        Subject_S1.add("Php Programing");
        Rank_S1.add("#1");
        Grade_S1.add("A+");
        Total_S1.add("600");

        Subject_S1.add("Chinese Language");
        Rank_S1.add("#1");
        Grade_S1.add("A+");
        Total_S1.add("600");

        Subject_S1.add("English Language");
        Rank_S1.add("#1");
        Grade_S1.add("A+");
        Total_S1.add("600");

    }

    private void setViewSemester2() {
        Subject_S2.add("Java Programing");
        Rank_S2.add("#1");
        Grade_S2.add("A+");
        Total_S2.add("600");

        Subject_S2.add("Data Structure");
        Rank_S2.add("#1");
        Grade_S2.add("A+");
        Total_S2.add("600");

        Subject_S2.add("Network Administration II");
        Rank_S2.add("#1");
        Grade_S2.add("A+");
        Total_S2.add("600");

        Subject_S2.add("Php Programing");
        Rank_S2.add("#1");
        Grade_S2.add("A+");
        Total_S2.add("600");

        Subject_S2.add("Chinese Language");
        Rank_S2.add("#1");
        Grade_S2.add("A+");
        Total_S2.add("600");

        Subject_S2.add("English Language");
        Rank_S2.add("#1");
        Grade_S2.add("A+");
        Total_S2.add("600");
    }

}