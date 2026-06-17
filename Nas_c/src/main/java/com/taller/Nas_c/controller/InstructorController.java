package com.taller.Nas_c.controller;

import com.taller.Nas_c.service.EstadisticasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

    private final EstadisticasService estadisticas;

    public InstructorController(EstadisticasService estadisticas) {
        this.estadisticas = estadisticas;
    }

    @GetMapping("/instructores")
    public String consultarInstructores() {
        estadisticas.incrementarInstructores();
        return "Listado de instructores";
    }
}
