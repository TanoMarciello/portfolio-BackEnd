/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author agufu
 */
public class dtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descripcionEd;
    @NotBlank
    private String periodoEd;
    @NotBlank
    private String ubicacionEd;
    private String webEd;

    public dtoEducacion() {
    }
    
    public dtoEducacion(String nombreEd, String descripcionEd, String periodoEd, String ubicacionEd, String webEd) {
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
        this.periodoEd = periodoEd;
        this.ubicacionEd = ubicacionEd;
        this.webEd = webEd;
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
