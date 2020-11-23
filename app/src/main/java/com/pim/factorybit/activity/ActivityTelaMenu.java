package com.pim.factorybit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.pim.factorybit.R;
import com.pim.factorybit.fragment.AnaliseFragment;
import com.pim.factorybit.fragment.InicialFragment;

public class ActivityTelaMenu extends AppCompatActivity {

    private Button buttonAnalise, buttonInicial, buttonAnaliseMediaAnual;

    private InicialFragment inicialFragment;
    private AnaliseFragment analiseFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);


        //Remover sombra da actionBar
        getSupportActionBar().setElevation(0);

        inicializacaoBotoes();

        inicialFragment = new InicialFragment();
        analiseFragment = new AnaliseFragment();

        //CONFIGURAR OBJETO PARA O FRAGMENTO
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, inicialFragment);
        transaction.commit();

        buttonAnalise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analiseFragment = new AnaliseFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, analiseFragment);
                transaction.commit();
            }
        });
        buttonInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inicialFragment = new InicialFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, inicialFragment);
                transaction.commit();
            }
        });


    }

    private void inicializacaoBotoes() {
        buttonAnalise = findViewById(R.id.buttonInvestir);
        buttonInicial = findViewById(R.id.buttonInicial);
        buttonAnaliseMediaAnual = findViewById(R.id.btn_analise_ativos);
    }


    public void AcaoClickPrimeiroGrafico(View view) {
        Intent intent = new Intent(this, ActivityAnaliseMediaAnual.class);
        startActivity(intent);
    }

    public void AcaoClickSegundoGrafico(View view) {
        Intent intent = new Intent(this, ActivityAnaliseMediaAnual.class);
        startActivity(intent);
    }

    public void AcaoClickTerceiroGrafico(View view) {
        Intent intent = new Intent(this, ActivityAnaliseMediaAnual.class);
        startActivity(intent);
    }


}