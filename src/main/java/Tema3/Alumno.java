package Tema3;

public class Alumno {

    private String nombre;
    private String apellidos;
    private int numMatricula;

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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
}
