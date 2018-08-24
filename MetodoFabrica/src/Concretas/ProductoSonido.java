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
public class ProductoSonido extends ProductoJuguete {

    @Override
    public String Boton(String s){
        
        String ssonido="y hace sonidos extraños";
        
        return s + ssonido;
        
    }


}
