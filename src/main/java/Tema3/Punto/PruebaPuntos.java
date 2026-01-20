package Tema3.Punto;

public class PruebaPuntos {
    public static void main(String[] args) {

        Punto puntoA = new Punto(100, 200);
        Punto puntoB = new Punto(400, 800);
        double distancia = puntoA.distancia(puntoB);
        System.out.println("La distancia sería: " + distancia);

    }
}
