package Tema4.Fechas.Ejercicios3;

import java.time.*;

public class ViajeConcierto {

    static ZoneId ZONE_MADRID = ZoneId.of("Europe/Madrid");
    static ZoneId ZONE_LONDRES = ZoneId.of("Europe/London");

    public static void main(String[] args) {

        // 1. Salida de Madrid
        ZonedDateTime salidaMadrid = ZonedDateTime.of(2026, 4, 5, 11, 30, 0, 0, ZONE_MADRID);
        
        // 2. Llegada a Londres (Vuelo 2h 15min)
        ZonedDateTime llegadaLondres = salidaMadrid.plusHours(2).plusMinutes(15).withZoneSameInstant(ZONE_LONDRES);
        
        System.out.println("Salida Madrid (Local): " + salidaMadrid.toLocalTime());
        System.out.println("Llegada Londres (Local): " + llegadaLondres.toLocalTime());

        // 3. Llegada al recinto (45 min después)
        ZonedDateTime llegadaRecinto = llegadaLondres.plusMinutes(45);
        LocalTime horaConcierto = LocalTime.of(20, 0);
        
        System.out.println("Llegada al concierto: " + llegadaRecinto.toLocalTime());
        if (llegadaRecinto.toLocalTime().isBefore(horaConcierto)) {
            System.out.println("Resultado: Llegas a tiempo.");
        } else {
            System.out.println("Resultado: Llegas tarde.");
        }

        // 4. Fin del concierto y vuelta
        // Aquí creamos la hora de inicio de concierto
        ZonedDateTime inicioConcierto = ZonedDateTime.of(2026, 4, 5, 20, 0, 0, 0, ZONE_LONDRES);
        ZonedDateTime finConcierto = inicioConcierto.plusHours(2).plusMinutes(30);
        ZonedDateTime llegadaAeropuerto = finConcierto.plusHours(1);
        ZonedDateTime salidaVueloVuelta = ZonedDateTime.of(2026, 4, 5, 23, 45, 0, 0, ZONE_LONDRES);

        System.out.println("\nFin del concierto: " + finConcierto.toLocalTime());
        System.out.println("Llegada al aeropuerto para vuelta: " + llegadaAeropuerto.toLocalTime());
        
        if (llegadaAeropuerto.isBefore(salidaVueloVuelta)) {
            System.out.println("¿Vuelo de vuelta?: Sí, puedes cogerlo.");
            Duration tiempo = Duration.between(llegadaAeropuerto, salidaVueloVuelta);
            if (tiempo.toHours() < 1) {
                // Importante utilizar el toMinutesPart, porque devuelve el resto de las horas, no TODOS los minutos
                System.out.println("¡Corre que tienes menos de una hora! ¡Solo " + tiempo.toMinutesPart() + " minutos!");
            } else {
                System.out.println("Te quedan " + tiempo.toHours() + " horas y " + tiempo.toMinutesPart() + " minutos");
            }
        } else {
            System.out.println("¿Vuelo de vuelta?: No, es demasiado justo o ya ha salido.");
        }
    }
}