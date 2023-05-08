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
public class dtoPortfolio {
    @NotBlank
    private String nombreP;
    
    private String descripcionP;

    private String imgP;
    
    private String webP;

    public dtoPortfolio() {
    }

    public dtoPortfolio(String nombreP, String descripcionP, String imgP, String webP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.webP = webP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getWebP() {
        return webP;
    }

    public void setWebP(String webP) {
        this.webP = webP;
    }

    


    
    
}
