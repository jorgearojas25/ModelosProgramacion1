/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package IOSingleton;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Andres
 */
public class Entrada {
     public double capturar(){
        String entrada;
        do{
             entrada = JOptionPane.showInputDialog("Introduzca el costo");
        
        }while(entrada == null);
        double entradad = Double.parseDouble(entrada);
        return entradad;
    }
}
