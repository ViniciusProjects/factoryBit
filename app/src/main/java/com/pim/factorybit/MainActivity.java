package com.pim.factorybit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, password;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.btn);
    }


    public void clickButton(View view) {
        if (user.getText().toString().equals("Vinicius") && password.getText().toString().equals("123"))
            startActivity(new Intent(MainActivity.this, MenuScreen.class));

        else
            Toast.makeText(this, "Usuário ou Senha Inválida", Toast.LENGTH_SHORT).show();
    }

}