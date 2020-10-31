package com.pim.factorybit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.pim.factorybit.R;
import com.pim.factorybit.fragment.InvestirFragment;
import com.pim.factorybit.fragment.PerfilFragment;

public class TelaMenu extends AppCompatActivity {

    private Button buttonInvestir, buttonPerfil, buttonComprarAtivos, buttonDadosUsuario;

    private PerfilFragment perfilFragment;
    private InvestirFragment investirFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);


        //Remover sombra da actionBar
        getSupportActionBar().setElevation(0);

        inicializacaoCampos();

        perfilFragment = new PerfilFragment();
        investirFragment = new InvestirFragment();

        //CONFIGURAR OBJETO PARA O FRAGMENTO
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, perfilFragment);
        transaction.commit();

        buttonInvestir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investirFragment = new InvestirFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, investirFragment);
                transaction.commit();
            }
        });
        buttonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perfilFragment = new PerfilFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, perfilFragment);
                transaction.commit();
            }
        });


    }

    private void inicializacaoCampos() {
        buttonInvestir = findViewById(R.id.buttonInvestir);
        buttonPerfil = findViewById(R.id.buttonPerfil);
        buttonComprarAtivos = findViewById(R.id.btn_comprar_ativos);
       // buttonDadosUsuario = findViewById(R.id.btn_dados_do_usuario);

    }


    public void telaDeCompras(View view) {
        Intent intent = new Intent(this, ComprarActivity.class);
        startActivity(intent);
    }

    public void TelaDadosUsuario(View view) {
        Intent intent = new Intent(this, DadosUsuarioActivity.class);
        startActivity(intent);
    }

}