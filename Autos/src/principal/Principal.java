package principal;

import ClasesConcretas.*;


public class Principal {
    

    public static void main(String[] args) {
        
        Ensamblador cliente1 = new Ensamblador(new ModeloB());
        cliente1.construirAuto();
        System.out.println(cliente1.getAuto());
        
        Ensamblador cliente2 = new Ensamblador(new ModeloC());
        cliente2.construirAuto();
        System.out.println(cliente2.getAuto());
       
        
        Ensamblador cliente3 = new Ensamblador(new ModeloA());
        cliente3.construirAuto();
        System.out.println(cliente3.getAuto());
      
        
    }
    
}
