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
public class AccionesCrash implements Command{
    private JuegoCrash crash;
  
    
    public AccionesCrash(){
        this.crash=new JuegoCrash();
    };
    @Override
   public ImageIcon ejecutar(){
        Object [] opciones ={"Saltar","Agacharse","Correr","Poder"}; 
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opcion", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
        
        if (opcion.toString().equalsIgnoreCase("Saltar")){
        return crash.saltar();
        }else if (opcion.toString().equalsIgnoreCase("Agacharse")){
        return crash.agacharse();
        }else if (opcion.toString().equalsIgnoreCase("Correr")){
        return crash.correr();
        } else if (opcion.toString().equalsIgnoreCase("Poder")){
        return crash.poder();
        }
        return null;
    }
    
    
}
