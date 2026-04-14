package Tema5.Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ej3 {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>(List.of("Java", "Stream", "Código", "DAM"));

        Optional<String> optionalPalabraMasLarga = palabras.stream()
                .max(Comparator.comparing(String::length));

        String palabraMasLarga = optionalPalabraMasLarga.orElse("");
        System.out.println(palabraMasLarga);

        if (optionalPalabraMasLarga.isPresent()) {
            System.out.println("El optional tiene valor");
        }

    }
}
