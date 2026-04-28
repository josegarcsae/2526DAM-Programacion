package Tema7.instituto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PruebaFecha {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.parse("15/01/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fecha);

    }
}
