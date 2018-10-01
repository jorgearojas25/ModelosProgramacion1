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
       
       Nodriza Nodriza1 = new Nodriza(3,9.8);
       Automovil auto1 = new Automovil(2,9.8);
       Moto moto1 = new Moto(1,9.8);
       Nodriza1.agregar(auto1);
       Nodriza1.agregar(moto1);
       System.out.print(Nodriza1.pesoTotal());
       Salida salida = Salida.obtenerEntrada();
      
    }
    
}
