/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author manos
 */
 

public class EstrategiaBicicleta implements EstrategiaRuta {
    @Override
    public Ruta construirRuta(String origen, String destino) {
        System.out.println("Construyendo ruta para bicicleta de " + origen + " a " + destino);
        return new Ruta(origen, destino, "8 km");
    }
}

