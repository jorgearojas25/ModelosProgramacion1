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
public class Moto extends Auto {

    public Moto(int masa, double gravedad) {
        super(masa, gravedad);
    }

   @Override
    public void agregar(Auto c) {
        throw new UnsupportedOperationException("No lo hace.");
    }

    @Override
    public void eliminar(Auto c) {
        throw new UnsupportedOperationException("No lo hace");
    }

    @Override
    public double pesoTotal() {
      this.masa+=masa;
      this.gravedad+=gravedad;
      this.peso+=peso;
      return peso;
    }
    
}
