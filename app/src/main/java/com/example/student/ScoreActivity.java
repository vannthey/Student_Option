package com.example.student;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.student.dashboard.dashboard_score.FreshmanFragment_score;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.Objects;

public class ScoreActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    String[] Tab_title = {"Year 1", "Year 2", "year 3", "year 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Toolbar toolbar = findViewById(R.id.custom_toolbar_score);
        setSupportActionBar(toolbar);
        setTitle("Score");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView subject_title_score = findViewById(R.id.subject_title_score);
        subject_title_score.setText("Information Technology");

        tabLayout = findViewById(R.id.tab_menu_score);
        viewPager2 = findViewById(R.id.view_pager_menu_score);
        viewPager2.setAdapter(new TabAdapter(this));

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(Tab_title[position])).attach();

    }

    public class TabAdapter extends FragmentStateAdapter {
        String[] Tab_title = {"Year 1", "Year 2", "year 3", "year 4"};

        public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new FreshmanFragment_score();
                case 1:
                case 2:
                case 3:
            }
            return new FreshmanFragment_score();
        }

        @Override
        public int getItemCount() {
            return Tab_title.length;
        }
    }
}