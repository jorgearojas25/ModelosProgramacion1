/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesAbstractas.Motor;

public class MotorDiesel implements Motor{//IMPLEMENTADOR B

    @Override
    public void prender() {
        System.out.println("Prendiendo motor diesel");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor diesel");
    }

    @Override
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 30 revoluciones");
    }

    @Override
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 30 revoluciones");
    }
    
}
