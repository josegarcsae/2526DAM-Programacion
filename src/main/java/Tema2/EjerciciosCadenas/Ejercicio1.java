package Tema2.EjerciciosCadenas;

/*
1. Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.
Introduciendo: “Hola a Todos”
Da como salida: “HOLA A TODOS” 8 cambios
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String cadena = "Hola a Todos";
        String cadenaEnMayusculas = cadena.toUpperCase();
        System.out.println("Cadena original :: " + cadena);
        System.out.println("Cadena en mayúsculas :: " + cadenaEnMayusculas);

        // Compruebo los cambios
        int cambios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadenaEnMayusculas.charAt(i))
                cambios++;
        }
        System.out.println("Ha habido " + cambios + " cambios");

    }

}
