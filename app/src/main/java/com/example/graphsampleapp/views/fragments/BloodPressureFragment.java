package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graphsampleapp.R;
import com.example.graphsampleapp.databinding.FragmentBloodPressureBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

public class BloodPressureFragment extends Fragment {
    FragmentBloodPressureBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blood_pressure, container, false);
        binding = FragmentBloodPressureBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {
        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.bloodPressureChart);
        Utility.decorateGraph(binding.bloodPressureChart);
        Utility.updateGraph(binding.bloodPressureChart, dataProvider.getDailyCalories());
        Utility.updateGraph(binding.bloodPressureChart, dataProvider.getDailyBloodPressure());
        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.bloodPressureChart, dataProvider.getDailyBloodPressure()));
        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.bloodPressureChart, dataProvider.getWeeklyBloodPressure()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.bloodPressureChart, dataProvider.getMonthlyBloodPressure()));
    }
}