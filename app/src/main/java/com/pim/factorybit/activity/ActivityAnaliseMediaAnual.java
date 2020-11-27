package com.pim.factorybit.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.pim.factorybit.R;

import java.util.ArrayList;

public class ActivityAnaliseMediaAnual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analise_media_anual_grafico);


        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> visitors = new ArrayList<>();

        visitors.add(new BarEntry(2014, 180));
        visitors.add(new BarEntry(2015, 70));
        visitors.add(new BarEntry(2016, 180));
        visitors.add(new BarEntry(2017, 350));
        visitors.add(new BarEntry(2018, 555));
        visitors.add(new BarEntry(2019, 4798));
        visitors.add(new BarEntry(2020, 10000));


        BarDataSet barDataSet = new BarDataSet(visitors, "Bitcoin nos ultimos 7 anos ");

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);
        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Valores em reais");
        barChart.animateY(2000);


    }

    public void TelaDeAnalise(View view) {
        Intent intent = new Intent(this, ActivityAnaliseMediaAnual.class);
        startActivity(intent);

    }
}