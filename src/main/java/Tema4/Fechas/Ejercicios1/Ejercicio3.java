package Tema4.Fechas.Ejercicios1;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Escribe un programa que muestre la hora actual en España ("Europe/Madrid"),
 * Japón ("Asia/Tokyo") y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z".
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        // Con arrays para que practiqueis
        String[] zonas = {"Europe/Madrid", "Asia/Tokyo", "America/Mexico_City"};

        for (String zona : zonas) {
            ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zona));
            System.out.println(zona + ": " + zdt.format(fmt));
        }
    }
}