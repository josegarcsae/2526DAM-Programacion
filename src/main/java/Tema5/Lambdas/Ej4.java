package Tema5.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Ej4 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        OptionalDouble media = numeros.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("suma :: " + suma);
        System.out.println("media :: " + (media.isPresent() ? media.getAsDouble() : "no hay datos"));

    }
}
