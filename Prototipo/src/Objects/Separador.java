/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author GOLDS
 */
public class Separador {
    
    private String color;
    private double altoS;
    private double anchoS;
    
    public Separador(double altoS, double anchoS){
        setAltoS(altoS);
        setAnchoS(anchoS);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltoS() {
        return altoS;
    }

    public void setAltoS(double altoS) {
        this.altoS = altoS;
    }

    public double getAnchoS() {
        return anchoS;
    }

    public void setAnchoS(double anchoS) {
        this.anchoS = anchoS;
    }
   
}
