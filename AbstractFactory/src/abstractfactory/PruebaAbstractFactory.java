/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron
 *
 */
package abstractfactory;

import abstracts.*;
import concret.FabricaConcretaMadera;
import concret.FabricaConcretaAluminio;
import concret.FabricaConcretaPlastico;


/**
 *
 * @author Jorge 
 */
public class PruebaAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricaAbstractaSilla sillaP = new FabricaConcretaPlastico();

        ApoyoAbstracta apoyoSillaP;
        EstructuraAbstracta estructuraSillaP;
        RespaldarAbstracta respaldarSillaP;

        apoyoSillaP = sillaP.fabricarApoyo();
        estructuraSillaP = sillaP.fabricarEstructura();
        respaldarSillaP = sillaP.fabricarRespaldar();
        
        System.out.println("\n------------------Silla Plastico-------------------\n");
        System.out.println("Se creo silla con Apoyo: " + apoyoSillaP.getClass());
        System.out.println("                  Estructura: " + estructuraSillaP.getClass());
        System.out.println("                  Respaldar" + respaldarSillaP.getClass());
        
        FabricaAbstractaSilla sillaM = new FabricaConcretaMadera();

        ApoyoAbstracta apoyoSillaM;
        EstructuraAbstracta estructuraSillaM;
        RespaldarAbstracta respaldarSillaM;

        apoyoSillaM = sillaM.fabricarApoyo();
        estructuraSillaM = sillaM.fabricarEstructura();
        respaldarSillaM = sillaM.fabricarRespaldar();
        System.out.println("\n------------------Silla Madera-------------------\n");
        System.out.println("Se creo silla con Apoyo: " + apoyoSillaM.getClass());
        System.out.println("                  Estructura: " + estructuraSillaM.getClass());
        System.out.println("                  Respaldar" + respaldarSillaM.getClass());
        
        FabricaAbstractaSilla sillaA = new FabricaConcretaAluminio();

        ApoyoAbstracta apoyoSillaA;
        EstructuraAbstracta estructuraSillaA;
        RespaldarAbstracta respaldarSillaA;

        apoyoSillaA = sillaA.fabricarApoyo();
        estructuraSillaA = sillaA.fabricarEstructura();
        respaldarSillaA = sillaA.fabricarRespaldar();
        
        System.out.println("\n------------------Silla Aluminio-------------------\n");
        System.out.println("Se creo silla con Apoyo: " + apoyoSillaA.getClass());
        System.out.println("                  Estructura: " + estructuraSillaA.getClass());
        System.out.println("                  Respaldar" + respaldarSillaA.getClass());

        // TODO code application logic here
    }

}
