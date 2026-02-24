package Tema4.Repaso.EmpresaTransporte;

public class Autobus extends Vehiculo {

    private int pasajerosActuales;
    private int capacidadMaxima;

    public Autobus(double kilometrosRecorridos, double combustibleRestante) {
        super(kilometrosRecorridos, combustibleRestante);
    }

    public void viajar(double distancia) throws SinCombustibleException {

    }
}
