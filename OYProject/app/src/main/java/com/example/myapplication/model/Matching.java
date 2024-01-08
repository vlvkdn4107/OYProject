package com.example.myapplication.model;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Matching implements Serializable {
    private String matchingimage; // 이미지
    private String tennisAreaView; // 테니스장 이름
    private Date dateView;         // 날짜
    private String conditionView;   // 조건

    private List<Matching> matchingList;

    public String getMatchingimage(){
        return  matchingimage;
    }

    public String getTennisAreaView(){
        return  tennisAreaView;
    }

    public String getConditionView(){
        return  conditionView;
    }
    public Date getDateView(){
        return  dateView;
    }

}
