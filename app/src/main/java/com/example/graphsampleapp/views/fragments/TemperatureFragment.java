package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graphsampleapp.R;
import com.example.graphsampleapp.databinding.FragmentStepsBinding;
import com.example.graphsampleapp.databinding.FragmentTempBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

import org.jetbrains.annotations.NotNull;

import androidx.fragment.app.Fragment;

public class TemperatureFragment extends Fragment {

    FragmentTempBinding binding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temp, container, false);
        binding = FragmentTempBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateLineGraph(binding.tempChart);
        Utility.decorateLineGraph(binding.tempChart);
        Utility.updateLineGraph(binding.tempChart, dataProvider.getDailyTemperature());

        binding.weekBtn.setOnClickListener(v -> Utility.updateLineGraph(binding.tempChart, dataProvider.getWeeklyTemperature()));
        binding.dayBtn.setOnClickListener(v -> Utility.updateLineGraph(binding.tempChart, dataProvider.getDailyTemperature()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateLineGraph(binding.tempChart, dataProvider.getMonthlyTemperature()));
    }
}
