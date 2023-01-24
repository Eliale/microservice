/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maru.microservice.controllers;

import com.maru.microservice.models.Persona;
import com.maru.microservice.services.saludoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Elí Alejandro Salinas Pérez
 */
@RestController
@RequestMapping("/main")
public class mainController {

    @Autowired
    saludoServices servicio;
// Como el de Maru
    @RequestMapping(value = "/jello{saludo}", method = RequestMethod.GET)//, produces = "application/text; charset=utf-8")
    public Persona saludar(String saludo) {
        return servicio.saluda(saludo);
    }


//    @RequestMapping(value = "/jello", method = RequestMethod.GET)//, produces = "application/text; charset=utf-8")
//    public Persona saluda() {
//        // Como el de victor
//        return servicio.saluda("Hola en Frances");
//    }
        
    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    public Persona saludar2() {
        String saludo ="kiubo";
    
        return servicio.saluda(saludo);
    }
    

}
