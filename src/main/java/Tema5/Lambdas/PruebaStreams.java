package Tema5.Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaStreams {

    public static void main(String[] args) {

        List<Persona> alumnos = Arrays.asList(
                new Persona("Ana", 18),
                new Persona("Luis", 22),
                new Persona("Guzmán", 25),
                new Persona("Marta", 17),
                new Persona("Diego", 30),
                new Persona("Lucía", 22),
                new Persona("Javier", 29),
                new Persona("Elena", 16)
        );

        List<Persona> personasMasMayores = alumnos.stream()
                .filter(persona -> persona.getEdad() > 25)
                .sorted(Comparator.comparing(Persona::getEdad).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(personasMasMayores);

        List<String> empiezaPorA = alumnos.stream()
                .map(persona -> persona.getNombre().toUpperCase())
                .filter(nombreMayuscula -> nombreMayuscula.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(empiezaPorA);

        int edadMayor = alumnos.stream()
                .map(persona -> persona.getEdad())
                .max((o1, o2) -> o1.compareTo(o2))
                .get();
        System.out.println(edadMayor);

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
