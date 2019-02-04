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
public class CargaLigera implements Aprobador{

    private Aprobador sucesor;
    
    @Override
   public void pesoDeCarga(int peso) {
        if(peso>0 && peso<=1){
            System.out.println("El costo del envio es de $500");
        }else{
            sucesor.pesoDeCarga(peso);
        }
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }
    
}

