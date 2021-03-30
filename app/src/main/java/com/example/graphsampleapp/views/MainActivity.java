package com.example.graphsampleapp.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graphsampleapp.databinding.ActivityMainBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.repositories.DataRepository;
import com.example.graphsampleapp.utilities.Utility;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        addGraph();
    }


    private void addGraph() {

        DataProvider dataProvider = new DataProvider();

        Utility.decorateGraph(binding.stepsChart);

        Utility.updateGraph(binding.stepsChart, dataProvider.getDailySteps());

        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding.stepsChart, dataProvider.getWeeklySteps()));
        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding.stepsChart, dataProvider.getDailySteps()));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding.stepsChart, dataProvider.getMonthlySteps()));
    }
}