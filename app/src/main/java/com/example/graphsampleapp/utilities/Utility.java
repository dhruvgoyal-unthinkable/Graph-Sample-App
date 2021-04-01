package com.example.graphsampleapp.utilities;

import android.graphics.Color;
import android.util.Log;

import com.example.graphsampleapp.databinding.ActivityMainBinding;
import com.example.graphsampleapp.repositories.DataProvider;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;

public class Utility {
    public static void updateGraph(ActivityMainBinding binding, String type) {
        DataProvider provider = new DataProvider();

        switch (type) {
            case TYPE.DAY: {
                binding.dayBtn.setBackgroundColor(Color.parseColor("#1EB4FD"));
                binding.weekBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                binding.monthBtn.setBackgroundColor(Color.parseColor("#FFA93C"));

                Custom custom = provider.getDailySteps();
                BarData data = custom.data;
                updateGraph(binding.stepsChart, data);
                updateLabels(binding.stepsChart, data.getEntryCount(), custom.labels);

                custom = provider.getDailyDistance();
                data = custom.data;
                updateGraph(binding.distanceChart, data);
                updateLabels(binding.distanceChart, data.getEntryCount(), custom.labels);

                custom = provider.getDailyCalories();
                data = custom.data;
                updateGraph(binding.caloriesChart, data);
                updateLabels(binding.caloriesChart, data.getEntryCount(), custom.labels);

                custom = provider.getDailyBloodPressure();
                data = custom.data;
                updateGraph(binding.bloodPressureChart, data);
                updateLabels(binding.bloodPressureChart, data.getEntryCount(), custom.labels);


                custom = provider.getDailyBloodOxygen();
                data = custom.data;
                updateGraph(binding.bloodOxygenChart, data);
                updateLabels(binding.bloodOxygenChart, data.getEntryCount(), custom.labels);


                updateLineGraph(binding.tempChart, provider.getDailyTemperature());
                updateLineGraph(binding.heartRateChart, provider.getDailyHearRate());
                break;
            }
            case TYPE.WEEK: {
                binding.dayBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                binding.weekBtn.setBackgroundColor(Color.parseColor("#1EB4FD"));
                binding.monthBtn.setBackgroundColor(Color.parseColor("#FFA93C"));
                BarData data = provider.getWeeklySteps();
                updateGraph(binding.stepsChart, data);
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

                Custom custom = provider.getMonthlySteps();
                BarData data = custom.data;
                updateGraph(binding.stepsChart, data);
                updateLabels(binding.stepsChart, data.getEntryCount(), custom.labels);

                custom = provider.getMonthlyDistance();
                data = custom.data;
                updateGraph(binding.distanceChart, data);
                updateLabels(binding.distanceChart, data.getEntryCount(), custom.labels);

                custom = provider.getMonthlyCalories();
                data = custom.data;
                updateGraph(binding.caloriesChart, data);
                updateLabels(binding.caloriesChart, data.getEntryCount(), custom.labels);

                custom = provider.getDailyBloodPressure();
                data = custom.data;
                updateGraph(binding.bloodPressureChart, data);
                updateLabels(binding.bloodPressureChart, data.getEntryCount(), custom.labels);

                custom = provider.getMonthlyBloodOxygen();
                data = custom.data;
                updateGraph(binding.bloodOxygenChart, data);
                updateLabels(binding.bloodOxygenChart, data.getEntryCount(), custom.labels);

                updateLineGraph(binding.tempChart, provider.getMonthlyTemperature());
                updateLineGraph(binding.heartRateChart, provider.getMonthlyHearRate());
                break;
            }
        }
    }

    private static void updateGraph(BarChart barChart, BarData data) {
        barChart.setData(data);
        barChart.invalidate();
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
        barChart.getXAxis().setDrawAxisLine(false);
        barChart.getXAxis().setEnabled(true);
        barChart.getXAxis().setDrawGridLines(false);
        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);
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

    private static void updateLabels(BarChart chart, int count, String[] labels) {
        chart.getXAxis().setLabelCount(count);
        IndexAxisValueFormatter formatter = new IndexAxisValueFormatter();
        formatter.setValues(labels);
        chart.getXAxis().setValueFormatter(formatter);
    }
}
