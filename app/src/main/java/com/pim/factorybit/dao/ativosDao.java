package com.pim.factorybit.dao;

import com.pim.factorybit.model.Ativo;

import java.util.ArrayList;
import java.util.List;

public class ativosDao {

    private final static List<Ativo> ativosList = new ArrayList<>();

    public  void salva (Ativo ativo) {
        ativosList.add(ativo);
    }
    public List <Ativo> todos () {
        return new ArrayList<>(ativosList);
    }


}
