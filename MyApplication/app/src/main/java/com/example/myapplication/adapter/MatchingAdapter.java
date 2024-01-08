package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Matching;

import java.sql.Date;
import java.time.Instant;

class MatchingAdapter extends RecyclerView.Adapter<MatchingAdapter.MatchingViewHoder> {



    @NonNull
    @Override
    public MatchingViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Matching_list_item.xml 과 연결시켜주는부분
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.matching_list_item, parent, false);
        return new MatchingViewHoder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MatchingViewHoder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MatchingViewHoder extends RecyclerView.ViewHolder{

        private View itemView;
        private ImageView matchingimage;   // 이미지
        private TextView tennisAreaView; // 테니스장 이름
        private TextView dateView;         // 날짜
        private TextView conditionView;   // 조건


        public MatchingViewHoder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            matchingimage = itemView.findViewById(R.id.matchingimage);
            tennisAreaView = itemView.findViewById(R.id.tennisArea);
            dateView = itemView.findViewById(R.id.date);
            conditionView = itemView.findViewById(R.id.condition);
        }
        public void setItem(Matching matching){
            tennisAreaView.setText(String.valueOf(matching.getTennisAreaView()));
            conditionView.setText(String.valueOf(matching.getConditionView()));
            dateView.setText(String.valueOf(matching.getDateView()));




        }
    }
}
