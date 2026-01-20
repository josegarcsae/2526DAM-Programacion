package Tema2;

/*
Crea una función RECURSIVA que obtenga la suma de N números.
N se pasa como parámetro.
La suma va de N a 1.
 */

public class Recursividad1 {

    public static void main(String[] args) {
        String hola = "hola";

        cadenilla(hola);

    }

    static void cadenilla(String cadena) {
        System.out.println(cadena.charAt(0));
        String subcadena = cadena.substring(1);
        if (subcadena.length() > 0) {
            cadenilla(subcadena);
        }
    }


}
