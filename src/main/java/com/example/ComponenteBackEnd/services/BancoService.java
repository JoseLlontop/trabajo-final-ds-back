package com.example.ComponenteBackEnd.services;

import com.example.ComponenteBackEnd.models.Banco;
import com.example.ComponenteBackEnd.repository.BancoRepository;
import com.example.ComponenteBackEnd.services.Interfaces.IBancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoService implements IBancoService {

    @Autowired
    private BancoRepository repository;

    @Override
    public List<Banco> getAll() {
        return (List<Banco>) repository.findAll();
    }
}
