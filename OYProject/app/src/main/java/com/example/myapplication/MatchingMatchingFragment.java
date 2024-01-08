package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.interfaces.OnClickMatchingBtn;


public class MatchingMatchingFragment extends Fragment implements OnClickMatchingBtn {


    public MatchingMatchingFragment() {
        // Required empty public constructor
    }

    public static MatchingMatchingFragment newInstance(String param1, String param2) {
        MatchingMatchingFragment fragment = new MatchingMatchingFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_matching_matching, container, false);
    }

    @Override
    public void onClickMating() {

    }
}