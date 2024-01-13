package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentMatchingBinding;
import com.example.myapplication.databinding.FragmentNewPupilBinding;


public class NewPupilFragment extends Fragment {
    FragmentNewPupilBinding binding;

    public NewPupilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewPupilBinding.inflate(inflater,container, false);

        NewPupilRuleFragment newPupilruleFragment = new NewPupilRuleFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.newPupilFragment,newPupilruleFragment);
        transaction.commit();

        binding.rulestextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.newPupilFragment,newPupilruleFragment);
                transaction.commit();
            }
        });
        binding.termtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewPupilTermFragment newPupilTermFragment = new NewPupilTermFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.newPupilFragment,newPupilTermFragment);
                transaction.commit();
            }
        });
        binding.mannertextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewPupilMannerFragment newPupilMannerFragment = new NewPupilMannerFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.newPupilFragment,newPupilMannerFragment);
                transaction.commit();
            }
        });

        return binding.getRoot();
    }
}