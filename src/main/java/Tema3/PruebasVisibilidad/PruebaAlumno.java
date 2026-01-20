package Tema3.PruebasVisibilidad;

public class PruebaAlumno {

    public static void main(String[] args) {

        Alumno a1 = new Alumno();
        a1.nombre = "Alumno1";
        System.out.println(a1.nombre);
        // System.out.println(a1.saldo); // NO puedo porque es PRIVATE

        a1.numeroMatricula = "1";


    }

}
