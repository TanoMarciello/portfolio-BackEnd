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
public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private int edad;
    private String descripcion;
    @NotBlank
    private String nacionalidad;
    @NotBlank
    private String estadoCivil;
    private String titulo;
    @NotBlank
    private String domicilio;
    @NotBlank
    private String email;
    @NotBlank
    private String telefono;
    private String facebook;
    private String instagram;
    private String discord;
    private String github;
    @NotBlank
    private String img;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, int edad, String descripcion, String nacionalidad, String estadoCivil, String titulo, String domicilio, String email, String telefono, String facebook, String instagram, String discord, String github, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.titulo = titulo;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
        this.facebook = facebook;
        this.instagram = instagram;
        this.discord = discord;
        this.github = github;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getDiscord() {
        return discord;
    }

    public void setDiscord(String discord) {
        this.discord = discord;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
    
}
