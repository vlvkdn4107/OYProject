package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.adapter.MatchingFragmentAdepter;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity{




    BottomNavigationView bottomNavigationView;
    MatchingFragment matchingFragment = new MatchingFragment();
    NewPupilFragment newPupilFragment = new NewPupilFragment();
    DealFragment dealFragment = new DealFragment();
    MyprofileFragment myprofileFragment = new MyprofileFragment();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNav);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,matchingFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.matchingBottom:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,matchingFragment).commit();
                        return  true;
                    case R.id.newPupillBottom:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,newPupilFragment).commit();
                        return  true;
                    case R.id.dealBottom:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,dealFragment).commit();
                        return  true;
                    case R.id.myProfile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,myprofileFragment).commit();
                        return  true;
                }
                return false;
            }
        });



    }

}