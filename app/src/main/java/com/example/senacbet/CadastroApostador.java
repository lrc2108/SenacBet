package com.example.senacbet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroApostador extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_apostador);

        Button cadastrarApostadores = findViewById(R.id.activity_botao_cadastroApostador);

        cadastrarApostadores.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText nome = findViewById(R.id.editTextTextPersonName);
                EditText email = findViewById(R.id.editTextTextPersonEmail);
                EditText valorAposta = findViewById(R.id.editTextTextPersonSaldo);

                ObjApostador objApostador = new ObjApostador();

                if (nome != null && email != null && valorAposta != null &&
                        !nome.equals("") && !email.equals("") && !valorAposta.getText().toString().equals("")){

                    objApostador.setNome(nome.getText().toString());
                    objApostador.setEmail(email.getText().toString());
                    objApostador.setSaldo(valorAposta.getInputType());

                    ApostadorDAO apostadorDAO = new ApostadorDAO(CadastroApostador.this);
                    apostadorDAO.salvarApostador(objApostador);
                    startActivity(new Intent(CadastroApostador.this, MainActiviry.class));

                }else{
                    Toast.makeText(CadastroApostador.this, "Obrigatório preenchimento de todos os campos. ", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
