package Tema4.Fechas.Ejercicios3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlanificacionProyecto {

    public static void main(String[] args) {
        // 1. FECHA DE INICIO
        // Suponiendo que hoy es 27/02/2026 (Viernes), el próximo lunes es 02/03/2026
        LocalDate inicioProyecto = LocalDate.of(2026, 3, 2);
        
        // 2. CÁLCULO DE LAS FASES
        // Es importante ser riguroso con tener bien nombradas las variables.
        // Así, tenemos una fecha inicio y otra fin para cada fase.
        // Entre el fin de una y el inicio de otra salta un día laborable.

        // FASE 1: Análisis (5 días laborables)
        LocalDate finFase1 = calcularFechaFin(inicioProyecto, 5);
        
        // FASE 2: Desarrollo (15 días laborables)
        LocalDate inicioFase2 = siguienteDiaLaborable(finFase1);
        LocalDate finFase2 = calcularFechaFin(inicioFase2, 15);
        
        // FASE 3: Pruebas (7 días laborables)
        LocalDate inicioFase3 = siguienteDiaLaborable(finFase2);
        LocalDate finFase3 = calcularFechaFin(inicioFase3, 7);

        // 3. MOSTRAR RESULTADOS
        System.out.println("CALENDARIO DE PROYECTO - FEBRERO/MARZO 2026");
        System.out.println("===========================================");
        System.out.println("FASE 1 (Análisis):   " + inicioProyecto + " al " + finFase1);
        System.out.println("FASE 2 (Desarrollo): " + inicioFase2 + " al " + finFase2);
        System.out.println("FASE 3 (Pruebas):    " + inicioFase3 + " al " + finFase3);
        System.out.println("===========================================");

        // 4. COMPROBACIÓN DE ENTREGA (Límite 15/03/2026)
        LocalDate fechaLimite = LocalDate.of(2026, 3, 15);
        
        // Usamos !isAfter para incluir el propio día 15 como válido
        if (!finFase3.isAfter(fechaLimite)) {
            System.out.println("ESTADO: ¡Entregado a tiempo!");
        } else {
            System.out.println("ESTADO: ¡Hay que darse prisa!");
        }

        // 5. BONUS: DÍAS NATURALES
        long diasNaturales = ChronoUnit.DAYS.between(inicioProyecto, finFase3) + 1;
        System.out.println("DURACIÓN TOTAL: " + diasNaturales + " días naturales.");
    }

    /**
     * Calcula la fecha de fin sumando días laborables.
     * Si dura 5 días y empieza un lunes, termina el viernes de esa semana.
     */
    public static LocalDate calcularFechaFin(LocalDate inicio, int diasLaborables) {
        LocalDate fecha = inicio;
        int cont = 1; 
        while (cont < diasLaborables) {
            fecha = fecha.plusDays(1);
            if (esLaborable(fecha)) {
                // Solo sumamos dias si es laborable
                cont++;
            }
        }
        return fecha;
    }

    /**
     * Busca el primer día laborable después de la fecha indicada.
     */
    public static LocalDate siguienteDiaLaborable(LocalDate fecha) {
        LocalDate siguiente = fecha.plusDays(1);
        while (!esLaborable(siguiente)) {
            siguiente = siguiente.plusDays(1);
        }
        return siguiente;
    }

    /**
     * Verifica si es lunes, martes, miércoles, jueves o viernes.
     * Se crea este método porque la misma funcionalidad existe en los dos métodos previos.
     */
    public static boolean esLaborable(LocalDate fecha) {
        DayOfWeek dia = fecha.getDayOfWeek();
        return dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY;
    }
}