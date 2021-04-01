package com.example.graphsampleapp.utilities;

import android.graphics.Color;

import com.example.graphsampleapp.databinding.ActivityMainBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.LineData;

public class Utility {
    public static void updateGraph(ActivityMainBinding binding, String type) {
        DataProvider provider = new DataProvider();

        switch (type) {
            case TYPE.DAY: {
                binding.dayBtn.setBackgroundColor(Color.parseColor("#1EB4FD"));
                binding.weekBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                binding.monthBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                updateGraph(binding.stepsChart, provider.getDailySteps());
                updateGraph(binding.distanceChart, provider.getDailyDistance());
                updateGraph(binding.caloriesChart, provider.getDailyCalories());
                updateGraph(binding.bloodPressureChart, provider.getDailyBloodPressure());
                updateGraph(binding.bloodOxygenChart, provider.getDailyBloodOxygen());
                updateLineGraph(binding.tempChart, provider.getDailyTemperature());
                updateLineGraph(binding.heartRateChart, provider.getDailyHearRate());
                break;
            }
            case TYPE.WEEK: {
                binding.dayBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                binding.weekBtn.setBackgroundColor(Color.parseColor("#1EB4FD"));
                binding.monthBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                updateGraph(binding.stepsChart, provider.getWeeklySteps());
                updateGraph(binding.distanceChart, provider.getWeeklyDistance());
                updateGraph(binding.caloriesChart, provider.getWeeklyCalories());
                updateGraph(binding.bloodPressureChart, provider.getWeeklyBloodPressure());
                updateGraph(binding.bloodOxygenChart, provider.getWeeklyBloodOxygen());
                updateLineGraph(binding.tempChart, provider.getWeeklyTemperature());
                updateLineGraph(binding.heartRateChart, provider.getWeeklyHearRate());
                break;
            }
            case TYPE.MONTH: {
                binding.dayBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                binding.weekBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                binding.monthBtn.setBackgroundColor(Color.parseColor("#1EB4FD"));
                updateGraph(binding.stepsChart, provider.getMonthlySteps());
                updateGraph(binding.distanceChart, provider.getMonthlyDistance());
                updateGraph(binding.caloriesChart, provider.getMonthlyCalories());
                updateGraph(binding.bloodPressureChart, provider.getMonthlyBloodPressure());
                updateGraph(binding.bloodOxygenChart, provider.getMonthlyBloodOxygen());
                updateLineGraph(binding.tempChart, provider.getMonthlyTemperature());
                updateLineGraph(binding.heartRateChart, provider.getMonthlyHearRate());
                break;
            }
        }
    }

    private static void updateGraph(BarChart barChart, BarData data) {
        barChart.setData(data);
        barChart.invalidate();
        data.setHighlightEnabled(false);
    }

    private static void updateLineGraph(LineChart lineChart, LineData data) {
        lineChart.setData(data);
        lineChart.invalidate();
        data.setHighlightEnabled(false);
    }

    public static void decorateGraph(ActivityMainBinding binding) {
        decorateGraph(binding.stepsChart);
        decorateGraph(binding.distanceChart);
        decorateGraph(binding.caloriesChart);
        decorateGraph(binding.bloodPressureChart);
        decorateGraph(binding.bloodOxygenChart);
        decorateLineGraph(binding.tempChart);
        decorateLineGraph(binding.heartRateChart);
    }

    private static void decorateGraph(BarChart barChart) {
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
}
