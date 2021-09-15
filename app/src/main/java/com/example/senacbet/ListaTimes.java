package com.example.senacbet;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListaTimes extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_times);


    }

    @Override
    protected void onResume() {
        super.onResume();

        ListView listaTime = findViewById(R.id.activity_lista_time);
        listaTime.setAdapter(new ArrayAdapter<ObjApostador>(ListaTimes.this, android.R.layout.simple_list_item_1));

        TimeDAO timeDAO = new TimeDAO(ListaTimes.this);
        timeDAO.listarTime();
    }
}
