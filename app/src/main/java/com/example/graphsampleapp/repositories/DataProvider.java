package com.example.graphsampleapp.repositories;

import android.graphics.Color;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.LineData;

public class DataProvider {
    DataRepository repository;
   private final int[] colors = new int[]{Color.parseColor("#FEF2B5"),
            Color.parseColor("#FFC499"),
            Color.parseColor("#FFCACA"),
            Color.parseColor("#BCF5DD"),
            Color.parseColor("#C4CAFF"),
            Color.parseColor("#B5BCFF")};

    public DataProvider() {
        this.repository = new DataRepository();
        repository.getApiResponse();
    }

    public BarData getDailySteps() {
        return repository.getDailyData("smart_daily", new String[]{"step"},new int[]{colors[0]});
    }

    public BarData getWeeklySteps() {
        return repository.getWeeklyData("smart_daily", new String[]{"step"},new int[]{colors[0]});
    }

    public BarData getMonthlySteps() {
        return repository.getMonthlyData("smart_daily", new String[]{"step"},new int[]{colors[0]});
    }

    public BarData getDailyDistance() {
        return repository.getDailyData("smart_daily", new String[]{"distance"},new int[]{colors[1]});
    }

    public BarData getWeeklyDistance() {
        return repository.getWeeklyData("smart_daily", new String[]{"distance"},new int[]{colors[1]});
    }

    public BarData getMonthlyDistance() {
        return repository.getMonthlyData("smart_daily", new String[]{"distance"},new int[]{colors[1]});
    }

    public BarData getDailyCalories() {
        return repository.getDailyData("smart_daily", new String[]{"calories"},new int[]{colors[2]});
    }

    public BarData getWeeklyCalories() {
        return repository.getWeeklyData("smart_daily", new String[]{"calories"},new int[]{colors[2]});
    }

    public BarData getMonthlyCalories() {
        return repository.getMonthlyData("smart_daily", new String[]{"calories"},new int[]{colors[2]});
    }

    public BarData getDailyBloodOxygen() {
        return repository.getDailyData("smart_bp", new String[]{"spo2Data"},new int[]{colors[3]});
    }

    public BarData getWeeklyBloodOxygen() {
        return repository.getWeeklyData("smart_bp", new String[]{"spo2Data"},new int[]{colors[3]});
    }

    public BarData getMonthlyBloodOxygen() {
        return repository.getMonthlyData("smart_bp", new String[]{"spo2Data"},new int[]{colors[3]});
    }

    public LineData getDailyTemperature() {
        return repository.getDailyLineGraphData("smart_temp", "temperature",colors[4]);
    }

    public LineData getWeeklyTemperature() {
        return repository.getWeeklyLineGraphData("smart_temp", "temperature",colors[4]);
    }

    public LineData getMonthlyTemperature() {
        return repository.getMonthlyLineGraphData("smart_temp", "temperature",colors[4]);
    }

    public BarData getDailyBloodPressure() {
        return repository.getDailyData("smart_hrv", new String[]{"highBP", "lowBP"},new int[]{colors[5],colors[0]});
    }

    public BarData getWeeklyBloodPressure() {
        return repository.getWeeklyData("smart_hrv", new String[]{"highBP", "lowBP"},new int[]{colors[5],colors[0]});
    }

    public BarData getMonthlyBloodPressure() {
        return repository.getMonthlyData("smart_hrv", new String[]{"highBP", "lowBP"},new int[]{colors[5],colors[0]});
    }

    public LineData getDailyHearRate() {
        return repository.getDailyLineGraphData("smart_hrv", "heartRate",colors[0]);
    }

    public LineData getWeeklyHearRate() {
        return repository.getWeeklyLineGraphData("smart_hrv", "heartRate",colors[0]);
    }

    public LineData getMonthlyHearRate() {
        return repository.getMonthlyLineGraphData("smart_hrv", "heartRate",colors[0]);
    }
}

