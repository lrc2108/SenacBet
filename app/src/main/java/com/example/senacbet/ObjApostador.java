package com.example.senacbet;

import android.provider.ContactsContract;
import android.text.Editable;

public class ObjApostador {
    private String nomeAp, emailAp;
    private int saldoAp;

    public String getNome() {
        return nomeAp;
    }

    public void setNome(String nome) {
        this.nomeAp = nome;
    }

    public String getEmail() {
        return emailAp;
    }

    public void setEmail(String email) {
        this.emailAp = email;
    }

    public int getSaldo() {
        return saldoAp;
    }

    public void setSaldo(int saldo) {
        this.saldoAp = saldo;
    }
    public String toString(){
        return nomeAp;
    }

}