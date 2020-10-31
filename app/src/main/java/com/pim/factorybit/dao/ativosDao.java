package com.pim.factorybit.dao;

import com.pim.factorybit.model.Ativo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ativosDao {

    public List<Ativo> listaDeAtivos() {
        List<Ativo> ativos = new ArrayList<>(Arrays.asList(
                new Ativo("1", new BigDecimal(234.99)),
                new Ativo("2", new BigDecimal(420.50))));
        return ativos;


    }
}
