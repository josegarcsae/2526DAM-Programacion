package Tema4.Ejercicio1;

public class MainFiguras {
    public static void main(String[] args) {
//        Figura figura = new Figura();
//        System.out.println(figura);

        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println(cuadrado);

        Circulo circulo1 = new Circulo(3);
        System.out.println(circulo1);
        System.out.println(circulo1.area());

        Figura circuloCamuflado = (Figura) circulo1;
        System.out.println(circuloCamuflado.perimetro());

        Figura[] figuras = new Figura[4];
        figuras[0] = cuadrado;
        figuras[1] = circuloCamuflado;

    }
}
