package com.example.ComponenteBackEnd.models;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "obrasocial")
public class ObraSocial {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;

    @Column(name = "nombre")
    private String nombre;
}
