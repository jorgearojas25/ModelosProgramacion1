
package ClasesAbstractas;

import ClasesConcretas.Auto;


public abstract class AutosBuilder {
    public Auto auto;
    
    public void construirAuto(){
        auto = new Auto();
    }
    
    public abstract void buildLlantas();
    public abstract void buildChasis();
    public abstract void buildPuertas();
    public abstract void buildMotor();

    public Auto getAuto() {
        return auto;
    }

    
}
