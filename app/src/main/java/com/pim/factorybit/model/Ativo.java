package com.pim.factorybit.model;

import java.math.BigDecimal;

public class Ativo {

    private String codigo;
    private final BigDecimal preco;


    public Ativo(String codigoAtivo, BigDecimal preco) {
        this.codigo = codigoAtivo;
        this.preco = preco;
    }


    public BigDecimal getPreco() {
        return preco;
    }


}
