package com.example.myapplication;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentMatchingMatchingBinding;


public class MatchingMatchingFragment extends Fragment {

    FragmentMatchingMatchingBinding binding;

    public MatchingMatchingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMatchingMatchingBinding.inflate(inflater,container,false);

        binding.matchingDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(getContext(), R.style.DialogAnimation);
                dialog.setContentView(R.layout.matching_date);
                dialog.show();
            }
        });

        return binding.getRoot();
    }


}