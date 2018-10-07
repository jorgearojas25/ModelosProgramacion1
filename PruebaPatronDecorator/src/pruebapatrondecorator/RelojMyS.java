/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package pruebapatrondecorator;

/**
 *
 * @author Jorge Andres
 */
import java.util.Calendar;
import javax.swing.JOptionPane;


public class RelojMyS extends Decorador{

    public RelojMyS(Reloj reloj) {
        super(reloj);
    }

    @Override
    public void mostrarHora() {
        JOptionPane.showMessageDialog(null, obtenerHora());
    }

    @Override
    public String obtenerHora() {
        Calendar calendario = Calendar.getInstance();
        hora =  calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        String mensaje1 = Integer.toString(hora);
        String mensaje2 = Integer.toString(minutos);
        String mensaje3 = Integer.toString(segundos);
        return mensaje1+":"+mensaje2+":"+mensaje3;
    }
    
}
