package Tema6;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Ejercicio2_1 implements Serializable {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduce el nombre de un archivo");
            String nombre = sc.nextLine();

            File file = new File(nombre);
            if (file.exists()) {
                try (Scanner input = new Scanner(file)) {
                    while (input.hasNextLine()) {
                        String linea = input.nextLine();
                        System.out.println(linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo, " + e.getMessage());
        }

    }

}
