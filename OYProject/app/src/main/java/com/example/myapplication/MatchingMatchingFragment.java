package com.example.myapplication;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.example.myapplication.databinding.FragmentMatchingMatchingBinding;

import java.util.Calendar;


public class MatchingMatchingFragment extends Fragment {

    FragmentMatchingMatchingBinding binding;

    public MatchingMatchingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMatchingMatchingBinding.inflate(inflater,container,false);

        binding.matchingSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(getContext(), R.style.DatePickerStyle);
                dialog.setContentView(R.layout.fragment_matching_datepicker);
                dialog.show();
//                Calendar calendar =  Calendar.getInstance();
//                int nYear = calendar.get(Calendar.YEAR);
//                int nMon = calendar.get(Calendar.MONTH);
//                int nDay = calendar.get(Calendar.DAY_OF_MONTH);
//
//                DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
//                        String strDate = String.valueOf(year) + "년";
//                        strDate += String.valueOf(monthOfYear+1 ) + "월";
//                        strDate += String.valueOf(dayOfMonth) + "일";
//                    }
//                };
//                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), R.style.DatePickerStyle, onDateSetListener, nYear, nMon, nDay);
//                datePickerDialog.show();
            }
        });

        return binding.getRoot();
    }


}