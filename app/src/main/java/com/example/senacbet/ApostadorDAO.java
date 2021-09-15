package com.example.senacbet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class ApostadorDAO {

    private static SQLiteOpenHelper sqLiteHelper;
    private static SQLiteDatabase db;

    public ApostadorDAO(Context context) {
        this.sqLiteHelper = new SQLiteHelper(context);
    }

    public void salvarApostador(ObjApostador salvarApostador) {

        db = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(SQLiteHelper.CAMPO_NOME_APOSTADOR, salvarApostador.getNome());
        values.put(SQLiteHelper.CAMPO_CIDADE_TIME, salvarApostador.getEmail());
        values.put(SQLiteHelper.CAMPO_PAIS_TIME, salvarApostador.getSaldo());

        db.insert(SQLiteHelper.TABELA_APOSTADORES_E_TIMES, null, values);

        db.close();

    }

    public List<ObjApostador> listarApostadores() {

        db = sqLiteHelper.getReadableDatabase();

        String sql = "SELECT * FROM " + SQLiteHelper.TABELA_APOSTADORES_E_TIMES + ";";
        Cursor c = db.rawQuery(sql, null);

        List<ObjApostador> listaApostadores = new ArrayList<>();

        while (c.moveToNext()) {
            ObjApostador objApostador = new ObjApostador();

            objApostador.setNome(c.getString(c.getColumnIndex(SQLiteHelper.CAMPO_NOME_APOSTADOR)));
            objApostador.setEmail(c.getString(c.getColumnIndex(SQLiteHelper.CAMPO_EMAIL)));
            objApostador.setSaldo(c.getInt(c.getColumnIndex(SQLiteHelper.VALOR_DE_APOSTA)));

            listaApostadores.add(objApostador);
        }
        c.close();
        db.close();
        return listaApostadores;
    }
}
