package com.example.ComponenteBackEnd.controllers;

import com.example.ComponenteBackEnd.models.ObraSocial;
import com.example.ComponenteBackEnd.services.Interfaces.IObraSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObraSocialControllers {

    @Autowired
    private IObraSocialService service;

    @GetMapping("/api/obrasocial")
    public List<ObraSocial> getAll() {
        return service.getAll();
    }
}
