package Tema4.Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual: " + fecha);
        LocalDate fechaPosterior = fecha.plusDays(5);
        System.out.println("Fecha nueva: " + fechaPosterior);

        System.out.println(fecha.isAfter(fechaPosterior));

        LocalDateTime fechaCompleta = LocalDateTime.now();
        System.out.println("Fecha con hora: " + fechaCompleta);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha formateada: " + formato.format(fechaCompleta));

    }
}
