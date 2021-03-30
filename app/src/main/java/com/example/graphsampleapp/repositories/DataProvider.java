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
}
