package Tema3;

public class EjemploAlumno {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("Jose Luis", "Garcia");
        System.out.println(alumno);
        Alumno alumno2 = new Alumno("Esteban", "Rodriguez");
        alumno2.setNumMatricula(17);
        System.out.println(alumno2);

    }

}
