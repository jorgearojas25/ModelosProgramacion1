/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapatroncomposite;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Salida {
    
    private static Salida salida;

    private static String s;
    private Salida(){
        
    }
    
    private static void crearEntrada(){
    
        if(salida == null){
        salida = new Salida();
        salida.mostrar();
        }
        else{
        System.out.println("Ya existe una instancia");
        }
    
    }
    
    public static Salida obtenerEntrada(){
    
        crearEntrada();
        return salida;
    }
    

    
    public void mostrar(){
        
        System.out.println("El peso total es: ");
        System.out.println(s);
    }
}
