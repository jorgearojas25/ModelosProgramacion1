/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaMetodoFabrica;
import Abstractas.*;
import Concretas.*;

/**
 *
 * @author Estudiantes
 */
public class PruebaMetodoFabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = "Se oprime el boton ";
       
        FabricaJuguetesAbstracta fabrica = new FabricaLuces();
        ProductoJuguete jugueteLuces;
        
        jugueteLuces = fabrica.fabricar();
        
        System.out.print(jugueteLuces.Boton(s));
        
        
        // TODO code application logic here
    }
    
}
