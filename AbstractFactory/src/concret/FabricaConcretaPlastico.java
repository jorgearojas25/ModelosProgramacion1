/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package concret;
import abstracts.ApoyoAbstracta;
import abstracts.EstructuraAbstracta;
import abstracts.RespaldarAbstracta;
import abstracts.FabricaAbstractaSilla;

/**
 *
 * @author Jorge Andres
 */
public class FabricaConcretaPlastico extends FabricaAbstractaSilla{
    @Override
    public ApoyoAbstracta fabricarApoyo(){
    ApoyoAbstracta apoyo = new ApoyoConcretaPlastico();
    return apoyo;
    }
    
     @Override
    public EstructuraAbstracta fabricarEstructura(){
    EstructuraAbstracta estructura = new EstructuraConcretaPlastico();
    return estructura;
    }
    
    @Override
    public RespaldarAbstracta fabricarRespaldar(){
    RespaldarAbstracta respaldar = new RespaldarConcretaPlastico();
    return respaldar;
    }
    
}
