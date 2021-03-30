package com.example.graphsampleapp.views.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.graphsampleapp.R;
import com.example.graphsampleapp.databinding.FragmentDistanceBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.utilities.Utility;

public class DistanceFragment extends Fragment {

    FragmentDistanceBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_distance, container, false);
        binding = FragmentDistanceBinding.bind(view);
        addGraph();
        return view;
    }

    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.distanceChart);
        Utility.decorateGraph(binding.distanceChart);
        Utility.updateGraph(binding.distanceChart, dataProvider.getDailyDistance());

        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.distanceChart, dataProvider.getDailyDistance()));
        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.distanceChart, dataProvider.getWeeklyDistance()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.distanceChart, dataProvider.getMonthlyDistance()));
    }
}