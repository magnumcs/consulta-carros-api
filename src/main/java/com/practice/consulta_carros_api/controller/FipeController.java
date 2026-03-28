package com.practice.consulta_carros_api.controller;

import com.practice.consulta_carros_api.dto.ConsultaFipeDTO;
import com.practice.consulta_carros_api.service.FipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fipe")
public class FipeController {

    private final FipeService fipeService;

    public FipeController(FipeService fipeService) {
        this.fipeService = fipeService;
    }

    @GetMapping("/{modeloId}/{anoModelo}")
    public ConsultaFipeDTO consultar(
            @PathVariable Long modeloId,
            @PathVariable Integer anoModelo) {
        return fipeService.consultar(modeloId, anoModelo);
    }

    @DeleteMapping("/{modeloId}/{anoModelo}/cache")
    public ResponseEntity<Void> invalidarCache(
            @PathVariable Long modeloId,
            @PathVariable Integer anoModelo) {
        fipeService.invalidar(modeloId, anoModelo);
        return ResponseEntity.noContent().build();
    }
}
