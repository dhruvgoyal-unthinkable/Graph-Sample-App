package com.example.graphsampleapp.views;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.graphsampleapp.MenuItemListener;
import com.example.graphsampleapp.databinding.ActivityMainBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.example.graphsampleapp.repositories.DataRepository;
import com.example.graphsampleapp.utilities.Utility;
import com.example.graphsampleapp.views.fragments.BloodPressureFragment;
import com.example.graphsampleapp.views.fragments.StepsFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Utility.updateFragment(this, new StepsFragment());

        

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return MenuItemListener.itemListener(item,this);
    }
}