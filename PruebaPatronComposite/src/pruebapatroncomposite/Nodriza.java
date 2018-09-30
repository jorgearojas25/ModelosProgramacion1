/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatroncomposite;

import java.util.ArrayList;

/**
 *
 * @author Jorge Andres
 */
public class Nodriza extends Componente{
    
    private ArrayList<Componente> partes = new ArrayList<Componente>();

    public Nodriza(int masa) {
        super(masa);
    }


    @Override
    public void agregar(Componente c) {
        c.masa+=this.masa;
        c.gravedad+=this.gravedad;
        c.peso+=this.peso;
        partes.add(c);
    }

    @Override
    public void eliminar(Componente c) {
        c.masa+=this.masa;
        c.gravedad+=this.gravedad;
        c.peso+=this.peso;
        partes.remove(c);
    }

    @Override
    public void pesar(int masa) {
        this.masa+=masa;
        int i=0;
        while(i<partes.size()){
            partes.get(i).pesar(masa);
            i++;
        }
    }
    
}
