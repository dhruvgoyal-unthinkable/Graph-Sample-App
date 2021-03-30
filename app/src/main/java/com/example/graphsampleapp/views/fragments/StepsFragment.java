package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.graphsampleapp.R;
import com.example.graphsampleapp.databinding.FragmentStepsBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

import org.jetbrains.annotations.NotNull;

public class StepsFragment extends Fragment {

    FragmentStepsBinding binding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_steps, container, false);
        binding = FragmentStepsBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.stepsChart);
        Utility.decorateGraph(binding.stepsChart);
        Utility.updateGraph(binding.stepsChart, dataProvider.getDailySteps());

        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.stepsChart, dataProvider.getWeeklySteps()));
        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.stepsChart, dataProvider.getDailySteps()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.stepsChart, dataProvider.getMonthlySteps()));
    }
}