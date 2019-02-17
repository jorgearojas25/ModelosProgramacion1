/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocommand;

import IOSingleton.*;
import PatronCommand.*;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class EjemploCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Command command;
        command = new AccionesMario();
        Invoker invoker = new Invoker(command);
        Salida objSalida = new Salida();
        ImageIcon resp = invoker.run();
        objSalida.mostrar(resp);
        
        Command command1 = new AccionesCrash();
        Invoker invoker1 = new Invoker(command1);
        Salida objSalida1 = new Salida();
        ImageIcon resp1 = invoker1.run();
        objSalida1.mostrar(resp1);
        
        
        
     
        
    }
    
    
}
