package com.example.student.student_account.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;

import java.util.ArrayList;

public class NewsFragment extends Fragment {

    private ArrayList<String> subject, date,time,room;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_newsfragment, container, false);

        subject = new ArrayList<>();
        date = new ArrayList<>();
        time = new ArrayList<>();
        room = new ArrayList<>();

        subject.add("System Analyse and Design");
        date.add("11,07,2022");
        time.add("6:00pm to 8:00pm");
        room.add("Preah Kan");

        subject.add("Management Information System");
        date.add("14,06,2022");
        time.add("8:00pm to 8:30pm");
        room.add("Preah Kan");

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_midterm);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new Adapter_midterm(getContext(),subject,date,time,room));

        return view;
    }
}