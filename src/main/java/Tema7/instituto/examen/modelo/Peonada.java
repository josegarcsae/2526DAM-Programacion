package Tema7.instituto.examen.modelo;

import java.time.LocalDate;

public class Peonada {
    private LocalDate fecha;
    private String nombreEmpleado;
    private String parque;
    private int horas;

    public Peonada(LocalDate fecha, String nombreEmpleado, String parque, int horas) {
        this.fecha = fecha;
        this.nombreEmpleado = nombreEmpleado;
        this.parque = parque;
        this.horas = horas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getParque() {
        return parque;
    }

    public void setParque(String parque) {
        this.parque = parque;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Peonada{" +
                "fecha=" + fecha +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", parque='" + parque + '\'' +
                ", horas=" + horas +
                '}';
    }
}
