package Tema2;

import java.util.Scanner;

public class EjemploExamen {

    public static void main(String[] args) {

        final double PRECIO_INICIAL_SEGURO_COCHE = 500;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("¿Has tenido accidentes? true/false");
        boolean accidentes = scanner.nextBoolean();

        double precioSeguro = calcularSeguro(PRECIO_INICIAL_SEGURO_COCHE, edad, accidentes);
        System.out.println("El precio del seguro sería " + precioSeguro);
        System.out.println("¿Quiere contratarlo? true/false");
        if (scanner.nextBoolean()) {
            contratarSeguro();
        }

        scanner.close();

    }

    static double calcularSeguro(double precioInicial, int edad, boolean accidentes) {

        if (edad >= 18 && edad < 25) {
            //return precioInicial * 20/100 + precioInicial;
            return precioInicial * 1.2;
        } else if (edad > 35 && edad < 55 && !accidentes) {
            return precioInicial * 0.9;
            // return precioInicial - precioInicial * 10/100;
        } else if (edad > 65) {
            if (accidentes) {
                return precioInicial * 1.3;
            } else {
                return precioInicial * 1.1;
            }
//        } else if (edad > 65 && !accidentes) {
//            return precioInicial * 1.1;
//        } else if (edad > 65 && accidentes) {
//            return precioInicial * 1.3;
        }

        return precioInicial;
    }

    static void contratarSeguro() {

    }

}
