package Tema5.ordenacion;

import java.util.*;

public class RepasoUtilidades {
    public static void main(String[] args) {
        // --- PARTE A: Utilidades de java.util.Arrays ---
        // 1. Creamos un array estático de productos.
        Producto[] stockArray = {
                new Producto("TV-02", "TV Samsung", 800.0),
                new Producto("LAV-01", "Lavadora LG", 450.0),
                new Producto("PC-03", "PC Gaming", 1200.0)
        };

        // TODO: TAREA 3 - Usar Arrays.toString() para imprimir el array original.
        System.out.println(Arrays.toString(stockArray));

        // TODO: TAREA 4 - Ordenar el array usando Arrays.sort().
        Arrays.sort(stockArray);
        System.out.println("ORDENADO :: " + Arrays.toString(stockArray));

        // TODO: TAREA 5 - Realizar una búsqueda binaria con Arrays.binarySearch().
        // Buscad el producto con ID "LAV-01" (recordad que el array debe estar ordenado).
        int indice = Arrays.binarySearch(stockArray, new Producto("LAV-01", null, 0));
        Producto buscado =  stockArray[indice];
        System.out.println("LAV-01 :: " + buscado);

        // --- PARTE B: Utilidades de java.util.Collections ---
        // Convertimos el array a una lista para tener más flexibilidad.
        List<Producto> listaProductos = new ArrayList<>(Arrays.asList(stockArray));

        // TODO: TAREA 6 - Añadir estos nuevos productos a la lista de golpe usando Collections.addAll().
        // Productos: "MICRO-04" (150€) y "TAB-05" (300€).
        listaProductos.addAll(Arrays.asList(
                new Producto("MICRO-04", "Microondas", 150),
                new Producto("TAB-05", "Microondas", 300)
        ));
        System.out.println(listaProductos);

        // TODO: TAREA 7 - Invertir el orden de la lista con Collections.reverse().
        Collections.reverse(listaProductos);
        System.out.println(listaProductos);

        // TODO: TAREA 8 - Desordenar la lista aleatoriamente con Collections.shuffle().
        Collections.shuffle(listaProductos);
        System.out.println(listaProductos);

        // TODO: TAREA 9 - Obtener el producto más caro y el más barato usando
        // Collections.max() y Collections.min() con un Comparator por precio.
        Comparator<Producto> comparador = new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Double.valueOf(o1.getPrecio()).compareTo(o2.getPrecio());
            }
        };
        Producto caro = Collections.max(listaProductos, comparador);
        Producto barato = Collections.min(listaProductos, comparador);
        System.out.println("CARO :: " + caro);
        System.out.println("BARATO :: " + barato);


        System.out.println("\n--- ESTADO FINAL DE LA LISTA ---");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }
}
