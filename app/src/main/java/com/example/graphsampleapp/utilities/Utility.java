package com.example.graphsampleapp.utilities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.graphsampleapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.LineData;

public class Utility {
    public static void updateGraph(BarChart barChart, BarData data) {
        barChart.setData(data);
        barChart.invalidate();
    }

    public static void updateLineGraph(LineChart lineChart, LineData data) {
        lineChart.setData(data);
        lineChart.invalidate();
    }

    public static void decorateGraph(BarChart barChart) {
        barChart.getXAxis().setEnabled(false);
        barChart.getAxisLeft().setEnabled(false);
        barChart.getAxisRight().setEnabled(false);
        barChart.setDescription(null);
        barChart.setPinchZoom(false);
        barChart.setDoubleTapToZoomEnabled(false);
    }

    public static void decorateLineGraph(LineChart lineChart) {
        lineChart.getXAxis().setEnabled(false);
        lineChart.getAxisLeft().setEnabled(false);
        lineChart.getAxisRight().setEnabled(false);
        lineChart.setDescription(null);
        lineChart.setPinchZoom(false);
        lineChart.setDoubleTapToZoomEnabled(false);
    }

    public static void updateFragment(AppCompatActivity activity, Fragment fragment) {
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();
    }
}
