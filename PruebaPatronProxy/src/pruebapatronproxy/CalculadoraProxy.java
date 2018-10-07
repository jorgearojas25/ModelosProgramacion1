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
public class CalculadoraProxy extends CalculadoraAbstracta{
    
    Calculadora objCalc;
    
    
    public void verificarExistencia(){
        if(objCalc == null){
            objCalc = new Calculadora();
        }
    }
    
    @Override
    public double obtenerSuma(double a, double b) {
        verificarExistencia();
        return objCalc.obtenerSuma(a, b);
    }

    @Override
    public double obtenerResta(double a, double b) {
        verificarExistencia();
        return objCalc.obtenerResta(a, b);
    }

    @Override
    public double obtenerProducto(double a, double b) {
        verificarExistencia();
        return objCalc.obtenerProducto(a, b);
    }

    @Override
    public double obtenerDivision(double a, double b) {
        verificarExistencia();
        return objCalc.obtenerDivision(a, b);
    }
    
    
}

