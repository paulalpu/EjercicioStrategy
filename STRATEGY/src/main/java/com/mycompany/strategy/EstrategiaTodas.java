/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author manos
 */
 
public class EstrategiaTodas implements EstrategiaRuta {
    @Override
    public Ruta construirRuta(String origen, String destino) {
        System.out.println("Mostrando todas las rutas posibles de " + origen + " a " + destino);
        return new Ruta(origen, destino, "Distancia variable");
    }
}
