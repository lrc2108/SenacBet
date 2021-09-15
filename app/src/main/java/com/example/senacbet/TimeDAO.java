package com.example.senacbet;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class TimeDAO {

    private static SQLiteOpenHelper sqLiteHelper;
    private static SQLiteDatabase db;

    public TimeDAO(Context context) {
        this.sqLiteHelper = new SQLiteHelper(context);
    }

    public void salvar(ObjTime salvarTime) {

        db = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(SQLiteHelper.CAMPO_NOME_TIME, salvarTime.getNomeTm());
        values.put(SQLiteHelper.CAMPO_CIDADE_TIME, salvarTime.getCidadeTm());
        values.put(SQLiteHelper.CAMPO_PAIS_TIME, salvarTime.getPaisTm());

        db.insert(SQLiteHelper.TABELA_APOSTADORES_E_TIMES, null, values);

        db.close();

    }

    @SuppressLint("Range")
    public List<ObjTime> listarTime() {

        db = sqLiteHelper.getReadableDatabase();

        String sql = " SELECT * FROM " + SQLiteHelper.TABELA_APOSTADORES_E_TIMES + ";";
        Cursor c = db.rawQuery(sql, null);

        List<ObjTime> listaTime = new ArrayList<>();

        while (c.moveToNext()) {
            ObjTime objTime = new ObjTime();

            objTime.setNomeTm(c.getString(c.getColumnIndex(SQLiteHelper.CAMPO_NOME_TIME)));
            objTime.setCidadeTm(c.getString(c.getColumnIndex(SQLiteHelper.CAMPO_CIDADE_TIME)));
            objTime.setPaisTm(c.getString(c.getColumnIndex(SQLiteHelper.CAMPO_PAIS_TIME)));

            listaTime.add(objTime);
        }
        c.close();
        db.close();
        return listaTime;
    }
}