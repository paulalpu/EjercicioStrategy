/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author manos
 */
public class Cliente {
     public static void main(String[] args) {
        Strategy cliente = new Strategy();
        Navegador navegador = new Navegador();

        // Ejemplo de uso con distintas estrategias
        cliente.elegirEstrategia(navegador, new EstrategiaPeatonal());
        cliente.solicitarRuta(navegador, "Parque", "Centro");

        cliente.elegirEstrategia(navegador, new EstrategiaBicicleta());
        cliente.solicitarRuta(navegador, "Universidad", "Casa");

        cliente.elegirEstrategia(navegador, new EstrategiaCarretera());
        cliente.solicitarRuta(navegador, "Bogota", "Medellin");
    }
}
