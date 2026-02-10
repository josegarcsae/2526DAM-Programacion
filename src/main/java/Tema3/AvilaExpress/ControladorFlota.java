package Tema3.AvilaExpress;

public class ControladorFlota {
    public static void main(String[] args) {
        //Declaramos el array
        NaveEspacial[] flotaNaves = {
                new NaveEspacial("Nave1"),
                new NaveEspacial("Nave 2"),
                new NaveEspacial("Nave 3", 10.00),
                new NaveEspacial("Nave 4", 3),
                new NaveEspacial("Nave 5", 4)
        };

        // Hacemos viajar a las 2 primeras naves
        flotaNaves[0].viajar(30);
        flotaNaves[1].viajar(60);

        //Mostramos los datos
        for (NaveEspacial n : flotaNaves) {
            n.mostrarEstado();
            System.out.println();
        }

        //Repostamos las naves que hayan viajado
        for (NaveEspacial n : flotaNaves) {
            if (n.getCombustible() < 100) {
                n.repostar();
            }
        }

        //Mostramos los datos
        for (NaveEspacial n : flotaNaves) {
            n.mostrarEstado();
            System.out.println();
        }

        //Calculamos cuál tiene más carburante
        NaveEspacial naveConMasCarburante = flotaNaves[0]; // Empezamos asumiendo que es la primera
        for (NaveEspacial nave : flotaNaves) {
            // Si la nave actual tiene más combustible que nuestra nave de referencia...
            if (nave.getCombustible() > naveConMasCarburante.getCombustible()) {
                // ...entonces esta nave es nuestra nueva "nave con más energía"
                naveConMasCarburante = nave;
            }
        }

        System.out.println("\n--- REPORTE DE ENERGÍA ---");
        System.out.println("La nave con mayor reserva es: " + naveConMasCarburante.getNombre() +
                " con un " + naveConMasCarburante.getCombustible() + "% de combustible.");

    }


}
