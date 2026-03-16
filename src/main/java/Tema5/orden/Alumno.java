package Tema5.orden;

import java.time.LocalDate;

public class Alumno implements Comparable<Alumno> {

    String nombre;
    String apellidos;
    LocalDate fechaNacimiento;
    int alturaEnCm;

    public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, int alturaEnCm) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.alturaEnCm = alturaEnCm;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", alturaEnCm=" + alturaEnCm +
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.fechaNacimiento.compareTo(o.fechaNacimiento);
    }
}
