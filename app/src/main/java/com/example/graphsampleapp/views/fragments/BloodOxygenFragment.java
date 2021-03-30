package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graphsampleapp.R;

import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

import org.jetbrains.annotations.NotNull;

import androidx.fragment.app.Fragment;

public class BloodOxygenFragment extends Fragment {
   com.example.graphsampleapp.databinding.FragmentBloodOxygenBinding binding;


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blood_oxygen, container, false);
        binding = com.example.graphsampleapp.databinding.FragmentBloodOxygenBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.boChart);
        Utility.decorateGraph(binding.boChart);
        Utility.updateGraph(binding.boChart, dataProvider.getDailyBloodOxygen());

        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.boChart, dataProvider.getWeeklyBloodOxygen()));
        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.boChart, dataProvider.getDailyBloodOxygen()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.boChart, dataProvider.getMonthlyBloodOxygen()));
    }
}
