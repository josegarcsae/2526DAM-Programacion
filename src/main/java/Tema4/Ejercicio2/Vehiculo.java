package Tema4.Ejercicio2;

public class Vehiculo {

    private String modelo;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " y es un " + modelo;
    }
}
