package Tema5.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PruebaOrdenacion {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pablo", 20);
        Persona p2 = new Persona("Luis", 22);
        List<Persona> personas = new ArrayList<>(List.of(p1, p2));
        Collections.sort(personas, (o1, o2) -> {
            return o1.getNombre().compareTo(o2.getNombre());
        });

        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        System.out.println(personas);
    }


    private static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

}
