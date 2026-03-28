package com.practice.consulta_carros_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "modelos")
public class ModeloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca_id")
    private MarcaEntity marca;

    private String nome;

    // construtores, getters e setters completos no GitHub ↑
}


