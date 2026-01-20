package Tema3.Punto;

public class Punto {

    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto (" + x + "," + y + ")";
    }

    public double distancia(Punto otroPunto) {
        double distancia = Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2));
        return distancia;
    }

}
