package Tema4.Ejercicio2;

public class VehiculoConMotor extends Vehiculo {

    private String combustible;

    public VehiculoConMotor(String modelo, String combustible) {
        super(modelo);
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return super.toString() + " que usa " + combustible;
    }
}
