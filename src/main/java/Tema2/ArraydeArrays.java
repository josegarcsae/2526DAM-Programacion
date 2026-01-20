package Tema2;

import java.util.Arrays;

public class ArraydeArrays {
    public static void main(String[] args) {

        String[] datosF = {"Felipe", "Garcia", "Avda. La Palmera 1"};
        String[] datosL = {"Laura", "Rodriguez", "Calle del Chopo 43"};
        String[] datosA = {"Abraham", "Moreno", "El grande S/N"};

        System.out.println(Arrays.toString(datosF));
        System.out.println(Arrays.toString(datosL));
        System.out.println(Arrays.toString(datosA));

        String[][] alumnos = {datosF, datosL, datosA};
//        alumnos = new String[3][3];
        System.out.println("Vamos a imprimir el array de arrays");
        for (String[] alumno : alumnos) {
            System.out.println(Arrays.toString(alumno));
        }

    }
}
