package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.view.FocusFinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.databinding.FragmentMatchingBinding;
import com.example.myapplication.interfaces.OnClickMatchingBtn;
import com.google.android.material.tabs.TabLayout;

public class MatchingFragment extends Fragment{
     FragmentMatchingBinding binding;

    public MatchingFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMatchingBinding.inflate(inflater,container, false);

        MatchingMatchingFragment matchingMatchingFragment = new MatchingMatchingFragment();

        // 플래그먼트 관리해주는 Manager
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        // 플래그먼트 첫 화면 셋팅
        transaction.replace(R.id.matchingFragmentmatching,matchingMatchingFragment);
        transaction.commit();
        // 매칭 플래그먼트
        binding.matchingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  //   Fragment안에 버튼 클릭시 다른 Fragment 전환
                MatchingMatchingFragment matchingMatchingFragment = new MatchingMatchingFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                // 플래그먼트 교체 해주는 replace
                transaction.replace(R.id.matchingFragmentmatching,matchingMatchingFragment);
                transaction.commit();
            }
        });
        binding.reserveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchingReserveFragment matchingReserveFragment = new MatchingReserveFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.matchingFragmentmatching,matchingReserveFragment);
                transaction.commit();

            }
        });
        binding.lessonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchingLessonFragment matchingLessonFragment = new MatchingLessonFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.matchingFragmentmatching,matchingLessonFragment);
                transaction.commit();
            }
        });
        return binding.getRoot();
    }


}