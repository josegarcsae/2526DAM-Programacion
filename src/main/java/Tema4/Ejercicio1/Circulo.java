package Tema4.Ejercicio1;

public class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo de color " + color + " y perimetro " + this.perimetro();
    }

    @Override
    public String perimetro() {
        return "el perimetro es " + 2 * Math.PI * this.radio;
    }

    public String area() {
        return "circulo de area " + Math.PI * this.radio * this.radio;
    }

    public void botar() {
        System.out.println("Botando la pelota");
    }

}
