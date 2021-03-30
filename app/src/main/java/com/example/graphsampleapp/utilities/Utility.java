package com.example.graphsampleapp.utilities;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;

public class Utility {
    public static void updateGraph(BarChart barChart, BarData data) {
        barChart.setData(data);
        barChart.invalidate();
    }

    public static void decorateGraph(BarChart barChart) {
        barChart.getXAxis().setEnabled(false);
        barChart.getAxisLeft().setEnabled(false);
        barChart.getAxisRight().setEnabled(false);
        barChart.setDescription(null);
        barChart.setPinchZoom(false);
        barChart.setDoubleTapToZoomEnabled(false);
    }
}
