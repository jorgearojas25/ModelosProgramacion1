package ClasesConcretas;

public class Auto {
    
    private int llantas;
    private int chasis;
    private int puertas;
    private int motor;

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String toString(){
        return "El auto tiene: "+llantas+ " el chasis N°: "+chasis+" y un numero de puertas "+puertas+" y el motor N°: "+motor;
    }
}
