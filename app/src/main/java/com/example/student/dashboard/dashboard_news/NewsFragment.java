package com.example.student.dashboard.dashboard_news;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;
import com.example.student.test;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

//    RecyclerView recyclerView;
//    List<String> itemList;
//    Adapter_news adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_newsfragment, container, false);
//        recyclerView=view.findViewById(R.id.recycler_view_news);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        itemList.add(new Homework("Data Structure","15,June,2022","6:00 to 8:00"));
//        adapter = new Adapter_news(getContext(),itemList);
//        recyclerView.setAdapter(adapter);
        return view;
    }

}