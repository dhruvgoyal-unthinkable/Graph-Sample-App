package com.example.graphsampleapp;

import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graphsampleapp.utilities.Utility;
<<<<<<< HEAD
import com.example.graphsampleapp.views.fragments.CaloriesFragment;
import com.example.graphsampleapp.views.fragments.DistanceFragment;
=======
import com.example.graphsampleapp.views.fragments.BloodPressureFragment;
>>>>>>> 355cbe25acedb8ede1cfe060bdd3afd4d595cd47
import com.example.graphsampleapp.views.fragments.StepsFragment;

public class MenuItemListener {
    public static boolean itemListener(MenuItem item, AppCompatActivity activity) {

        if (item.getItemId() == R.id.steps) {
            Utility.updateFragment(activity, new StepsFragment());
        } else if (item.getItemId() == R.id.distance) {
            Utility.updateFragment(activity, new DistanceFragment());
        } else if (item.getItemId() == R.id.calories) {
            Utility.updateFragment(activity, new CaloriesFragment());
        }
        else if(item.getItemId() == R.id.bp){
            Utility.updateFragment(activity, new BloodPressureFragment());
        }
        //add items here
        return false;
    }
}
