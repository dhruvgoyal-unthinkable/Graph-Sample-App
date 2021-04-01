package com.example.graphsampleapp.utilities;

import com.github.mikephil.charting.data.BarData;

public class Custom {
    BarData data;
    String[] labels;

    public Custom(BarData data, String[] labels) {
        this.data = data;
        this.labels = labels;
    }
}
