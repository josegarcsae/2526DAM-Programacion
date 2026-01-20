package Tema2;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        String cadena = sc.nextLine();

        if ("hola".equals(cadena)) {
            System.out.println("Me ha dicho hola");
        } else {
            System.out.println("Ha dicho otra cosa");
        }


    }
}
