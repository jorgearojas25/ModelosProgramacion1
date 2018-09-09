package ClasesConcretas;

import ClasesAbstractas.AutosBuilder;

public class ModeloB extends AutosBuilder{

    @Override
    public void buildLlantas() {
        this.auto.setLlantas(4);
    }

    @Override
    public void buildChasis() {
        this.auto.setChasis(8);
    }

    @Override
    public void buildPuertas() {
        this.auto.setPuertas(2);
    }

    @Override
    public void buildMotor() {
        this.auto.setMotor(4);
    }

    
}
