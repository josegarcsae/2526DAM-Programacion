package Tema3.Geometria;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public String toString() {
        return "Un circulo de radio " + radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

}
