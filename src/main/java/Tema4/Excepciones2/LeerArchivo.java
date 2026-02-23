package Tema4.Excepciones2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void leer() {
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hemos encontrado el fichero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        leer();
    }

}
