/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concretas;

import Abstractas.*;

/**
 *
 * @author Estudiantes
 */
public class FabricaSonido extends FabricaJuguetesAbstracta{

    @Override
    public ProductoJuguete fabricar() {
     
        ProductoJuguete producto = new ProductoSonido();
        return producto;
    }
    

}
