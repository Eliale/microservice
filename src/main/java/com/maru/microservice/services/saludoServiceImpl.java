/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maru.microservice.services;

import com.maru.microservice.models.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.maru.microservice.models.UsuarioCertificado;
import com.maru.microservice.repository.UsuarioCertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Elí Alejandro Salinas Pérez
 */
@Service("saludoServiceImpl")
public class saludoServiceImpl implements saludoServices {
    @Autowired
    private UsuarioCertificadoRepository repository;

    private final AtomicLong contador = new AtomicLong();

    @Override
    public Persona saluda(String saludo) {
        int c = (int) contador.incrementAndGet();
        UsuarioCertificado usr = new UsuarioCertificado(c, saludo, (c % 2 == 0) ? UsuarioCertificado.Estado.CERTIFICADO : UsuarioCertificado.Estado.NO_CERTIFICADO);
        repository.save(usr);

        repository.findAll().forEach(s -> {
            System.out.println(s.toString());
        });


        return new Persona(c, "Hola Maru: " + saludo);
    }

    @Override
    public boolean esPrimo(int numero) {
        boolean isPrimo = true;
        if (numero > 2) {
            if (numero != 2) {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        isPrimo = false;
                        break;
                    }
                }
            }
            return isPrimo;
        }
        return false;
    }

}
