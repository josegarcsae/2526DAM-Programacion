package Tema6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        Path ruta = Paths.get("alumnos.txt");
        try {
            Files.write(ruta, List.of("Gabriel"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo, " + e.getMessage());
        }

    }
}
