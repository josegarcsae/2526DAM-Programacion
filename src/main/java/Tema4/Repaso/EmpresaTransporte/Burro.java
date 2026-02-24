package Tema4.Repaso.EmpresaTransporte;

public class Burro implements Transportable {
    private String nombre;
    private double energiaRestante;
    private double carga;

    public Burro(String nombre, double energiaRestante, double carga) {
        this.nombre = nombre;
        this.energiaRestante = energiaRestante;
        this.carga = carga;
    }

    public void descansar() {
        this.energiaRestante = 100;
    }

    public void viajar(double distancia) throws SinCombustibleException {
        double consumo = distancia * 3;
        if (consumo > this.energiaRestante)
            throw new SinCombustibleException("El burro no puede más");
        this.energiaRestante -= consumo;
    }
}
