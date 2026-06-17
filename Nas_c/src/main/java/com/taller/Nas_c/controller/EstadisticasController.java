package com.taller.Nas_c.controller;

import com.taller.Nas_c.service.EstadisticasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadisticasController {

    private final EstadisticasService estadisticas;

    public EstadisticasController(EstadisticasService estadisticas) {
        this.estadisticas = estadisticas;
    }

    @GetMapping("/estadisticas")
    public String mostrarEstadisticas() {
        return "Total de consultas: " + estadisticas.obtenerTotalConsultas()
                + " (Aprendices: " + estadisticas.getTotalAprendices()
                + ", Instructores: " + estadisticas.getTotalInstructores()
                + ", Programas: " + estadisticas.getTotalProgramas() + ")";
    }
}
