package Tema4.Ejercicio2;

public class Coche extends VehiculoConMotor {

    private int puertas;

    public Coche(String modelo, String combustible, int puertas) {
        super(modelo, combustible);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche con " + puertas + " puertas" + super.toString();
    }
}
