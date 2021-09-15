package com.example.senacbet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroTime extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_time);

        Button cadastrarTime = findViewById(R.id.activity_botao_cadastrarTime);

        cadastrarTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText time = findViewById(R.id.editTextTextPersonTime);
                EditText cidade = findViewById(R.id.editTextTextPersonCidade);
                EditText pais = findViewById(R.id.editTextTextPersonPais);

                ObjTime objTime = new ObjTime();

                if (time != null && cidade != null && pais != null &&
                        !time.equals("") && !cidade.equals("") && !pais.equals("")) {

                    objTime.setNomeTm(time.getText().toString());
                    objTime.setCidadeTm(cidade.getText().toString());
                    objTime.setPaisTm(pais.getText().toString());

                    TimeDAO timeDAO = new TimeDAO(CadastroTime.this);
                    timeDAO.salvar(objTime);
                    startActivity(new Intent(CadastroTime.this, MainActiviry.class));
                    finish();

                }else{
                    Toast.makeText(CadastroTime.this,"Obrigatório prenchimento de todos os campos", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
