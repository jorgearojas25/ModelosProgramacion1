package PatronCommand;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */
public class Invoker {
    private Command command;
    
    public Invoker(Command command){
        this.command=command;
    
    }
    public ImageIcon run(){
    
         return command.ejecutar();
    }
    
}
