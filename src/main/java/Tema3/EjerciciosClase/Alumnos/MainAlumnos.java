package Tema3.EjerciciosClase.Alumnos;

import java.util.Arrays;
import java.util.Scanner;

public class MainAlumnos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Alumno[] clase = new Alumno[3];
        for (int i = 0; i < clase.length; i++) {
            System.out.println("Introduce un nombre");
            String n = sc.next();
            System.out.println("Introduce la nota");
            double nota = sc.nextDouble();
            clase[i] = new Alumno(n, nota);

            if (nota < 5) {
                System.out.println("¿Le quieres aprobar? s/n");
                String s1 = sc.next();
                if ("s".equals(s1)) {
                    clase[i].aprobar();
                } else {
                    System.out.println("Pues se queda suspenso");
                }
            }
        }
        System.out.println("Imprimimos todo el array :::::::");
        System.out.println(Arrays.toString(clase));

        sc.close();


    }
}
