package com.example.ComponenteBackEnd.models;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;

    @Column(name = "cuenta_origen")
    private String cuenta_origen;

    @Column(name = "cuenta_destino")
    private String cuenta_destino;

    @Column(name = "monto")
    private float monto;

    @ManyToOne
    @JoinColumn(name = "banco_ID")
    private Banco banco;

    @ManyToOne
    @JoinColumn(name = "cobranza_ID")
    private Cobranza cobranza; // Relación inversa con Cobranza
}
