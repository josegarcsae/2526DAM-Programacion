package Tema1;

import java.util.Scanner;

public class PruebaDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un número y te doy el doble");
            numero = sc.nextInt();
            System.out.println("El doble de " + numero + " es " + numero * 2);
        } while (numero != 0);


    }
}
