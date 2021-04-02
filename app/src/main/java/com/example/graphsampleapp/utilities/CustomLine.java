package com.example.graphsampleapp.utilities;

import com.github.mikephil.charting.data.LineData;

public class CustomLine {
    LineData data;
    String[] labels;

    public CustomLine(LineData data, String[] labels) {
        this.data = data;
        this.labels = labels;
    }
}
