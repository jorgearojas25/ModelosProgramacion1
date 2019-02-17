package PatronCommand;

import IOSingleton.Salida;
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
public class AccionesMario implements Command {

    
    private JuegoMario mario;
  
    Salida objSalida = new Salida();
    public AccionesMario(){
        this.mario=new JuegoMario();
    };

    @Override
    public ImageIcon ejecutar(){
        Object [] opciones ={"Saltar","Agacharse","Correr","Poder"}; 
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opcion", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
        
        if (opcion.toString().equalsIgnoreCase("Saltar")){
        return mario.saltar();
        }else if (opcion.toString().equalsIgnoreCase("Agacharse")){
        return mario.agacharse();
        }else if (opcion.toString().equalsIgnoreCase("Correr")){
        return mario.correr();
        } else if (opcion.toString().equalsIgnoreCase("Poder")){
        return mario.poder();
        }
        return null;
    }
    
}
