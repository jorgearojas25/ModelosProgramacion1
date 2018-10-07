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
public abstract class Reloj {

    protected int hora, minutos, segundos;
    
    public abstract void mostrarHora();
    public abstract String obtenerHora();
}

