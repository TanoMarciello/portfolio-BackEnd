/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author agufu
 */
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEd;
    private String descripcionEd;
    private String periodoEd;
    private String ubicacionEd;
    private String webEd;

    public Educacion() {
    }

    public Educacion(String nombreEd, String descripcionEd, String periodoEd, String ubicacionEd, String webEd) {
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
        this.periodoEd = periodoEd;
        this.ubicacionEd = ubicacionEd;
        this.webEd = webEd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }

    public String getPeriodoEd() {
        return periodoEd;
    }

    public void setPeriodoEd(String periodoEd) {
        this.periodoEd = periodoEd;
    }

    public String getUbicacionEd() {
        return ubicacionEd;
    }

    public void setUbicacionEd(String ubicacionEd) {
        this.ubicacionEd = ubicacionEd;
    }

    public String getWebEd() {
        return webEd;
    }

    public void setWebEd(String webEd) {
        this.webEd = webEd;
    }
    
    
    
    
}

