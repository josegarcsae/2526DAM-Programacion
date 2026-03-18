package Tema5.videojuegos;

import java.util.*;

public class MainVideojuegos {
    public static void main(String[] args) {

        // calcular videojuego más vendido
        // Map<UUID, Double> aquí guardamos los valores de venta de cada juego

        List<Venta> ventas = new ArrayList<>();

        Map<UUID, Double> ventasPorVideojuego = new HashMap<>();
        for (Venta venta : ventas) {
            for (Videojuego vi : venta.getVideojuegos()) {

                if (ventasPorVideojuego.containsKey(vi.getCodigo())) {
                    double valorAntiguo = ventasPorVideojuego.get(vi.getPrecio());
                    ventasPorVideojuego.put(vi.getCodigo(), valorAntiguo + vi.getPrecio());
                } else {
                    ventasPorVideojuego.put(vi.getCodigo(), vi.getPrecio());
                }

            }
        }


    }
}
