/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;
import Prototipos.*;


/**
 *
 * @author GOLDS
 */
public class Folder {
    public HojaPrototipo hoja;
    public SeparadorPrototipo separador;
    public String diseño;

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public HojaPrototipo getHoja() {
        return hoja;
    }

    public void setHoja(HojaPrototipo hoja) {
        this.hoja = hoja;
    }

    public SeparadorPrototipo getSeparador() {
        return separador;
    }

    public void setSeparador(SeparadorPrototipo separador) {
        this.separador = separador;
    }
    
    public double getAltoHoja(){
        double alto = getHoja().getAlto();
        return alto;
    }
    public void setAltoHoja(int alto){
        getHoja().setAlto(alto);
    }
    public double getAnchoHoja(){
        double alto = getHoja().getAncho();
        return alto;
    }
    public void setAnchoHoja(int alto){
        getHoja().setAncho(alto);
    }
    public double getAltoSeparador(){
        double altoS = getSeparador().getAltoS();
        return altoS;
    }
    public void setAltoSeparador(int altoS){
        getSeparador().setAltoS(altoS);
    }
    public double getAnchoSeparador(){
        double anchoS = getSeparador().getAnchoS();
        return anchoS;
    }
    public void setAnchoSeparador(int anchoS){
        getSeparador().setAnchoS(anchoS);
    }
}
