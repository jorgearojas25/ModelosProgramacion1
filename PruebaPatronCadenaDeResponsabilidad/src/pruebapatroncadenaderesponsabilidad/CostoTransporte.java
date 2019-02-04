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
public class CostoTransporte implements Aprobador{
        private Aprobador sucesor;

    @Override
    public double costoEnvio(int costo) {
        CostoBajo objCostoBajo = new CostoBajo();
        this.setSucesor(objCostoBajo);
        
        CostoMedio objCostoMedio = new CostoMedio();
        objCostoBajo.setSucesor(objCostoMedio);
        
        CostoAlto objCostoAlto = new CostoAlto();
        objCostoMedio.setSucesor(objCostoAlto);
        
        return sucesor.costoEnvio(costo);
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }
    
}

