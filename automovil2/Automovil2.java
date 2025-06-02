/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil2;

import automovil2.clases.Automovil;
import automovil2.enumeraciones.TipoAutomovil;
import automovil2.enumeraciones.TipoColor;
import automovil2.enumeraciones.TipoCombustible;


/**
 *
 * @author HP
 */
public class Automovil2 {
   public static void main(String[] args) {
        Automovil auto = new Automovil("Masda", 23, "ktm", TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO, 4, 5, 20, TipoColor.AZUL, 40);
        auto.setVelocidadActual(100);
        auto.mostrarAtributos();
        auto.tiempoEstimado();
        auto.acelerar(20);

        auto.desacelerar(50);

        auto.frenar();
    }
}


    
    

