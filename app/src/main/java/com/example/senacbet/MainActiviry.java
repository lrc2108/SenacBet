package com.example.senacbet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActiviry extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button listaApostador = findViewById(R.id.activity_botao_lista_apostador);
        Button listaTimes = findViewById(R.id.activity_botao_lista_times);
        Button cadastroApostador = findViewById(R.id.activity_botao_cadastrar_apostador);
        Button cadastroTime = findViewById(R.id.activity_botao_cadastrar_time);

        cadastroApostador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActiviry.this, CadastroApostador.class));
            }
        });
        cadastroTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActiviry.this, CadastroTime.class));

            }
        });
        listaApostador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActiviry.this, ListaApostadores.class));

            }
        });
        listaTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActiviry.this, ListaTimes.class));
            }
        });
    }
}
