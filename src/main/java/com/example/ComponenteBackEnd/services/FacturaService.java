package com.example.ComponenteBackEnd.services;

import com.example.ComponenteBackEnd.models.Factura;
import com.example.ComponenteBackEnd.repository.FacturaRepository;
import com.example.ComponenteBackEnd.services.Interfaces.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService implements IFacturaService {

    @Autowired
    private FacturaRepository repository;
    @Override
    public List<Factura> getAll() {
        return (List<Factura>) repository.findAll();
    }
}
