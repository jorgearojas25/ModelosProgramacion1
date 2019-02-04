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
public class CostoMedio implements Aprobador{

    private Aprobador sucesor;
    double IVA = 0.15;
    @Override
    public double costoEnvio(int costo) {
        if(costo>5000 && costo<=10000){
             double IVA = costo*0.15;
            return costo+IVA;
        }else{
            return sucesor.costoEnvio(costo);
        }
        
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }
    
}

