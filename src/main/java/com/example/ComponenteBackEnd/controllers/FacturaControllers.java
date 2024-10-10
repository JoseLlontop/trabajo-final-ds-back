package com.example.ComponenteBackEnd.controllers;

import com.example.ComponenteBackEnd.models.Factura;
import com.example.ComponenteBackEnd.services.Interfaces.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FacturaControllers {

    @Autowired
    private IFacturaService service;

    @GetMapping("/api/facturas")
    public List<Factura> getAll() {
        return service.getAll();
    }
}
