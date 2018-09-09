package ClasesConcretas;

import ClasesAbstractas.AutosBuilder;

public class ModeloA extends AutosBuilder {
    //Varia dependiendo del modelo
    @Override
    public void buildLlantas() {
        this.auto.setLlantas(7);
    }

    @Override
    public void buildChasis() {
        this.auto.setChasis(4);
    }

    @Override
    public void buildPuertas() {
        this.auto.setPuertas(0);
    }

    @Override
    public void buildMotor() {
        this.auto.setMotor(8);
    }
    
}
