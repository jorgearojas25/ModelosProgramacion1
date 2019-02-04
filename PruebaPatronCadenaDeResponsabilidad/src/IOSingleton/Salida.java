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
public class Salida {
     public void mostrar(double letrero){
        
        JOptionPane.showMessageDialog(null, letrero, "El costo total es", JOptionPane.INFORMATION_MESSAGE);
    }
}
