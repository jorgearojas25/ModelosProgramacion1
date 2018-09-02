/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipos;

import Duplicar.Duplicar;
import Objects.Hoja;
import Objects.Folder;

/**
 *
 * @author GOLDS
 */
public class HojaPrototipo extends Hoja implements Duplicar {

    public HojaPrototipo(double alto, double ancho){
    super(alto,ancho);
    }
    
    @Override
    public Object duplicar() {
       HojaPrototipo hoja = new HojaPrototipo(this.getAlto(),this.getAncho()); 
       return hoja;
    }
    
}
