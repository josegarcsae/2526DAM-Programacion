package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaConScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numero = sc.nextInt();
            System.out.println(numero);
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un entero");
        } finally {
            sc.close();
        }
    }
}
