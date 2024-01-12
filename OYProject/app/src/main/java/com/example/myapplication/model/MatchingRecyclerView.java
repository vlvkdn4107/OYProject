package com.example.myapplication.model;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.FragmentMatchingBinding;
import com.example.myapplication.databinding.FragmentMatchingMatchingBinding;

public class MatchingRecyclerView extends AppCompatActivity {

    private RecyclerView recyclerView;
    FragmentMatchingMatchingBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.matchingRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        gameMatchingload();

    }

    private void gameMatchingload() {

    }
}
