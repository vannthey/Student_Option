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

import com.example.student.dashboard.studyplan.FreshmanFragment_studyPlan;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Objects;

public class StudyPlanActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabAdapter tabAdapter;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studyplan);
        Toolbar actionbar = findViewById(R.id.custom_toolbar_studyPlan);
        actionbar.setTitle("Study Plan");
        setSupportActionBar(actionbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        TextView subject_tittle_studyPlan = findViewById(R.id.subject_title_studyPlan);
        subject_tittle_studyPlan.setText("Information Technology");

        tabLayout = findViewById(R.id.tab_menu_studyPlan);
        viewPager = findViewById(R.id.view_pager_menu_studyPlan);

        tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.setFragment(new FreshmanFragment_studyPlan(), "Freshman");
        tabAdapter.setFragment(new FreshmanFragment_studyPlan(), "Sophomore");
        tabAdapter.setFragment(new FreshmanFragment_studyPlan(), "Junior");
        tabAdapter.setFragment(new FreshmanFragment_studyPlan(), "Senior");
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