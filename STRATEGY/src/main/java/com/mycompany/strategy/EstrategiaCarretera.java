package com.mycompany.strategy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manos
 */
 
public class EstrategiaCarretera implements EstrategiaRuta {
    @Override
    public Ruta construirRuta(String origen, String destino) {
        System.out.println("Construyendo ruta por carretera de " + origen + " a " + destino);
        return new Ruta(origen, destino, "20 km");
    }
}
