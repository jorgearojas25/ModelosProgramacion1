package ClasesConcretas;

import ClasesAbstractas.AutosBuilder;

public class Ensamblador {
    
    private AutosBuilder ensamblarAuto;
    
    public Ensamblador(AutosBuilder auto){
        this.ensamblarAuto = auto;
    }
    
    public void construirAuto(){
        ensamblarAuto.construirAuto();
        ensamblarAuto.buildLlantas();
        ensamblarAuto.buildChasis();
        ensamblarAuto.buildPuertas();
        ensamblarAuto.buildMotor();
    }
    
    public Auto getAuto(){
        return ensamblarAuto.getAuto();
    }
    
}
