/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author manos
 */
 
public class Ruta {
    private String origen;
    private String destino;
    private String distanciaTotal;

    public Ruta(String origen, String destino, String distanciaTotal) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaTotal = distanciaTotal;
    }

    public void mostrarRuta() {
        System.out.println("Ruta desde " + origen + " hasta " + destino + " (" + distanciaTotal + ")");
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(String distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", distanciaTotal='" + distanciaTotal + '\'' +
                '}';
    }
}

