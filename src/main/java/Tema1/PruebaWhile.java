package Tema1;

import java.util.Scanner;

public class PruebaWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero != 0) {
            System.out.println("Introduce un número y te doy el doble");
            numero = sc.nextInt();
            System.out.println("El doble de " + numero + " es " + numero * 2);
        }


    }
}
