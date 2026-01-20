package Tema3.RepasoEjercicios;

public class Socio {

    static int contadorSocios = 0;

    private String nombre;
    private int id;

    public Socio(String nombre) {
        this.nombre = nombre;
        contadorSocios++;
        this.id = contadorSocios;
    }

    public static int getContadorSocios() {
        return contadorSocios;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
