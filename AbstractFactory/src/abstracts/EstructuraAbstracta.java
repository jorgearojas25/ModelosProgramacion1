/*
 * Proyecto para clase de Programacion Avanzada
 * Universidad Distrital Francisco Jose de Caldas  
 */
package abstracts;

/**
 *
 * @author Jorge Andres
 */
public abstract class EstructuraAbstracta {
    String color;
    int tamanio;
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    } 
}
