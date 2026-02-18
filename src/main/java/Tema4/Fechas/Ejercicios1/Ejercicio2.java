package Tema4.Fechas.Ejercicios1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Crea un programa que pida al usuario su fecha de nacimiento (día y mes)
 * y calcule cuántos días faltan para su próximo cumpleaños desde hoy (02/04/2025).
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate hoy = LocalDate.of(2025, 4, 2);

        System.out.print("Introduce tu día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();
        sc.close();

        LocalDate cumple = LocalDate.of(hoy.getYear(), mes, dia);

        // Si el cumple ya pasó este año, calculamos para el año que viene
        if (cumple.isBefore(hoy) || cumple.isEqual(hoy)) {
            cumple = cumple.plusYears(1);
        }

        long diasFaltan = ChronoUnit.DAYS.between(hoy, cumple);
        System.out.println("Faltan " + diasFaltan + " días para tu próximo cumpleaños.");

        // Usamos Period para obtener la diferencia en meses y días
        // Cuidado, si pedimos solo los días no devuelve los meses
        Period diferencia = Period.between(hoy, cumple);

        System.out.println("Faltan " + diferencia.getMonths() + " meses y "
                + diferencia.getDays() + " días para tu cumple.");

    }
}
