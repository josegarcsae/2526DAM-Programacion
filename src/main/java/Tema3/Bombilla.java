package Tema3;

public class Bombilla {
    boolean encendida;
    String casquillo;
    int temperatura;

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public String estado() {
        return this.encendida ? "encendida" : "apagada";
    }

}
