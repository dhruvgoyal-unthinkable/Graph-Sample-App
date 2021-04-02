package com.example.graphsampleapp.repositories;

import com.example.graphsampleapp.utilities.Custom;
import com.example.graphsampleapp.utilities.CustomLine;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class DataRepository {

    private JSONObject details;

    public void getApiResponse() {
        //code to hit api and update details
        String testObj = "{\n" +
                "  \"smart_daily\": [\n" +
                "    {\n" +
                "      \"date\": \"2021.03.25\",\n" +
                "      \"goal\": \"4\",\n" +
                "      \"distance\": \"0.24\",\n" +
                "      \"step\": \"440\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"9.33\",\n" +
                "      \"exerciseMinutes\": \"168\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24\",\n" +
                "      \"goal\": \"3\",\n" +
                "      \"distance\": \"0.22\",\n" +
                "      \"step\": \"386\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"7.79\",\n" +
                "      \"exerciseMinutes\": \"155\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.23\",\n" +
                "      \"goal\": \"0\",\n" +
                "      \"distance\": \"0.00\",\n" +
                "      \"step\": \"0\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"0.00\",\n" +
                "      \"exerciseMinutes\": \"0\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.22\",\n" +
                "      \"goal\": \"0\",\n" +
                "      \"distance\": \"0.00\",\n" +
                "      \"step\": \"13\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"0.30\",\n" +
                "      \"exerciseMinutes\": \"2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.21\",\n" +
                "      \"goal\": \"0\",\n" +
                "      \"distance\": \"0.00\",\n" +
                "      \"step\": \"17\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"0.38\",\n" +
                "      \"exerciseMinutes\": \"8\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.20\",\n" +
                "      \"goal\": \"7\",\n" +
                "      \"distance\": \"0.46\",\n" +
                "      \"step\": \"718\",\n" +
                "      \"ExerciseTime\": \"1\",\n" +
                "      \"calories\": \"16.42\",\n" +
                "      \"exerciseMinutes\": \"392\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.19\",\n" +
                "      \"goal\": \"7\",\n" +
                "      \"distance\": \"0.49\",\n" +
                "      \"step\": \"772\",\n" +
                "      \"ExerciseTime\": \"2\",\n" +
                "      \"calories\": \"17.22\",\n" +
                "      \"exerciseMinutes\": \"391\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.18\",\n" +
                "      \"goal\": \"3\",\n" +
                "      \"distance\": \"0.18\",\n" +
                "      \"step\": \"335\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"7.12\",\n" +
                "      \"exerciseMinutes\": \"134\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.17\",\n" +
                "      \"goal\": \"0\",\n" +
                "      \"distance\": \"0.00\",\n" +
                "      \"step\": \"0\",\n" +
                "      \"ExerciseTime\": \"0\",\n" +
                "      \"calories\": \"0.00\",\n" +
                "      \"exerciseMinutes\": \"0\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"smart_hrv\": [\n" +
                "    {\n" +
                "      \"date\": \"2021.03.18 14:52:14\",\n" +
                "      \"highBP\": \"122\",\n" +
                "      \"stress\": \"63\",\n" +
                "      \"lowBP\": \"66\",\n" +
                "      \"heartRate\": \"104\",\n" +
                "      \"hrv\": \"32\",\n" +
                "      \"vascularAging\": \"0\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"smart_bp\": [\n" +
                "    {\n" +
                "      \"date\": \"2021.03.18 14:49:54\",\n" +
                "      \"spo2Data\": \"99\",\n" +
                "      \"Automatic\": \"96\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"smart_temp\": [\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 18:56:10\",\n" +
                "      \"temperature\": \"36.1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 18:55:50\",\n" +
                "      \"temperature\": \"36.2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 18:55:16\",\n" +
                "      \"temperature\": \"36.1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 18:18:25\",\n" +
                "      \"temperature\": \"36.2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 18:16:08\",\n" +
                "      \"temperature\": \"36.1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 18:01:00\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:59:40\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:57:07\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:54:30\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:54:12\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:51:11\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:51:03\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:49:59\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:48:51\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:47:48\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:45:54\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:44:19\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:43:56\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:42:55\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:41:35\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:40:17\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2021.03.24 17:39:38\",\n" +
                "      \"temperature\": \"36.3\"\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
        try {
            details = new JSONObject(testObj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public Custom getDailyData(String category, String[] data, int[] thisColors) {
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        String[] labels = new String[0];
        try {
            JSONArray dailyDetails = (JSONArray) details.get(category);
            labels = new String[dailyDetails.length()];
            SimpleDateFormat currentDate = new SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH);
            if (data[0].equalsIgnoreCase("distance")) {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    float[] values = new float[data.length];
                    for (int j = 0; j < data.length; j++) {
                        values[j] = 0.621f * Float.parseFloat(detail.getString(data[j]));
                    }

                    Date date = currentDate.parse(detail.getString("date"));
                    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                    labels[i] = dayOfWeek.substring(0, 3);
                    barEntries.add(new BarEntry(dailyDetails.length() - 1 - i, values, ""));
                }
            } else {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    float[] values = new float[data.length];
                    for (int j = 0; j < data.length; j++) {
                        values[j] = Float.parseFloat(detail.getString(data[j]));
                    }
                    Date date = currentDate.parse(detail.getString("date"));
                    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                    labels[i] = dayOfWeek.substring(0, 3);
                    barEntries.add(new BarEntry(dailyDetails.length() - 1 - i, values));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String labelValue = getCategoryLabel(category, data[0]);
        BarDataSet dataSet = new BarDataSet(barEntries, labelValue);
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return String.format(Locale.ENGLISH, "%.1f", value);
            }
        });
        dataSet.setColors(thisColors);
        dataSet.setStackLabels(data);
        return new Custom(new BarData(dataSet), labels);
    }

    public BarData getWeeklyData(String category, String[] data, int[] thisColors) {
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH);
        Date todayDate = new Date();
        String thisDate = currentDate.format(todayDate);

        try {
            int pos = 52; ///1 year = 52 week
            JSONArray dailyDetails = (JSONArray) details.get(category);
            float[] values = new float[data.length];
            Arrays.fill(values, 0.0f);
            for (int i = 0; i < dailyDetails.length(); i++) {
                JSONObject detail = (JSONObject) dailyDetails.get(i);
                if (thisDate.compareTo(detail.getString("date")) < 6) {
                    if (data[0].equalsIgnoreCase("distance")) {
                        for (int j = 0; j < data.length; j++) {
                            values[j] += 0.621f * Float.parseFloat(detail.getString(data[j])) / 7;
                        }
                    } else {
                        for (int j = 0; j < data.length; j++) {
                            values[j] += Float.parseFloat(detail.getString(data[j])) / 7;
                        }
                    }

                } else {
                    barEntries.add(new BarEntry(pos--, values));
                    thisDate = detail.getString("date");
                    if (data[0].equalsIgnoreCase("distance")) {
                        for (int j = 0; j < data.length; j++) {
                            values[j] = 0.621f * Float.parseFloat(detail.getString(data[j])) / 7;
                        }
                    } else {
                        for (int j = 0; j < data.length; j++) {
                            values[j] = Float.parseFloat(detail.getString(data[j])) / 7;
                        }
                    }

                }
            }
            barEntries.add(new BarEntry(pos, values));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String labelValue = getCategoryLabel(category, data[0]);
        BarDataSet dataSet = new BarDataSet(barEntries, labelValue);
        dataSet.setColors(thisColors);
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return String.format(Locale.ENGLISH, "%.1f", value);
            }
        });
        dataSet.setStackLabels(data);
        return new BarData(dataSet);
    }


    public Custom getMonthlyData(String category, String[] data, int[] thisColors) {
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        String[] labels = new String[0];
        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH);
        Date todayDate = new Date();

        String thisMonth = currentDate.format(todayDate).split("\\.")[1];
        try {
            float[] values = new float[data.length];
            Arrays.fill(values, 0.0f);
            int pos = 12; ///1 year = 12 months
            JSONArray dailyDetails = (JSONArray) details.get(category);
            labels = new String[dailyDetails.length()];
            for (int i = 0; i < dailyDetails.length(); i++) {
                JSONObject detail = (JSONObject) dailyDetails.get(i);
                if (thisMonth.equals(detail.getString("date").split("\\.")[1])) {
                    if (data[0].equalsIgnoreCase("distance")) {
                        for (int j = 0; j < data.length; j++) {
                            values[j] += 0.621f * Float.parseFloat(detail.getString(data[j])) / 30;
                        }


                    } else {
                        for (int j = 0; j < data.length; j++) {
                            values[j] += Float.parseFloat(detail.getString(data[j])) / 30;
                        }
                    }
                } else {
                    barEntries.add(new BarEntry(pos--, values));
                    thisMonth = detail.getString("date").split("\\.")[1];
                    if (data[0].equalsIgnoreCase("distance")) {
                        for (int j = 0; j < data.length; j++) {
                            values[j] = 0.621f * Float.parseFloat(detail.getString(data[j])) / 7;
                        }
                    } else {
                        for (int j = 0; j < data.length; j++) {
                            values[j] = Float.parseFloat(detail.getString(data[j])) / 7;
                        }
                    }

                    Date date = currentDate.parse(detail.getString("date"));
                    String month = new SimpleDateFormat("MMMM", Locale.ENGLISH).format(date);
                    labels[i] = month.substring(0, 3);
                }

            }
            barEntries.add(new BarEntry(pos, values));
        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }
        String labelValue = getCategoryLabel(category, data[0]);
        BarDataSet dataSet = new BarDataSet(barEntries, labelValue);
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return String.format(Locale.ENGLISH, "%.1f", value);
            }
        });
        dataSet.setStackLabels(data);
        dataSet.setColors(thisColors);
        return new Custom(new BarData(dataSet), labels);
    }

    public CustomLine getDailyLineGraphData(String category, String data, int thisColor) {
        ArrayList<Entry> lineEntries = new ArrayList<>();
        String[] labels = new String[0];
        try {
            JSONArray dailyDetails = (JSONArray) details.get(category);
            labels = new String[dailyDetails.length()];
            SimpleDateFormat currentDate = new SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH);
            if (data.equalsIgnoreCase("temperature")) {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    float celsius = Float.parseFloat(detail.getString(data));
                    float farenheit = ((celsius * 9) / 5) + 32;
                    lineEntries.add(new Entry(i, farenheit));
                    Date date = currentDate.parse(detail.getString("date"));
                    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                    labels[i] = dayOfWeek.substring(0, 3);
                }
            } else {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    lineEntries.add(new Entry(i, Float.parseFloat(detail.getString(data))));
                    Date date = currentDate.parse(detail.getString("date"));
                    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                    labels[i] = dayOfWeek.substring(0, 3);
                }
            }
        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }
        String labelValue = getCategoryLabel(category, data);
        LineDataSet dataSet = new LineDataSet(lineEntries, labelValue);
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return String.format(Locale.ENGLISH, "%.1f", value);
            }
        });
        dataSet.setColor(thisColor);
        return new CustomLine(new LineData(dataSet), labels);
    }

    public LineData getWeeklyLineGraphData(String category, String data, int thisColor) {
        ArrayList<Entry> lineEntries = new ArrayList<>();
        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH);
        Date todayDate = new Date();
        String thisDate = currentDate.format(todayDate);
        try {
            float total = 0;
            int pos = 52; ///1 year = 52 week
            JSONArray dailyDetails = (JSONArray) details.get(category);
            if (data.equalsIgnoreCase("temperature")) {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    if (thisDate.compareTo(detail.getString("date")) < 6) {
                        float celsius = Float.parseFloat(detail.getString(data));
                        total += ((celsius * 9) / 5) + 32;
                    } else {
                        lineEntries.add(new Entry(pos--, (float) (total / 7)));
                        thisDate = detail.getString("date");
                        float celsius = Float.parseFloat(detail.getString(data));
                        total = ((celsius * 9) / 5) + 32;
                    }
                }
            } else {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    if (thisDate.compareTo(detail.getString("date")) < 6)
                        total += Float.parseFloat(detail.getString(data));
                    else {
                        lineEntries.add(new Entry(pos--, (float) (total / 7)));
                        thisDate = detail.getString("date");
                        total = Float.parseFloat(detail.getString(data));
                    }
                }
            }

            lineEntries.add(new Entry(pos, (float) (total / 7)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String labelValue = getCategoryLabel(category, data);
        LineDataSet dataSet = new LineDataSet(lineEntries, labelValue);
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return String.format(Locale.ENGLISH, "%.1f", value);
            }
        });
        dataSet.setColor(thisColor);
        return new LineData(dataSet);
    }

    public LineData getMonthlyLineGraphData(String category, String data, int thisColor) {
        ArrayList<Entry> lineEntries = new ArrayList<Entry>();
        SimpleDateFormat currentDate = new SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH);
        Date todayDate = new Date();
        String thisMonth = currentDate.format(todayDate).split("\\.")[1];
        try {
            float total = 0;
            int pos = 12; ///1 year = 12 months
            JSONArray dailyDetails = (JSONArray) details.get(category);
            if (data.equalsIgnoreCase("temperature")) {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    if (thisMonth.equals(detail.getString("date").split("\\.")[1])) {
                        float celsius = Float.parseFloat(detail.getString(data));
                        total += ((celsius * 9) / 5) + 32;
                    } else {
                        lineEntries.add(new Entry(pos--, (float) (total / 30)));
                        thisMonth = detail.getString("date").split("\\.")[1];
                        float celsius = Float.parseFloat(detail.getString(data));
                        total = ((celsius * 9) / 5) + 32;
                    }
                }
            } else {
                for (int i = 0; i < dailyDetails.length(); i++) {
                    JSONObject detail = (JSONObject) dailyDetails.get(i);
                    if (thisMonth.equals(detail.getString("date").split("\\.")[1]))
                        total += Float.parseFloat(detail.getString(data));
                    else {
                        lineEntries.add(new Entry(pos--, (float) (total / 30)));
                        thisMonth = detail.getString("date").split("\\.")[1];
                        total = Float.parseFloat(detail.getString(data));
                    }
                }
            }

            lineEntries.add(new Entry(pos, (float) (total / 7)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String labelValue = getCategoryLabel(category, data);
        LineDataSet dataSet = new LineDataSet(lineEntries, labelValue);
        dataSet.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return String.format(Locale.ENGLISH, "%.1f", value);
            }
        });
        dataSet.setColor(thisColor);
        return new LineData(dataSet);
    }

    public String getCategoryLabel(String category, String data) {
        String label = "";
        if (category != null) {
            if (category.equalsIgnoreCase("smart_daily")) {
                if (data.equalsIgnoreCase("distance")) {
                    label = "Distance in Miles";
                } else if (data.equalsIgnoreCase("calories")) {
                    label = "Calories in Kcal";
                } else {
                    label = "Steps";
                }
            } else if (category.equalsIgnoreCase("smart_bp")) {
                label = "Blood Oxygen in %";

            } else if (category.equalsIgnoreCase("smart_temp")) {
                label = "Temperature in Farenheit";

            } else if (category.equalsIgnoreCase("smart_hrv")) {
                if (data.equalsIgnoreCase("highBP") || data.equalsIgnoreCase("lowBP")) {
                    label = "in mmhg";
                }
                if (data.equalsIgnoreCase("heartRate")) {
                    label = "Heart Rate in Bpm";
                }
            }
        }
        return label;
    }
}
