package Tema6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de un archivo");
        String nombre = sc.nextLine();

        try {
            File file = new File(nombre);
            if (!file.exists())
                file.createNewFile();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                System.out.println("Introduce una linea");
                String linea = sc.nextLine();
                bw.write(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al crear el archivo, " + e.getMessage());
        }

        sc.close();
    }
}
