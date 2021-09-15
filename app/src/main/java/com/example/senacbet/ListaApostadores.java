package com.example.senacbet;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListaApostadores extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_apostadores);

    }

    @Override
    protected void onResume() {
        super.onResume();

        ListView listaApostador = findViewById(R.id.activity_lista_apostador);
        listaApostador.setAdapter(new ArrayAdapter<ObjApostador>(ListaApostadores.this, android.R.layout.simple_list_item_1));

        ApostadorDAO apostadorDAO = new ApostadorDAO(ListaApostadores.this);
        apostadorDAO.listarApostadores();
    }
}
