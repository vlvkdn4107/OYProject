package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.view.FocusFinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.databinding.FragmentMatchingBinding;
import com.example.myapplication.interfaces.OnClickMatchingBtn;
import com.google.android.material.tabs.TabLayout;

public class MatchingFragment extends Fragment{
     FragmentMatchingBinding binding;
    public MatchingFragment() {

    }


//   Fragment안에 버튼 클릭시 다른 Fragment 전환
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMatchingBinding.inflate(inflater,container, false);
        binding.matchingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchingMatchingFragment matchingMatchingFragment = new MatchingMatchingFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.mainFrameLayout,matchingMatchingFragment);
                transaction.commit();
            }
        });
        return  binding.getRoot();
    }
}