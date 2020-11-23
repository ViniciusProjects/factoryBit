package com.pim.factorybit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pim.factorybit.R;

public class TelaInicial extends AppCompatActivity {

    EditText user;
    EditText password;
    Button entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);

        mensagemAoEntrarNoApp("Bem-vindo");
        inicializacaoDosCampos();
    }

    private void mensagemAoEntrarNoApp(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    private void inicializacaoDosCampos() {
        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        entrar = (Button) findViewById(R.id.btn_entrar);
    }


    public void clickButton(View view) {
        validarUsuario();
    }

    private void validarUsuario() {
        if (user.getText().toString().equals("Vinicius") && password.getText().toString().equals("123"))
            startActivity(new Intent(TelaInicial.this, ActivityTelaMenu.class));
        else
            mensagemAoEntrarNoApp("Usuário ou Senha Inválida");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Até mais", Toast.LENGTH_SHORT).show();
    }
}