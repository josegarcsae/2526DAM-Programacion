package Tema5.analizadorCiberseguridad;

import java.util.*;

public class OperacionAlonso {
    public static void main(String[] args) {
        // 1. DATASET INICIAL (Simulación de JSON/NoSQL)
        // Cada mapa representa un evento: {id, zona, tipo, autorizado}
        List<Map<String, Object>> eventosBrutos = new ArrayList<>();

        eventosBrutos.add(new HashMap<>(Map.of("id", 1, "zona", "Almacen", "tipo", "Puerta", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 2, "zona", "Servidores", "tipo", "Login", "autorizado", true)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 1, "zona", "Almacen", "tipo", "Puerta", "autorizado", false))); // DUPLICADO
        eventosBrutos.add(new HashMap<>(Map.of("id", 3, "zona", "Servidores", "tipo", "Login", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 4, "zona", "Oficinas", "tipo", "Wifi", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 3, "zona", "Servidores", "tipo", "Login", "autorizado", false))); // DUPLICADO
        eventosBrutos.add(new HashMap<>(Map.of("id", 5, "zona", "Servidores", "tipo", "Login", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 6, "zona", "Almacen", "tipo", "CajaFuerte", "autorizado", false)));

        // Diccionario de Límites (Zona -> Intentos fallidos permitidos)
        Map<String, Integer> limitesZona = Map.of(
                "Servidores", 1,
                "Almacen", 2,
                "Oficinas", 5
        );

        // --- INICIO DE TRANSFORMACIONES ---

        // T1: Limpieza de Duplicados (Set de Mapas)
        // Al ser Mapas, el Set compara si tienen las mismas llaves y valores
        Set<Map<String, Object>> eventosUnicos = new HashSet<>(eventosBrutos);


        // T2: Agrupación Anidada: Zona -> { TipoAcceso -> Conteo de Fallos }
        // Solo procesar si "autorizado" es false.
        Map<String, Map<String, Integer>> mapaFallos = new HashMap<>();
        // TODO: Rellenar mapaFallos. Ejemplo: "Servidores" -> {"Login": 2}
        for (Map<String, Object> evento : eventosUnicos) {
            // Metemos la información en variables (mejora presentación)
            String zona = evento.get("zona").toString();
            String tipo = evento.get("tipo").toString();
            // Comprobamos si existe la zona, sino, la creamos
            if (!mapaFallos.containsKey(zona))
                mapaFallos.put(zona, new HashMap<>());
            // Comprobamos si existe el tipo de acceso en la zona correspondiente
            Map<String, Integer> zonaTipos = mapaFallos.get(zona);
            if (!zonaTipos.containsKey(tipo))
                zonaTipos.put(tipo, 1);
            else
                zonaTipos.put(tipo, zonaTipos.get(tipo) + 1);
        }

        // T3: Detección de Brechas de Seguridad (List)
        // Si el total de fallos de una zona en 'mapaFallos' > limite en 'limitesZona'
        List<String> zonasComprometidas = new ArrayList<>();
        // TODO: Recorrer mapaFallos, sumar sus valores y comparar con limitesZona
        for (String zona : mapaFallos.keySet()) {
            int max = limitesZona.getOrDefault(zona, 0);
            int sum = 0;
            // Buscamos directamente en los valores, no nos hace falta el tipo
            for (Integer valor : mapaFallos.get(zona).values()) {
                sum += valor;
            }
            // Si la suma supera el máximo
            if (sum > max)
                zonasComprometidas.add(zona);
        }

        // T4: Ranking de Tipos de Ataque (Map)
        // Queremos saber qué 'tipo' es el más usado en los fallos (conteo global)
        Map<String, Integer> frecuenciaTipos = new TreeMap<>();
        // TODO: Contar cuántas veces aparece cada "tipo" en los eventos fallidos únicos
        for (Map<String, Integer> tiposYfallos : mapaFallos.values()) {
            for (String tipo : tiposYfallos.keySet()) {
                if (frecuenciaTipos.containsKey(tipo))
                    frecuenciaTipos.put(tipo, frecuenciaTipos.get(tipo) + tiposYfallos.get(tipo));
                else
                    frecuenciaTipos.put(tipo, tiposYfallos.get(tipo));
            }
        }

        // --- SALIDA DE RESULTADOS ---
        System.out.println("Eventos únicos procesados: " + eventosUnicos.size());
        System.out.println("Mapa de Fallos: " + mapaFallos);
        System.out.println("ZONAS COMPROMETIDAS: " + zonasComprometidas);
        System.out.println("Frecuencia de Tipos de Ataque: " + frecuenciaTipos);
    }
}
