package Tema2.PruebasDePruebas;

public class Calculadora {

    public static double suma(double a, double b) {
        return a + b;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static double divide(int dividendo, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        return (double) dividendo / divisor;
    }

}
