package com.example.graphsampleapp.repositories;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    DataRepository repository;

    public DataProvider() {
        this.repository = new DataRepository();
        repository.getApiResponse();
    }

    public BarData getDailySteps() {
        return repository.getDailyData("smart_daily", new String[]{"step"});
    }

    public BarData getWeeklySteps() {
        return repository.getWeeklyData("smart_daily", new String[]{"step"});
    }

    public BarData getMonthlySteps() {
        return repository.getMonthlyData("smart_daily", new String[]{"step"});
    }

    public BarData getDailyDistance() {
        return repository.getDailyData("smart_daily", new String[]{"distance"});
    }

    public BarData getWeeklyDistance() {
        return repository.getWeeklyData("smart_daily", new String[]{"distance"});
    }

    public BarData getMonthlyDistance() {
        return repository.getMonthlyData("smart_daily", new String[]{"distance"});
    }

    public BarData getDailyCalories() {
        return repository.getDailyData("smart_daily", new String[]{"calories"});
    }

    public BarData getWeeklyCalories() {
        return repository.getWeeklyData("smart_daily", new String[]{"calories"});
    }

    public BarData getMonthlyCalories() {
        return repository.getMonthlyData("smart_daily", new String[]{"calories"});
    }

    public BarData getDailyBloodOxygen() {
        return repository.getDailyData("smart_bp", new String[]{"spo2Data"});
    }

    public BarData getWeeklyBloodOxygen() {
        return repository.getWeeklyData("smart_bp", new String[]{"spo2Data"});
    }

    public BarData getMonthlyBloodOxygen() {
        return repository.getMonthlyData("smart_bp", new String[]{"spo2Data"});
    }

    public LineData getDailyTemperature() {
        return repository.getDailyLineGraphData("smart_temp", "temperature");
    }

    public LineData getWeeklyTemperature() {
        return repository.getWeeklyLineGraphData("smart_temp", "temperature");
    }

    public LineData getMonthlyTemperature() {
        return repository.getMonthlyLineGraphData("smart_temp", "temperature");
    }

    public BarData getDailyBloodPressure() {
        return repository.getDailyData("smart_hrv", new String[]{"highBP", "lowBP"});
    }

    public BarData getWeeklyBloodPressure() {
        return repository.getWeeklyData("smart_hrv", new String[]{"highBP", "lowBP"});
    }

    public BarData getMonthlyBloodPressure() {
        return repository.getMonthlyData("smart_hrv", new String[]{"highBP", "lowBP"});
    }

    public LineData getDailyHearRate() {
        return repository.getDailyLineGraphData("smart_hrv", "heartRate");
    }

    public LineData getWeeklyHearRate() {
        return repository.getWeeklyLineGraphData("smart_hrv", "heartRate");
    }

    public LineData getMonthlyHearRate() {
        return repository.getMonthlyLineGraphData("smart_hrv", "heartRate");
    }
}

