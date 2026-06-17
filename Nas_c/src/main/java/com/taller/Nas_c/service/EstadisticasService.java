package com.taller.Nas_c.service;

import org.springframework.stereotype.Service;

@Service
public class EstadisticasService {

    private int totalAprendices;
    private int totalInstructores;
    private int totalProgramas;

    public EstadisticasService() {
        System.out.println("Instancia de EstadisticasService creada: " + this.hashCode());
    }

    public void incrementarAprendices() {
        totalAprendices++;
    }

    public void incrementarInstructores() {
        totalInstructores++;
    }

    public void incrementarProgramas() {
        totalProgramas++;
    }

    public int obtenerTotalConsultas() {
        return totalAprendices + totalInstructores + totalProgramas;
    }

    public int getTotalAprendices() {
        return totalAprendices;
    }

    public int getTotalInstructores() {
        return totalInstructores;
    }

    public int getTotalProgramas() {
        return totalProgramas;
    }
}