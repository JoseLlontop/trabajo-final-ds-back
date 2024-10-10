package com.example.ComponenteBackEnd.controllers;

import com.example.ComponenteBackEnd.models.Cobranza;
import com.example.ComponenteBackEnd.services.Interfaces.ICobranzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CobranzaControllers {

    @Autowired
    private ICobranzaService service;

    @GetMapping("/api/cobranzas")
    public List<Cobranza> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/cobranzas/{id}")
    public Cobranza getById(@PathVariable int id){
        return service.getById(id);
    }

    @DeleteMapping("/api/cobranzas/{id}")
    public void remove(@PathVariable int id) {
        service.remove(id);
    }

    @PostMapping("/api/cobranzas")
    public void save(@RequestBody Cobranza cobranza){
        service.save(cobranza);
    }

}
