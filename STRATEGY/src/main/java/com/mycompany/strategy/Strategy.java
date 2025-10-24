/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategy;

/**
 *
 * @author manos
 */
public class Strategy {

 

 
    public void elegirEstrategia(Navegador navegador, EstrategiaRuta estrategia) {
        navegador.establecerEstrategia(estrategia);
    }

    public void solicitarRuta(Navegador navegador, String origen, String destino) {
        Ruta ruta = navegador.generarNavegacion(origen, destino);
        if (ruta != null) {
            ruta.mostrarRuta();
        }
    }
}
   

