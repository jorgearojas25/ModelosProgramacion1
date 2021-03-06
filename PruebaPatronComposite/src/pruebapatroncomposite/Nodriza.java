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
public class Nodriza extends Auto{
    
    private ArrayList<Auto> partes = new ArrayList<Auto>();

    public Nodriza(int masa, double gravedad) {
        super(masa, gravedad);
    }


    @Override
    public void agregar(Auto c) {
        partes.add(c);
    }

    @Override
    public void eliminar(Auto c) {
        partes.remove(c);
    }

    @Override
    public double pesoTotal() {
        double pesoTotal = 0;
        int i=0;
        for(i=0;i<partes.size();i++){   
            pesoTotal = pesoTotal + partes.get(i).pesoTotal();
        }
        return pesoTotal;
    }
    
}
