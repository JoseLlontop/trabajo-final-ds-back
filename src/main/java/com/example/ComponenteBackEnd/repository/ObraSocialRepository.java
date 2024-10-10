package com.example.ComponenteBackEnd.repository;

import com.example.ComponenteBackEnd.models.ObraSocial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraSocialRepository extends CrudRepository<ObraSocial, Integer> {

}
