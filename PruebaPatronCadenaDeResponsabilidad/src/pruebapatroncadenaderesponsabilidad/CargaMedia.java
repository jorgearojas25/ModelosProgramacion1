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
public class CargaMedia implements Aprobador{

    private Aprobador sucesor;
    
    @Override
    public void pesoDeCarga(int peso) {
        if(peso>1 && peso<=10){
            System.out.println("El costo del envio es de $1000");
        }else{
            sucesor.pesoDeCarga(peso);
        }
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }
    
}

