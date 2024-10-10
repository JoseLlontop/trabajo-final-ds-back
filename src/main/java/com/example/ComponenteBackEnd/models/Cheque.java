package com.example.ComponenteBackEnd.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter @Setter
@Entity
@Table(name = "cheque")
public class Cheque {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;

    @Column(name = "fecha_emision")
    private LocalDate fecha_emision;

    @Column(name = "monto")
    private float monto;

    @Column(name = "nro_cheque")
    private int nro_cheque;

    @ManyToOne
    @JoinColumn(name = "cobranza_ID")
    private Cobranza cobranza; // Relación inversa con Cobranza
}
