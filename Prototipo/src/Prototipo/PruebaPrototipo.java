/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;
import Prototipos.*;


/**
 *
 * @author GOLDS
 */
public class PruebaPrototipo {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        FolderPrototipo folderBase = new FolderPrototipo();
        folderBase.setHoja(new HojaPrototipo(30,10));
        folderBase.setSeparador(new SeparadorPrototipo(31,12));
        
        FolderPrototipo folderDupA = new FolderPrototipo();
        folderDupA = (FolderPrototipo)folderBase.duplicar();
        folderDupA.setDiseño(" de flores");
        
        FolderPrototipo folderDupB = new FolderPrototipo();
        folderDupB = (FolderPrototipo)folderBase.duplicar();
        folderDupB.setDiseño(" de carros");
        
        System.out.println("info base: "+folderBase+" tiene un diseño"+folderBase.getDiseño());
        System.out.println("info duplicado 1:"+folderDupA+" tiene un diseño"+folderDupA.getDiseño());
        // TODO code application logic here
    }
    
}
