/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatroncomposite;

/**
 *
 * @author Jorge Andres
 */
public class PruebaPatronComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Nodriza c1 = new Nodriza(3);
       Auto auto1 = new Auto(2);
       Moto moto1 = new Moto(1);
       c1.agregar(auto1);
       c1.agregar(moto1);
       System.out.print(c1.peso);
    }
    
}
