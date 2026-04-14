package Tema5.Lambdas;

import java.util.Comparator;
import java.util.List;

public class Ej5 {
    public static void main(String[] args) {
        List<Double> precios = List.of(19.99, 5.50, 45.0, 120.95, 89.0, 2.30);

        // Cuáles son los 3 productos más caros
        List<Double> masCaros = precios.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(masCaros);
        List<Long> masCarosRedondeado = precios.stream()
                .map(Math::round)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(masCarosRedondeado);


    }
}
