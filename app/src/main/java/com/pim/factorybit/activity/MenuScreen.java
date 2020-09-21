package com.pim.factorybit.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pim.factorybit.R;
import com.pim.factorybit.fragment.InvestirFragment;
import com.pim.factorybit.fragment.PerfilFragment;

public class MenuScreen extends AppCompatActivity {

    private Button buttonInvestir, buttonPerfil;

    private PerfilFragment perfilFragment;
    private InvestirFragment investirFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        Intent intentRecebendo = getIntent();

        Bundle param = intentRecebendo.getExtras();
        if (param != null) {
            String nome = param.getString("chave_nome");
            int senha = param.getInt("chave_senha");

            Toast.makeText(MenuScreen.this, "USUÁRIO:" + nome + "-Senha = " + senha, Toast.LENGTH_SHORT).show();

        }



        //Remover sombra da actionBar
        getSupportActionBar().setElevation(0);

         buttonInvestir = findViewById(R.id.buttonInvestir);
         buttonPerfil = findViewById(R.id.buttonPerfil);

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
                transaction.replace(R.id.frameConteudo, investirFragment );
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


}