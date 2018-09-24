/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaPatronBridge;

/**
 *
 * @author Estudiantes
 */
import ClasesAbstractas.Auto;
import ClasesConcretas.*;


public class PruebPatronBridge {


    public static void main(String[] args) {
        
        Auto transporte1 = new Bus(new MotorElectrico());
        transporte1.arrancar();
        transporte1.acelerar();
        transporte1.frenar();
        transporte1.detener();
        
        Auto T2 = new Bus(new MotorDiesel());
        T2.arrancar();
        T2.acelerar();
        T2.frenar();
        T2.detener();
         
        Auto T3 = new Camion(new MotorGasolina());
        T3.arrancar();
        T3.acelerar();
        T3.frenar();
        T3.detener();
        
        
    }
    
}
