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
public abstract class Componente {
    protected int masa;
    protected double gravedad;
    protected double peso;
    
    
    public Componente(int masa){
        this.masa = masa;
        this.gravedad = 9.8;
        this.peso = masa*gravedad;
    }
    
    abstract public void agregar(Componente c);
    abstract public void eliminar(Componente c);
    abstract public void pesar(int masa);

}
