package com.example.graphsampleapp.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graphsampleapp.databinding.ActivityMainBinding;
import com.example.graphsampleapp.utilities.TYPE;
import com.example.graphsampleapp.utilities.Utility;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Utility.decorateGraph(binding);
        Utility.updateGraph(binding, TYPE.DAY);

        binding.dayBtn.setOnClickListener(v -> Utility.updateGraph(binding, TYPE.DAY));
        binding.weekBtn.setOnClickListener(v -> Utility.updateGraph(binding, TYPE.WEEK));
        binding.monthBtn.setOnClickListener(v -> Utility.updateGraph(binding, TYPE.MONTH));
    }
}