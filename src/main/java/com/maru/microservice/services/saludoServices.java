/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maru.microservice.services;

import com.maru.microservice.models.Persona;

/**
 * @author Elí Alejandro Salinas Pérez
 */

public interface saludoServices {

    Persona saluda(String texto);

    boolean esPrimo(int numero);
}
