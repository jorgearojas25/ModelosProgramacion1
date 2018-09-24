/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesAbstractas.Motor;

public class MotorGasolina implements Motor{//IMPLEMENTADOR C

    @Override
    public void prender() {
        System.out.println("Prendiendo Motor gasolina");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor gasolina");
    }

    @Override
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 50 revoluciones");
    }

    @Override
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 50 revoluciones");
    }
    
}
