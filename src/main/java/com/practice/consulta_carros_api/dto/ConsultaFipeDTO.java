package com.practice.consulta_carros_api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public record ConsultaFipeDTO(
        String marca,
        String modelo,
        Integer anoModelo,
        BigDecimal preco,
        String mesReferencia) implements Serializable {

    private static final long serialVersionUID = 1L;
}
