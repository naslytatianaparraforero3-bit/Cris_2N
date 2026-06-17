package com.taller.Nas_c.controller;

import com.taller.Nas_c.service.EstadisticasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramaController {

    private final EstadisticasService estadisticas;

    public ProgramaController(EstadisticasService estadisticas) {
        this.estadisticas = estadisticas;
    }

    @GetMapping("/programas")
    public String consultarProgramas() {
        estadisticas.incrementarProgramas();
        return "Listado de programas de formación";
    }
}

