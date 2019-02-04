/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatroncadenaderesponsabilidad;
import IOSingleton.*;

/**
 *
 * @author Jorge Andres
 */
public class PruebaPatronCadenaDeResponsabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CostoTransporte objCosto = new CostoTransporte();
        Salida objSalida = new Salida();
        Entrada objEntrada = new Entrada();
        
        double a = objEntrada.capturar();
        double resp = objCosto.costoEnvio((int) a);

        objCosto.costoEnvio((int) a);
        
       objSalida.mostrar(resp);

    }
    
}
