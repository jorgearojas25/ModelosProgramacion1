/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipos;
import Objects.*;
import Duplicar.Duplicar;

/**
 *
 * @author GOLDS
 */
public class FolderPrototipo extends Folder implements Duplicar {

    @Override
    public Object duplicar() {
        FolderPrototipo folder = new FolderPrototipo();
        folder.setHoja((HojaPrototipo)this.getHoja().duplicar());
        folder.setSeparador((SeparadorPrototipo)this.getSeparador().duplicar());
        return folder;
    }
    @Override
    public String toString(){
 
    return "Las hojas miden "+this.getAltoHoja()+" X "+this.getAnchoHoja()+" Y los separadores mideen: "
+this.getAltoSeparador()+" X "+this.getAnchoHoja();
}
    
}
