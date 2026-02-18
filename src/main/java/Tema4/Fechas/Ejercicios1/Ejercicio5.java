package Tema4.Fechas.Ejercicios1;

import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

/**
 * Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias) que introduzca el usuario.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora inicio (HH:mm): ");
        LocalTime inicio = LocalTime.parse(sc.next());
        System.out.print("Hora fin (HH:mm): ");
        LocalTime fin = LocalTime.parse(sc.next());
        sc.close();
        
        Duration duracion = Duration.between(inicio, fin);
        long horas = duracion.toHours();
        long minutos = duracion.toMinutesPart(); // Solo la parte de minutos restante
        
        System.out.println("La clase dura: " + horas + " horas y " + minutos + " minutos.");
    }
}