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
public abstract class Auto {
    protected int masa;
    protected double gravedad;
    protected double peso;
    
    
    public Auto(int masa, double gravedad){
        this.masa = masa;
        this.gravedad = gravedad;
        this.peso = masa*gravedad;
    }
    
    abstract public void agregar(Auto c);
    abstract public void eliminar(Auto c);
    abstract public double pesoTotal();

}
