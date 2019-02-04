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
public class CargaPesada implements Aprobador{

    private Aprobador sucesor;
    
    @Override
    public void pesoDeCarga(int peso) {
        if(peso>10 && peso<=50){
            System.out.println("El costo del envio es de $5000");
        }else{
            System.out.println("NO PODEMOS TRANSPORTAR ESTO");
        }
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
     this.sucesor = sucesor;   
    }
    
}

