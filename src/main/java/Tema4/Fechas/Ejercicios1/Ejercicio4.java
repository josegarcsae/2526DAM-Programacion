package Tema4.Fechas.Ejercicios1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Crea una función que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.
 */

public class Ejercicio4 {
    public static boolean esFinDeSemana(LocalDate fecha) {
        DayOfWeek dia = fecha.getDayOfWeek();
        return dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("¿Es hoy fin de semana?: " + (esFinDeSemana(hoy) ? "Sí" : "No"));
    }
}