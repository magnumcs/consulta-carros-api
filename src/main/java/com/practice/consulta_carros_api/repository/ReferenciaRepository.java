package com.practice.consulta_carros_api.repository;

import com.practice.consulta_carros_api.dto.ConsultaFipeDTO;
import com.practice.consulta_carros_api.entity.ReferenciaEntity;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReferenciaRepository extends JpaRepository<ReferenciaEntity, Long> {

    @Query("""
            SELECT new com.practice.consulta_carros_api.dto.ConsultaFipeDTO(
                ma.nome, mo.nome, r.anoModelo, r.preco, r.mesReferencia)
            FROM ReferenciaEntity r
                JOIN r.modelo mo
                JOIN mo.marca ma
            WHERE r.modelo.id = :modeloId AND r.anoModelo = :anoModelo
            ORDER BY r.mesReferencia DESC
            """)
    List<ConsultaFipeDTO> findReferencias(@Param("modeloId") Long modeloId, @Param("anoModelo") Integer anoModelo);
}
