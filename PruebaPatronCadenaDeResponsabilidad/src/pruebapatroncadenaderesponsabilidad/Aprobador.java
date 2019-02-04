/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatroncadenaderesponsabilidad;

/**
 *
 * @author Jorge Andres
 */
public interface Aprobador {
        public void pesoDeCarga(int peso);
        public void setSucesor(Aprobador sucesor);
}

