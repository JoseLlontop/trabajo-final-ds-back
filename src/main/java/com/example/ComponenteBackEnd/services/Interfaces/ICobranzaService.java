package com.example.ComponenteBackEnd.services.Interfaces;

import com.example.ComponenteBackEnd.models.Cobranza;

import java.util.List;

public interface ICobranzaService {

    List<Cobranza> getAll();

    Cobranza getById(int id);

    void remove(int id);

    void save(Cobranza cobranza);
}
