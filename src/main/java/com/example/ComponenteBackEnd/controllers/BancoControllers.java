package com.example.ComponenteBackEnd.controllers;

import com.example.ComponenteBackEnd.models.Banco;
import com.example.ComponenteBackEnd.services.Interfaces.IBancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BancoControllers {

    @Autowired
    private IBancoService service;

    @GetMapping("/api/bancos")
    public List<Banco> getAll() {
        return service.getAll();
    }
}
