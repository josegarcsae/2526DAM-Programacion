package Tema6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de un archivo");
        String nombre = sc.nextLine();
        sc.close();

        try {
            File file = new File(nombre);
            if (!file.exists())
                file.createNewFile();
            else
                System.out.println(file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al crear el archivo, " + e.getMessage());
        }

    }
}
