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
public class CostoAlto implements Aprobador{

    private Aprobador sucesor;
    
    @Override
    public double costoEnvio(int costo) {
        if(costo>10000 && costo<=50000){
            double IVA = costo*0.20;
            return(costo+IVA);
        }else{
            return 0;
        }
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
     this.sucesor = sucesor;   
    }
    
}

