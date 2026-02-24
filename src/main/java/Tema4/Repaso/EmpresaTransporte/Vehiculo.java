package Tema4.Repaso.EmpresaTransporte;

public abstract class Vehiculo implements Transportable {
    protected String matricula;
    protected double kilometrosRecorridos;
    protected double combustibleRestante;

    public Vehiculo(double kilometrosRecorridos, double combustibleRestante) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.combustibleRestante = combustibleRestante;
    }

    public Vehiculo(String matricula, double kilometrosRecorridos, double combustibleRestante) {
        this(kilometrosRecorridos, combustibleRestante);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public double getCombustibleRestante() {
        return combustibleRestante;
    }
}
