package com.example.senacbet;

public class ObjTime {
    private String nomeTm, cidadeTm, paisTm;

    public String getNomeTm() {
        return this.nomeTm;
    }

    public void setNomeTm(String nome) {
        this.nomeTm = nome;
    }

    public String getCidadeTm() {
        return this.cidadeTm;
    }

    public void setCidadeTm (String cidade) {
        this.cidadeTm = cidade;
    }

    public String getPaisTm() {
        return this.paisTm;
    }

    public void setPaisTm(String pais) {
        this.paisTm = pais;
    }
    public String toString(){
        return nomeTm;
    }
}
