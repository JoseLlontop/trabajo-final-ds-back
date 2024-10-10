package com.example.ComponenteBackEnd.models;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;

    @Column(name = "cae")
    private String cae;
}
