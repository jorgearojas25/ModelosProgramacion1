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
    public void pesoDeCarga(int peso) {
        CargaLigera objLigero = new CargaLigera();
        this.setSucesor(objLigero);
        
        CargaMedia objMedio = new CargaMedia();
        objLigero.setSucesor(objMedio);
        
        CargaPesada objPesado = new CargaPesada();
        objMedio.setSucesor(objPesado);
        
        sucesor.pesoDeCarga(peso);
    }

    @Override
    public void setSucesor(Aprobador sucesor) {
        this.sucesor = sucesor;
    }
    
}

