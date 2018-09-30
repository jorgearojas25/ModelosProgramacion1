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
public class Moto extends Componente {

    public Moto(int masa) {
        super(masa);
    }


   @Override
    public void agregar(Componente c) {
        throw new UnsupportedOperationException("No lo hace.");
    }

    @Override
    public void eliminar(Componente c) {
        throw new UnsupportedOperationException("No lo hace");
    }

    @Override
    public void pesar(int masa) {
      this.masa+=masa;
      this.gravedad+=gravedad;
      this.peso+=peso;
    }
    
}
