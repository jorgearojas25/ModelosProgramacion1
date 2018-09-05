package ClasesConcretas;

import ClasesAbstractas.AutosBuilder;

public class ModeloA extends AutosBuilder {
    
    @Override
    public void buildLlantas() {
        this.auto.setLlantas(2);
    }

    @Override
    public void buildChasis() {
        this.auto.setChasis(4);
    }

    @Override
    public void buildPuertas() {
        this.auto.setLlantas(0);
    }

    @Override
    public void buildMotor() {
        this.auto.setLlantas(8);
    }
    
}
