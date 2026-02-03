package Tema4.Ejercicio1;

public class MainFiguras {
    public static void main(String[] args) {
//        Figura figura = new Figura();
//        System.out.println(figura);

        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println(cuadrado);

        Circulo circulo = new Circulo(3);
        System.out.println(circulo);
        System.out.println(circulo.area());

        Figura circuloCamuflado = (Figura) circulo;
        System.out.println(circuloCamuflado.perimetro());

        Figura[] figuras = new Figura[4];
        figuras[0] = cuadrado;
        figuras[1] = circulo;
        for (int i = 0; i < figuras.length; i++) {
            Figura f =  figuras[i];
            if (f instanceof Circulo) {
//                Circulo c = (Circulo) f;
//                c.botar();
                ((Circulo) f).botar();
            }

        }

    }
}
