package com.example.ComponenteBackEnd.repository;

import com.example.ComponenteBackEnd.models.Cobranza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobranzaRepository extends CrudRepository<Cobranza, Integer> {
}
