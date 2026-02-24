package Tema4.Repaso.EmpresaTransporte;

public class Camion extends Vehiculo {
    private double cargaActual;
    private double capacidadMaxima;

    public Camion(String matricula, double kilometrosRecorridos, double combustibleRestante, double cargaActual) {
        super(matricula, kilometrosRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }

    public Camion(double kilometrosRecorridos, double combustibleRestante, double cargaActual) {
        super(kilometrosRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }

    // tiene un consumo de 0.1 litros/km + 0.01 litros por cada 1000 kg
    public void viajar(double distancia) throws SinCombustibleException {
        // Calculamos el consumo
        double consumo = 0.1 * distancia;
        consumo += 0.01 * cargaActual / 1000;
        // Restamos el consumo al combustible restante
        combustibleRestante -= consumo;
    }

}
