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
     public String capturar(){
        String entrada;
        do{
            String mensaje = null; 
             entrada = JOptionPane.showInputDialog(mensaje);
        
        }while(entrada == null);
        String entradad = entrada;
        return entradad;
    }
}
