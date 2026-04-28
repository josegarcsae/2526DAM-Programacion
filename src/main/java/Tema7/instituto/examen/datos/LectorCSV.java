package Tema7.instituto.examen.datos;

import Tema7.instituto.examen.modelo.Peonada;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    public static List<Peonada> leer() {

        List<Peonada> peonadas = new ArrayList<>();

        try {
            Path fichero = Paths.get("peonadas.csv");
            List<String> lineas = Files.readAllLines(fichero);

            for (int i = 1; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                String[] datos = linea.split(";");

                if (datos.length == 4) {
                    String sFecha = datos[0];
                    String nombre = datos[1];
                    String parque = datos[2];
                    String sHoras = datos[3];
                    int horas = 0;
                    LocalDate fecha = null;

                    try {
                        horas = Integer.parseInt(sHoras);
                        fecha = LocalDate.parse(sFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        // Como ha ido bien, añadimos la peonada al listado
                        peonadas.add(new Peonada(fecha, nombre, parque, horas));
                    } catch (NumberFormatException | DateTimeParseException e) {
                        System.err.println("Linea erronea :: Dato erróneo");
                    }

                } else {
                    System.err.println("Linea descartada :: " + linea);
                }

            }

        } catch (IOException e) {
            System.err.println("Error al leer el fichero :: " + e.getMessage());
        }

        System.out.println("Se han cargado " + peonadas.size() + " registros");

        return peonadas;
    }

}
