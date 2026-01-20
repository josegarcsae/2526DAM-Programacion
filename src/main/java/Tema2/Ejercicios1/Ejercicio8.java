package Tema2.Ejercicios1;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Escribir un programa en Java que imprima por pantalla
        // los números pares entre el 5 y el 15.000

        for (int i = 5; i <= 15000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
