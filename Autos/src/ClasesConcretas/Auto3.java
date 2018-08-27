/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesAbstractas.AutosBuilder;

/**
 *
 * @author Estudiantes
 */
public class Auto3 extends AutosBuilder {

    @Override
    public void buildLlantas() {
        this.auto.setLlantas(6);
    }

    @Override
    public void buildChasis() {
        this.auto.setChasis(7);
    }

    @Override
    public void buildPuertas() {
        this.auto.setLlantas(3);
    }

    @Override
    public void buildMotor() {
        this.auto.setLlantas(6);
    }
    
}
