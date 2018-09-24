/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;


public interface Motor { //IMPLEMENTADOR
    
    public abstract void prender();
    
    public abstract void apagar();
    
    public abstract void aumentaRevoluciones();
    
    public abstract void reducirRevoluciones();
}
