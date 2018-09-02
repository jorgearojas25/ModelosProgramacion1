/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipos;
import Objects.Separador;
import Objects.Folder;
import Duplicar.Duplicar;

/**
 *
 * @author GOLDS
 */
public class SeparadorPrototipo extends Separador implements Duplicar{
    
public SeparadorPrototipo(double altoS,double anchoS){
    
    super(altoS,anchoS);
    
}    

    @Override
    public Object duplicar() {
        SeparadorPrototipo separador = new SeparadorPrototipo(this.getAltoS(),this.getAnchoS());
        return separador;
    }
    
}
