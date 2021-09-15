package com.example.senacbet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String NOME_BD = "aulaSenac.senacBet.ti2020n";

    static final String CAMPO_ID_APOSTADOR = "ID APOSTADOR";
    static final String CAMPO_NOME_APOSTADOR = "APOSTADOR";
    static final String CAMPO_EMAIL = "EMAIL";
    static final String VALOR_DE_APOSTA = "SALDO";

    static final String CAMPO_ID_TIME = "ID TIME";
    static final String CAMPO_NOME_TIME = "TIME";
    static final String CAMPO_CIDADE_TIME = "CIDADE TIME";
    static final String CAMPO_PAIS_TIME = "PAÍS TIME";


    static final String TABELA_APOSTADORES_E_TIMES = " APOSTADORES E TIMES ";

    private final String BD_CREATE_APOSTADORES_E_TIMES = " CREATE TABLE " + TABELA_APOSTADORES_E_TIMES+"( " +
            CAMPO_ID_APOSTADOR + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            CAMPO_NOME_APOSTADOR + " TEXT," +
            CAMPO_EMAIL + " TEXT," +
            VALOR_DE_APOSTA + " TEXT," +
            CAMPO_NOME_TIME + " TEXT," +
            CAMPO_CIDADE_TIME+ " TEXT," +
            CAMPO_PAIS_TIME+ " TEXT,"+
            ") ; ";




    public SQLiteHelper(Context context) {
        super(context, NOME_BD, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(BD_CREATE_APOSTADORES_E_TIMES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase SQLDatabase , int oldVersion, int newVersion) {

    }
}
