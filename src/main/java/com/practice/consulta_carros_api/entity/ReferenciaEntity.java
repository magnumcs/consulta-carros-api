package com.practice.consulta_carros_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "referencias")
public class ReferenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modelo_id")
    private ModeloEntity modelo;

    @Column(name = "ano_modelo")
    private Integer anoModelo;

    private BigDecimal preco;

    @Column(name = "mes_referencia")
    private String mesReferencia;

    // construtores, getters e setters completos no GitHub ↑
}
