package Tema5.analizadorCiberseguridad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(Arrays.asList("Luis", "Pedro", "Marta", "Fernando"));
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            String nombre = it.next();
            if ("Pedro".equals(nombre)) {
                it.remove();
            } else {
                System.out.println(nombre);
            }
        }
        System.out.println("Eliminamos a pedro :: " + nombres);

        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            if ("Luis".equals(nombre)) {
                nombres.remove(i);
            }
        }
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println(nombres);


    }
}
