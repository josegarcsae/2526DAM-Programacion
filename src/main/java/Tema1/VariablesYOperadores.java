package Tema1;

public class VariablesYOperadores {

    public static void main(String[] args) {

        System.out.println("hola Juan Carlos y Natalia");

        int edad = 24; // Declarando la variable y asignando un valor

        int otraEdad; // Declaramos
        otraEdad = 22; // Asignamos (inicializamos)

        byte edadPequeña = 104;

        int precioVideojuego = 60;
        float precioRealVideojuego = (float) 79.99;
        System.out.println(precioRealVideojuego);

        int precioEntero = (int) precioRealVideojuego;
        System.out.println(precioEntero);

        char letra = 'p';
        System.out.println(letra);
        System.out.println((short) letra);

        String nombre = "guzman";
        System.out.println(nombre);
        System.out.println("El nombre del profesor es " + nombre.toUpperCase());

        // Operadores aritméticos
        // + - * / %
        int numero = 3;
        double mitad = numero / (double) 2;
        System.out.println("La mitad de " + numero + " es " + mitad);

        int numero2 = 12;
        int restoEntreSiete = numero2 % 7;
        System.out.println(restoEntreSiete);

        boolean mayorEdad = true;

        // RELACIONALES
        // > >= < <= != ==
        int dinero = 14;
        int precioCocaCola = 2;
        boolean puedoComprar = dinero > precioCocaCola;

        int cocaColasTomadas = 2;
        cocaColasTomadas++; // Incremento en 1
        cocaColasTomadas += 3; // Incremento en 3


    }

}
