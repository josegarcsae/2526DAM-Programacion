package Tema3;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private String apellidos;
    private int numMatricula;

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno(String nombre, String apellidos, int numMatricula) {
        this(nombre, apellidos);
        this.numMatricula = numMatricula;
    }

    public String toString() {
        String apellidosSiHay = this.apellidos != null ? " " + this.apellidos : "";
        String numMatriculaSiHay = this.numMatricula > 0 ? String.valueOf(this.numMatricula) : "no tiene matricula";
        return this.nombre + apellidosSiHay + " " + numMatriculaSiHay;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return numMatricula == alumno.numMatricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numMatricula);
    }
}
