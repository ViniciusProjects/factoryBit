package com.pim.factorybit.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.pim.factorybit.R;
import com.pim.factorybit.dao.ativosDao;
import com.pim.factorybit.model.Ativo;

public class FormularioAtivosActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Comprar Ativos";
    private EditText campoNome;
    private final ativosDao dao = new ativosDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ativos);
        setTitle(TITULO_APPBAR);
        inicializacaoDosCampos();
        configuraBotaoSalvar();
    }
    private void inicializacaoDosCampos() {
        campoNome = findViewById(R.id.activity_formulario_aluno_nome);
    }

    private void configuraBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ativo ativoCriado = criaAtivo();
                salva(ativoCriado);
            }
            private void salva (Ativo ativo) {
                dao.salva(ativo);
                finish();
            }

            private Ativo criaAtivo() {
                String codigo = campoNome.getText().toString();
                return new Ativo(codigo);
            }

        });


    }
}
