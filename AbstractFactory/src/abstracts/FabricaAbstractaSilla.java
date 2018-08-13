/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package abstracts;

/**
 *
 * @author Jorge Andres
 */
public abstract class FabricaAbstractaSilla {
    ApoyoAbstracta apoyo;
    EstructuraAbstracta estructura;
    RespaldarAbstracta respaldar;
    
    public abstract ApoyoAbstracta fabricarApoyo();
    
    public abstract EstructuraAbstracta fabricarEstructura();
    
    public abstract RespaldarAbstracta fabricarRespaldar();
    
    
}
