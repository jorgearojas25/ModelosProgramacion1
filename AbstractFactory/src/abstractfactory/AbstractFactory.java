/*
 * Proyecto para clase de Programacion Avanzada
 * Universidad Distrital Francisco Jose de Caldas  
 */
package abstractfactory;
import abstracts.FabricaAbstractaSilla;
import abstracts.ApoyoAbstracta;
import abstracts.EstructuraAbstracta;
import abstracts.RespaldarAbstracta;
import concret.FabricaConcretaMadera;
import concret.FabricaConcretaAluminio;
import concret.FabricaConcretaPlastico;
import java.util.Scanner;

/**
 *
 * @author Jorge Andres
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaAbstractaSilla silla = new FabricaConcretaPlastico();
        
        ApoyoAbstracta apoyoSilla;
        EstructuraAbstracta estructuraSilla;
        RespaldarAbstracta respaldarSilla;
        
        apoyoSilla = silla.fabricarApoyo();
        estructuraSilla = silla.fabricarEstructura();
        respaldarSilla = silla.fabricarRespaldar();
        
        System.out.println("Se creo silla con apoyoSilla:"+apoyoSilla.getClass());
        
        
        // TODO code application logic here
    }
    
}
