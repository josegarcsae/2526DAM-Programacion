package Tema5.equalsHashcode;

public class MainAlumno {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("1234A", "Luis", "Fernandez", "C/Arapiles 23", 23, 1, "DAM");
        Alumno a2 = new Alumno("1234A", "Luis", "Fernandez", "C/Arapiles 23", 23, 1, "DAM");

        System.out.println("a1 == a2 :: " + (a1 == a2)); // Dirección de memoria
        System.out.println("a1.equals(a2) :: " + (a1.equals(a2)));

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

    }
}
