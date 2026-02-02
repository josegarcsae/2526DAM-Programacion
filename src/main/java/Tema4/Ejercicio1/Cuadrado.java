package Tema4.Ejercicio1;

public class Cuadrado extends Figura {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public String toString() {
        return "cuadrado de color " + color  + " y lado " + lado + " y de perimetro " + this.perimetro();
    }

    @Override
    public String perimetro() {
        return "el perimetro es de " + lado * 4;
    }
}
