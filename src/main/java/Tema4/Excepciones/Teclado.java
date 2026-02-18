package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero");
            int numero = sc.nextInt();
            System.out.println("El numero es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un número");
        } finally {
            System.out.println("Esto siempre se ejecuta, cerramos el scanner");
            sc.close();
        }
    }
}
