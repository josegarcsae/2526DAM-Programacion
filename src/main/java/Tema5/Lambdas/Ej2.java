package Tema5.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(List.of("ana", "luis", "guzmán", "marta"));

        List<String> nombresEnMayuscula = nombres.stream()
                .map(String::toUpperCase) // Lo mismo que poner cadena -> cadena.toUpperCase()
                .toList();
        System.out.println(nombresEnMayuscula);

    }
}
