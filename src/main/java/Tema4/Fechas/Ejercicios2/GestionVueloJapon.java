package Tema4.Fechas.Ejercicios2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class GestionVueloJapon {

    // Preparamos los formatos y las zonas horarias que vamos a necesitar
    static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    static ZoneId ZONE_MADRID = ZoneId.of("Europe/Madrid");
    static ZoneId ZONE_DOHA = ZoneId.of("Asia/Qatar");
    static ZoneId ZONE_TOKIO = ZoneId.of("Asia/Tokyo");

    public static void main(String[] args) {

        // 1. SALIDA DE MADRID
        ZonedDateTime salidaMadrid = ZonedDateTime.of(2025, 4, 12, 20, 45, 0, 0, ZONE_MADRID);
        System.out.println("Despegue Madrid (Hora Local): " + salidaMadrid.format(FORMATTER));

        // 2. VUELO 1: Madrid -> Doha (6h 45min)
        ZonedDateTime aterrizajeDoha = salidaMadrid.plusHours(6).plusMinutes(45).withZoneSameInstant(ZONE_DOHA);
        System.out.println("Aterrizaje Doha (Hora Local): " + aterrizajeDoha.format(FORMATTER));
        gestionarComunicacion(aterrizajeDoha, "Aterrizaje en Doha");

        // 3. ESCALA Y VUELO 2: Doha -> Haneda (1h escala + 10h 25min vuelo)
        ZonedDateTime salidaDoha = aterrizajeDoha.plusHours(1); // 1h de tránsito
        ZonedDateTime aterrizajeTokio = salidaDoha.plusHours(10).plusMinutes(25).withZoneSameInstant(ZONE_TOKIO);
        
        System.out.println("\nDespegue Doha (Hora Local): " + salidaDoha.format(FORMATTER));
        System.out.println("Aterrizaje Tokio (Hora Local): " + aterrizajeTokio.format(FORMATTER));
        
        // 4. GESTIÓN DE AVISOS
        ZonedDateTime horaEnMadridAlLlegarATokio = aterrizajeTokio.withZoneSameInstant(ZONE_MADRID);
        gestionarComunicacion(horaEnMadridAlLlegarATokio, "Llegada a Tokio");

        // 5. TIEMPO TOTAL DEL VIAJE
        Duration tiempoTotal = Duration.between(salidaMadrid, aterrizajeTokio);
        System.out.println("\nTiempo total de viaje: " + tiempoTotal.toHours() + "h " + tiempoTotal.toMinutesPart() + "min");

        // 6. AVISO FIN DE SEMANA (Sábado o Domingo)
        DayOfWeek diaLlegada = aterrizajeTokio.getDayOfWeek();
        if (diaLlegada == DayOfWeek.SATURDAY || diaLlegada == DayOfWeek.SUNDAY) {
            System.out.println("¡Es " + diaLlegada + "! Enviando WhatsApp a los amigos: '¡Ya estoy en Japón!'");
        }
    }

    /**
     * Función auxiliar para decidir si llamar o mandar WhatsApp según la hora en Madrid
     */
    public static void gestionarComunicacion(ZonedDateTime horaReferencia, String evento) {
        ZonedDateTime horaMadrid = horaReferencia.withZoneSameInstant(ZONE_MADRID);
        int hora = horaMadrid.getHour();
        System.out.print(">>> " + evento + ": En Madrid son las " + horaMadrid.format(DateTimeFormatter.ofPattern("HH:mm")));
        
        if (hora >= 9 && hora <= 22) {
            System.out.println(" -> ¡Puedes llamar a la familia!");
        } else {
            System.out.println(" -> Mejor manda un WhatsApp, están durmiendo.");
        }
    }
}