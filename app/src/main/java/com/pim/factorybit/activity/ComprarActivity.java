package com.pim.factorybit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pim.factorybit.R;

public class ComprarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar);
    }

    public void telaDeCompras(View view) {
        Intent intent = new Intent(this, ComprarActivity.class);
        startActivity(intent);

    }
}