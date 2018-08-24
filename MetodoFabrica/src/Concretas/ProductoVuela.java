/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concretas;

import Abstractas.ProductoJuguete;

/**
 *
 * @author Estudiantes
 */
public class ProductoVuela extends ProductoJuguete {

    @Override
    public String Boton(String s){
        
        String svuela="y se va volando ¡Agarrenlo!";
        
        return s + svuela;
        
    }


}
