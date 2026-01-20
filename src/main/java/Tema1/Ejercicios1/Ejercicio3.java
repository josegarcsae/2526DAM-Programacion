package Tema1.Ejercicios1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una velocidad para pasar de km/h a m/s");
        double velocidadOrigen = sc.nextInt();

        if (velocidadOrigen >= 0) {
            double decimal = velocidadOrigen * 5 / 18.0;
            System.out.printf("%.0f km/h son %.2f m/s", velocidadOrigen, decimal);
        } else {
            System.out.println("Has metido una velocidad negativa");
        }

    }
}
