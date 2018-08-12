/*
 * Proyecto para clase de Programacion Avanzada
 * Universidad Distrital Francisco Jose de Caldas  
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
