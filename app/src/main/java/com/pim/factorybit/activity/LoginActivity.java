package com.pim.factorybit.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pim.factorybit.R;

public class LoginActivity extends AppCompatActivity {

    EditText user ;
    EditText password;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);

        Toast.makeText(this, "Bem-vindo", Toast.LENGTH_SHORT).show();

        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.btn);


    }

    public void clickButton(View view) {

        if (user.getText().toString().equals("Vinicius") && password.getText().toString().equals("123"))
            startActivity(new Intent(LoginActivity.this, MenuScreen.class));
        else

            Toast.makeText(this, "Usuário ou Senha Inválida", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Até mais", Toast.LENGTH_SHORT).show();
    }
}