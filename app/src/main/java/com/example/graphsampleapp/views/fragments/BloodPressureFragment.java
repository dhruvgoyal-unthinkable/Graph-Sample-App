package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graphsampleapp.R;
import com.example.graphsampleapp.databinding.FragmentBpBinding;
import com.example.graphsampleapp.databinding.FragmentStepsBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

import org.jetbrains.annotations.NotNull;

import androidx.fragment.app.Fragment;

public class BloodPressureFragment extends Fragment {
    FragmentBpBinding binding;


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bp, container, false);
        binding = FragmentBpBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.bpChart);
        Utility.decorateGraph(binding.bpChart);
        Utility.updateGraph(binding.bpChart, dataProvider.getDailyBloodPressure());

        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.bpChart, dataProvider.getWeeklyBloodPressure()));
        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.bpChart, dataProvider.getDailyBloodPressure()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.bpChart, dataProvider.getMonthlyBloodPressure()));
    }
}
