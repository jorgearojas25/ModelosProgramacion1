/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import ClasesConcretas.*;


public class Principal {

 
    public static void main(String[] args) {
        Ensamblador cliente1 = new Ensamblador(new ModeloB());
        cliente1.construirAuto();
        System.out.println(cliente1.getAuto());
        
        Ensamblador cliente2 = new Ensamblador(new ModeloC());
        cliente1.construirAuto();
        System.out.println(cliente1.getAuto());
        
        Ensamblador cliente3 = new Ensamblador(new ModeloA());
        cliente1.construirAuto();
        System.out.println(cliente1.getAuto());
        
    }
    
}
