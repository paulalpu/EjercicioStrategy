package com.mycompany.strategy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manos
 */
 

public class Navegador {
    private EstrategiaRuta estrategiaRuta;

    public void establecerEstrategia(EstrategiaRuta e) {
        this.estrategiaRuta = e;
    }

    public Ruta generarNavegacion(String origen, String destino) {
        if (estrategiaRuta == null) {
            System.out.println("No se ha establecido una estrategia de ruta.");
            return null;
        }
        return estrategiaRuta.construirRuta(origen, destino);
    }

    public EstrategiaRuta getEstrategiaRuta() {
        return estrategiaRuta;
    }

    public void setEstrategiaRuta(EstrategiaRuta estrategiaRuta) {
        this.estrategiaRuta = estrategiaRuta;
    }
}
