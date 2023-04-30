/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.afunes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String puestoE;
    private String descripcionE;
    private String periodoE;
    private String ubicacionE;
    private String webE;

    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String puestoE, String descripcionE, String periodoE, String ubicacionE, String webE) {
        this.nombreE = nombreE;
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
        this.periodoE = periodoE;
        this.ubicacionE = ubicacionE;
        this.webE = webE;
    }
    
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
