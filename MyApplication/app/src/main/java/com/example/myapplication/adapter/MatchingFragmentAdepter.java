package com.example.myapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.MatchingFragment;
import com.example.myapplication.MatchingReserveFragment;
import com.example.myapplication.MatchingMatchingFragment;

public class MatchingFragmentAdepter extends FragmentStateAdapter {

   Fragment[] fragments = new Fragment[] {new MatchingMatchingFragment(), new MatchingReserveFragment()};

    public MatchingFragmentAdepter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return fragments[position];
    }

    @Override
    public int getItemCount() {

        return fragments.length;
    }
}
