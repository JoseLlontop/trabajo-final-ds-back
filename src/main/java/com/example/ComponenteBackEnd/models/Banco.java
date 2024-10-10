package com.example.ComponenteBackEnd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "banco")
public class Banco {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private String telefono;
}
