/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesAbstractas.Motor;

public class MotorElectrico implements Motor{ //IMPLEMENTADOR A

    @Override
    public void prender() {
        System.out.println("Prendiendo motor electrioco");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
    }

    @Override
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 20 revoluciones");
    }

    @Override
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 20 revoluciones");
    }
    
}
