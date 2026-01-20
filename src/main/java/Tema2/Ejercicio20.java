package Tema2;

import java.util.Scanner;

/*
Escribir un programa en Java que lea un número entero desde teclado y
realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla.
 */
public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();

        int suma = 0;
        for (int i = numero; i < numero + 100; i++) {
            numero += i;
            System.out.println("Sumamos " + i);
        }

        System.out.println("El total es " + suma);

        sc.close();

    }
}
