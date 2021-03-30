package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graphsampleapp.R;
import com.example.graphsampleapp.databinding.FragmentCaloriesBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

public class CaloriesFragment extends Fragment {

    FragmentCaloriesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calories, container, false);
        binding = FragmentCaloriesBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.caloriesChart);
        Utility.decorateGraph(binding.caloriesChart);
        Utility.updateGraph(binding.caloriesChart, dataProvider.getDailyCalories());

        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.caloriesChart, dataProvider.getDailyCalories()));
        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.caloriesChart, dataProvider.getWeeklyCalories()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.caloriesChart, dataProvider.getMonthlyCalories()));
    }
}