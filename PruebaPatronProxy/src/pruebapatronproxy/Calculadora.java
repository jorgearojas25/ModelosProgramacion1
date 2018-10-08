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
public class Calculadora extends CalculadoraAbstracta{

    @Override
    public double obtenerSuma(double a, double b) {
        return a+b;
    }

    @Override
    public double obtenerResta(double a, double b) {
        return a-b;
    }

    @Override
    public double obtenerProducto(double a, double b) {
        return a*b;
    }

    @Override
    public double obtenerDivision(double a, double b) {
        double div=0;
        try{
            div = a/b;
        }catch(Exception e){
            throw new UnsupportedOperationException("No es posible");
        }
        return div;
    }

    
    
    
}

