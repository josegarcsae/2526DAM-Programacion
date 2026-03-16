package Tema5.orden;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PruebaOrden {
    public static void main(String[] args) {

        List<Alumno> lista = new ArrayList<>();
        lista.add(new Alumno("Jose", "Perez", LocalDate.of(2000, 1, 1), 176));
        lista.add(new Alumno("Lucia", "Rodriguez", LocalDate.of(2002, 3, 4), 165));
        lista.add(new Alumno("Fernando", "Garcia", LocalDate.of(2001, 3, 1), 176));

        Collections.sort(lista);
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);

        Collections.sort(lista, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.apellidos.compareTo(o2.apellidos);
            }
        });
        System.out.println("lista por apellidos: " + lista);
        lista.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        });
        System.out.println("lista por nombre: " + lista);


    }
}
