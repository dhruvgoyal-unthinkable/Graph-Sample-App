package com.example.graphsampleapp.repositories;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.LineData;

public class DataProvider {
    DataRepository repository;

    public DataProvider() {
        this.repository = new DataRepository();
        repository.getApiResponse();
    }

    public BarData getDailySteps() {
        return repository.getDailyData("smart_daily", "step");
    }

    public BarData getWeeklySteps() {
        return repository.getWeeklyData("smart_daily", "step");
    }

    public BarData getMonthlySteps() {
        return repository.getMonthlyData("smart_daily", "step");
    }

    public BarData getDailyDistance() {
        return repository.getDailyData("smart_daily", "distance");
    }

    public BarData getWeeklyDistance() {
        return repository.getWeeklyData("smart_daily", "distance");
    }

    public BarData getMonthlyDistance() {
        return repository.getMonthlyData("smart_daily", "distance");
    }

    public BarData getDailyCalories() {
        return repository.getDailyData("smart_daily", "calories");
    }

    public BarData getWeeklyCalories() {
        return repository.getWeeklyData("smart_daily", "calories");
    }

    public BarData getMonthlyCalories() {
        return repository.getMonthlyData("smart_daily", "calories");
    }

    public BarData getDailyBloodOxygen() {
        return repository.getDailyData("smart_bp", "spo2Data");
    }

    public BarData getWeeklyBloodOxygen() {
        return repository.getWeeklyData("smart_bp", "spo2Data");
    }

    public BarData getMonthlyBloodOxygen() {
        return repository.getMonthlyData("smart_bp", "spo2Data");
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
}
