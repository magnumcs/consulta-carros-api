package com.practice.consulta_carros_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "marcas")
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    // construtores, getters e setters completos no GitHub ↑
}
