package Tema4.Fechas.Ejercicios1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * Escribe un programa que muestre la fecha actual en el formato "Hoy es día, dd de mes de yyyy"
 * (ejemplo: "Hoy es miércoles, 02 de abril de 2025").
 *
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        // Definimos el patrón: EEEE (día semana completo), MMMM (mes completo)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("'Hoy es' EEEE, dd 'de' MMMM 'de' yyyy",
                new Locale("es", "ES"));

        System.out.println(hoy.format(formato));
    }
}
