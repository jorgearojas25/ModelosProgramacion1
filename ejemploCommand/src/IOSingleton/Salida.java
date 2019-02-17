/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package IOSingleton;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Andres
 */
public class Salida {
     public void mostrar(ImageIcon icono){
        
        JOptionPane.showMessageDialog(null, null, "", JOptionPane.PLAIN_MESSAGE,icono);
      
    }

}
