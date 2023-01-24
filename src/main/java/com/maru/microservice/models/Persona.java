/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maru.microservice.models;

/**
 *
 * @author Elí Alejandro Salinas Pérez
 */
public class Persona {

    private int id;
    private String texto;

    public Persona(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
