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

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String puestoE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String periodoE;
    @NotBlank
    private String ubicacionE;
    private String webE;
    

    //Constructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String puestoE, String descripcionE, String periodoE, String ubicacionE, String webE) {
        this.nombreE = nombreE;
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
        this.periodoE = periodoE;
        this.ubicacionE = ubicacionE;
        this.webE = webE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }

    public String getUbicacionE() {
        return ubicacionE;
    }

    public void setUbicacionE(String ubicacionE) {
        this.ubicacionE = ubicacionE;
    }

    public String getWebE() {
        return webE;
    }

    public void setWebE(String webE) {
        this.webE = webE;
    }

    public String getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(String puestoE) {
        this.puestoE = puestoE;
    }
    
    
    
    
    
    
}
