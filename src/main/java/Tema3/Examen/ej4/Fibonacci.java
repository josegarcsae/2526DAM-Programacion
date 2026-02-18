package Tema3.Examen.ej4;

public class Fibonacci {

    private int numero;

    public Fibonacci(int numero) {
        this.numero = numero;
    }

    static int[] fibonaccis = new int[50];
    static {
        fibonaccis[0] = 1;
        fibonaccis[1] = 1;
        for (int i = 0; i < 48; i++) {
            fibonaccis[i+2] = fibonaccis[i+1] + fibonaccis[i];
        }
    }

    public boolean esFibonacci() {
        for (int valor : fibonaccis) {
            if (valor == this.numero) {
                return true;
            }
        }
        return false;
    }

    public Fibonacci siguiente() {
        if (esFibonacci()) {
            int posicion = posicion();
            if (posicion < 50)
                return new Fibonacci(fibonaccis[posicion + 1]);
        }
        return null;
    }

    public int posicion() {
        for (int i = 0; i <= this.numero; i++) {
            if (fibonaccis[i] == this.numero) {
                return i;
            }
        }
        return 0;
    }

}
