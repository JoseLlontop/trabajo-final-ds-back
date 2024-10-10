package com.example.ComponenteBackEnd.services;

import com.example.ComponenteBackEnd.models.ObraSocial;
import com.example.ComponenteBackEnd.repository.ObraSocialRepository;
import com.example.ComponenteBackEnd.services.Interfaces.IObraSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraSocialService implements IObraSocialService {

    @Autowired
    private ObraSocialRepository repository;

    public List<ObraSocial> getAll() {
        return (List<ObraSocial>) repository.findAll();
    }
}
