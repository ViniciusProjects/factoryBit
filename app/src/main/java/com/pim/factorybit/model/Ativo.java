package com.pim.factorybit.model;

import java.io.Serializable;

public class Ativo implements Serializable {

    private int id = 0;
    private String codigo;


    public Ativo(String codigoAtivo) {
        this.codigo = codigoAtivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean temIdValido() {
        return id > 0;
    }


}
