/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaSingleton;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Entrada {
    
    private static Entrada entrada;

    private static String s;
    private Entrada(){
    }
    
    private static void crearEntrada(){
    
        if(entrada == null){
        entrada = new Entrada();
        entrada.escribir();
        entrada.mostrar();
        }
        else{
        System.out.println("Ya existe una instancia");
        }
    
    }
    
    public static Entrada obtenerEntrada(){
    
        crearEntrada();
        return entrada;
    }
    
    public void escribir(){
        
        System.out.println("Escriba su nombre: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        
    }
    
    public void mostrar(){
        
        System.out.println("Su nombre es: ");
        System.out.println(s);
    }
}
