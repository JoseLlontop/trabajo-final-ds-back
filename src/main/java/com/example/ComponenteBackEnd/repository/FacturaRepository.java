package com.example.ComponenteBackEnd.repository;

import com.example.ComponenteBackEnd.models.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Integer> {
}
