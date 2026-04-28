package Tema7.instituto.examen.datos;

import Tema7.instituto.examen.modelo.ResumenEmpleado;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EscritorInforme {


    public static void imprimeInformacion(List<ResumenEmpleado> resumenesEmpleados) {

        Path fichero = Paths.get("informe.txt");

        List<String> lineas = new ArrayList<>();
        lineas.add("==========================================");
        lineas.add("INFORME DE PEONADAS - AYUNTAMIENTO DE TOLEDO");
        lineas.add("Fecha de generación: " + LocalDate.now());
        lineas.add("==========================================");
        lineas.add("Empleado\tJornadas\tTotal Horas");
        lineas.add("------------------------------------------------");
        for (ResumenEmpleado resumenEmpleado : resumenesEmpleados) {
            lineas.add(resumenEmpleado.getNombre() + "\t" + resumenEmpleado.getJornadas() + "\t" + resumenEmpleado.getTotalHoras());
        }
        lineas.add("------------------------------------------------");
        lineas.add("Total empleados; " + resumenesEmpleados.size());
        lineas.add("Tota horas globales: " + resumenesEmpleados.stream().mapToInt(ResumenEmpleado::getTotalHoras).sum());
        lineas.add("==========================================");

        try {
            Files.write(fichero, lineas);
        } catch (IOException e) {
            System.err.println("Error al escribir el fichero :: " + e.getMessage());
        }

    }

}
