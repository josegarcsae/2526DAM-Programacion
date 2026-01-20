package Tema2.EjerciciosFunciones;

/*
Implementa un método recursivo que determine si un número es primo.
 */

public class Eje1_primo {

    public static void main(String[] args) {

        int numeroAComprobar = 21;
        boolean esPrimo = esPrimoNoRecursivo(numeroAComprobar);
        System.out.println(numeroAComprobar + (esPrimo ? " es primo" : " no es primo"));

    }

    static boolean esPrimoNoRecursivo(int numero) {
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    
}


