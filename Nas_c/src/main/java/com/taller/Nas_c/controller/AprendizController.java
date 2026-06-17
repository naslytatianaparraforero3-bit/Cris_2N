package com.taller.Nas_c.controller;

import com.taller.Nas_c.service.EstadisticasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AprendizController {

    private final EstadisticasService estadisticas;

    public AprendizController(EstadisticasService estadisticas) {
        this.estadisticas = estadisticas;
    }

    @GetMapping("/aprendices")
    public String consultarAprendices() {
        estadisticas.incrementarAprendices();
        return "Listado de aprendices";
    }
}
