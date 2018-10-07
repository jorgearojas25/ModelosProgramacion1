/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatrondecorator;

/**
 *
 * @author Jorge Andres
 */
public class PruebaPatronDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RelojBase reloj = new RelojBase();
        reloj.mostrarHora();
        
        RelojMyS r = new RelojMyS(reloj);
        r.mostrarHora();

    }
    
}
