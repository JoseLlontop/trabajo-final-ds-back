package com.example.ComponenteBackEnd.repository;

import com.example.ComponenteBackEnd.models.Banco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends CrudRepository<Banco, Integer>{

}
