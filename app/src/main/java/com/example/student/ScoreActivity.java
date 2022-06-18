package com.example.student;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.student.dashboard.dashboard_score.FreshmanFragment_score;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Objects;

public class ScoreActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    TabAdapter tabAdapter;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Toolbar toolbar = findViewById(R.id.custom_toolbar_score);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Score");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        TextView subject_title_score = findViewById(R.id.subject_title_score);
        subject_title_score.setText("Information Technology");

        tabLayout = findViewById(R.id.tab_menu_score);
        viewPager = findViewById(R.id.view_pager_menu_score);

        tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.setFragment(new FreshmanFragment_score(),"Freshman");
        tabAdapter.setFragment(new FreshmanFragment_score(),"Sophomore");
        tabAdapter.setFragment(new FreshmanFragment_score(),"Junior");
        tabAdapter.setFragment(new FreshmanFragment_score(),"Senior");
        //set Adapter
        viewPager.setAdapter(tabAdapter);

        //connect tab layout with view paper
        tabLayout.setupWithViewPager(viewPager);

    }

    static class TabAdapter extends FragmentPagerAdapter {
        ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        public void setFragment(Fragment fragment, String menu) {
            fragmentArrayList.add(fragment);
            stringArrayList.add(menu);
        }

        public TabAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
           return fragmentArrayList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentArrayList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
           return stringArrayList.get(position);
        }
    }
}