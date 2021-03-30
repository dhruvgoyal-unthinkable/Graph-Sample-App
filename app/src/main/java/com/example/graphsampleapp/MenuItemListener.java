package com.example.graphsampleapp;

import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graphsampleapp.utilities.Utility;
import com.example.graphsampleapp.views.fragments.BloodOxygenFragment;
import com.example.graphsampleapp.views.fragments.BloodPressureFragment;
import com.example.graphsampleapp.views.fragments.CaloriesFragment;
import com.example.graphsampleapp.views.fragments.DistanceFragment;
import com.example.graphsampleapp.views.fragments.StepsFragment;
import com.example.graphsampleapp.views.fragments.TemperatureFragment;

public class MenuItemListener {
    public static boolean itemListener(MenuItem item, AppCompatActivity activity) {

        if (item.getItemId() == R.id.steps) {
            Utility.updateFragment(activity, new StepsFragment());
        } else if (item.getItemId() == R.id.distance) {
            Utility.updateFragment(activity, new DistanceFragment());
        } else if (item.getItemId() == R.id.calories) {
            Utility.updateFragment(activity, new CaloriesFragment());
        }
        else if(item.getItemId() == R.id.bo){
            Utility.updateFragment(activity, new BloodOxygenFragment());
        }
        else if(item.getItemId() == R.id.temp){
            Utility.updateFragment(activity, new TemperatureFragment());
        }
        else if(item.getItemId() == R.id.bloodPressure){
            Utility.updateFragment(activity,new BloodPressureFragment());
        }
        //add items here
        return false;
    }
}
