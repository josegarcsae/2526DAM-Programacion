package Tema2.Ejercicios1;

// Programa Java que lea un número entero y calcule si es par o impar.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Es CERO");
        } else if (numero < 0) {
            System.out.println("Es NEGATIVO");
        }

        if (numero % 2 == 0) {
            System.out.println("Es ... PAR");
        } else {
            System.out.println("Es ... IMPAR");
        }

        scanner.close();

    }
}
