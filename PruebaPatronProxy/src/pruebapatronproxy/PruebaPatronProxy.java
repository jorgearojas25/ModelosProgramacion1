/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatronproxy;

/**
 *
 * @author Jorge Andres
 */
public class PruebaPatronProxy {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
        CalculadoraProxy objCalculadora = new CalculadoraProxy();
        SalidaConsola objSalida = new SalidaConsola();
        EntradaConsola objEntrada = new EntradaConsola();
        String opcion = objEntrada.elegirOpcion();
        
        double a = objEntrada.capturar();
        double b = objEntrada.capturar();
        double resp =0;
        
        
        
        if(opcion.equals("Sumar")){
            resp = objCalculadora.obtenerSuma(a, b);
        }
        if(opcion.equals("Restar")){
            resp = objCalculadora.obtenerResta(a, b);
            
        }
        if(opcion.equals("Multiplicar")){
            resp = objCalculadora.obtenerProducto(a, b);
        }
        if(opcion.equals("Dividir")){
            resp = objCalculadora.obtenerDivision(a, b);
        }
        objSalida.mostrar(resp);
    }
    
}

