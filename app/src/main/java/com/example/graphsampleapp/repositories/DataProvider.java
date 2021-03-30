package com.example.graphsampleapp.repositories;

import com.github.mikephil.charting.data.BarData;

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

    public BarData getDailyBloodPressure() {
        return repository.getDailyData("smart_bp", "spo2Data");
    }

    public BarData getWeeklyBloodPressure() {
        return repository.getWeeklyData("smart_bp", "spo2Data");
    }

    public BarData getMonthlyBloodPressure() {
        return repository.getMonthlyData("smart_bp", "spo2Data");
    }
}
