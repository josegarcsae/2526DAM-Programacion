package Tema4.Fechas.Ejercicios1;

import java.time.LocalDate;
import java.time.DayOfWeek;

/**
 * Crea un programa que cuente cuántos días laborables (lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 4, 15);
        int laborables = 0;
        
        LocalDate aux = inicio;
        while (!aux.isAfter(fin)) {
            DayOfWeek dia = aux.getDayOfWeek();
            if (dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY) {
                laborables++;
            }
            aux = aux.plusDays(1);
        }
        // Esto es optimizable, PERO complicado de programar
        // Habría que ver si podemos ir saltando semanas completas y así sumamos de 5 en 5

        
        System.out.println("Días laborables entre " + inicio + " y " + fin + ": " + laborables);
    }
}