/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatronproxy;

/**
 *
 * @author Jorge Andres
 */
import javax.swing.JOptionPane;


public class EntradaConsola {
    
    public double capturar(){
        String entrada;
        do{
             entrada = JOptionPane.showInputDialog("");
        
        }while(entrada == null);
        double entradad = Double.parseDouble(entrada);
        return entradad;
    }
    
    public String elegirOpcion(){
        Object [] opciones ={"Sumar","Restar","Multiplicar","Dividir"}; 
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opcion", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
        
        if (opcion.toString().equalsIgnoreCase("Sumar")){
        return "Sumar";
        }else if (opcion.toString().equalsIgnoreCase("Restar")){
        return "Restar";
        }else if (opcion.toString().equalsIgnoreCase("Multiplicar")){
        return "Multiplicar";
        } else if (opcion.toString().equalsIgnoreCase("Dividir")){
        return "Dividir";
        }
        return "0";
    }
}

