package com.example.student.studyplan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.R;

import java.util.ArrayList;
import java.util.List;

public class FreshmanFragment_studyPlan extends Fragment {

    RecyclerView recyclerView_s1,recyclerView_s2;
    List<String> subject_s1, hour_s1, no_s1, credit_s1;
    List<String> subject_s2, hour_s2, no_s2, credit_s2;
    TextView hour_1,credit_1,hour_2,credit_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_freshman_studyplan, container, false);
        recyclerView_s1 = view.findViewById(R.id.recycler_view__studyplay_s1);
        recyclerView_s2=  view.findViewById(R.id.recycler_view_studyplan_s2);
        //semester1 obj
        subject_s1 = new ArrayList<>();
        hour_s1 = new ArrayList<>();
        no_s1 = new ArrayList<>();
        credit_s1 = new ArrayList<>();

        //semester2 obj
        subject_s2 = new ArrayList<>();
        hour_s2 = new ArrayList<>();
        no_s2 = new ArrayList<>();
        credit_s2 = new ArrayList<>();

        setSemesterS1();
        setSemesterS2();

        recyclerView_s1.setLayoutManager(new LinearLayoutManager(getContext()){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        recyclerView_s2.setLayoutManager(new LinearLayoutManager(getContext()){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        Adapter_Freshman_S2_StudyPlan adapter_s2 = new Adapter_Freshman_S2_StudyPlan(getContext(),subject_s2,hour_s2,no_s2,credit_s2);
        Adapter_Freshman_S1_StudyPlan adapter_s1 = new Adapter_Freshman_S1_StudyPlan(getContext(), subject_s1, hour_s1, no_s1, credit_s1);
        recyclerView_s1.setAdapter(adapter_s1);
        recyclerView_s2.setAdapter(adapter_s2);
        return view;
    }

    private void setSemesterS2() {
        subject_s2.add("Java Programing");
        hour_s2.add("45");
        credit_s2.add("3");
        no_s2.add("1");
        subject_s2.add("Java Programing");
        hour_s2.add("45");
        credit_s2.add("3");
        no_s2.add("1");
        subject_s2.add("Java Programing");
        hour_s2.add("45");
        credit_s2.add("3");
        no_s2.add("1");
        subject_s2.add("Java Programing");
        hour_s2.add("45");
        credit_s2.add("3");
        no_s2.add("1");
        subject_s2.add("Java Programing");
        hour_s2.add("45");
        credit_s2.add("3");
        no_s2.add("1");
        subject_s2.add("Java Programing");
        hour_s2.add("45");
        credit_s2.add("3");
        no_s2.add("1");
    }

    private void setSemesterS1() {
        subject_s1.add("Java Programing");
        hour_s1.add("45");
        credit_s1.add("3");
        no_s1.add("1");

        subject_s1.add("Java Programing");
        hour_s1.add("45");
        credit_s1.add("3");
        no_s1.add("1");

        subject_s1.add("Java Programing");
        hour_s1.add("45");
        credit_s1.add("3");
        no_s1.add("1");

        subject_s1.add("Java Programing");
        hour_s1.add("45");
        credit_s1.add("3");
        no_s1.add("1");

        subject_s1.add("Java Programing");
        hour_s1.add("45");
        credit_s1.add("3");
        no_s1.add("1");

        subject_s1.add("Java Programing");
        hour_s1.add("45");
        credit_s1.add("3");
        no_s1.add("1");
    }

}