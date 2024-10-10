package com.example.ComponenteBackEnd.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@Entity
@Table(name = "cobranza")
public class Cobranza {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "monto")
    private float monto;

    @Column(name = "numero")
    private int numero;

    @Column(name = "razon_social")
    private String razon_social;

    @OneToOne
    @JoinColumn(name = "factura_ID")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "cliente_ID")
    private ObraSocial cliente;

    @OneToMany(mappedBy = "cobranza", cascade = CascadeType.ALL)
    private List<Cheque> cheques;

    @OneToMany(mappedBy = "cobranza", cascade = CascadeType.ALL)
    private List<Transferencia> transferencias;
}
