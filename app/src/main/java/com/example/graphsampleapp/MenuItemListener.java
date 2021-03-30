package com.example.graphsampleapp;

import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.graphsampleapp.utilities.Utility;
import com.example.graphsampleapp.views.fragments.StepsFragment;

public class MenuItemListener {
    public static boolean itemListener(MenuItem item, AppCompatActivity activity) {

        if (item.getItemId() == R.id.steps) {
            Utility.updateFragment(activity, new StepsFragment());
        }
        else if(item.getItemId() == R.id.distance){

        }
        else if(item.getItemId() == R.id.calories){

        }
        //add items here
        return false;
    }
}
