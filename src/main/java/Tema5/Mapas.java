package Tema5;

import Tema3.Alumno;

import java.util.*;

public class Mapas {
    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Rafa", 9);
        notas.put("Leticia", 10);
        System.out.println(notas);
        notas.put("Rafa", 5);
        System.out.println(notas);
        notas.put("Pedro", 7);
        notas.put("Lucia", 7);
        System.out.println(notas);

        Set<String> claves = notas.keySet();
        Collection<Integer> valores = notas.values();
        System.out.println(claves);
        System.out.println(valores);

        Map<Integer, Alumno> alumnos = new HashMap<>();
        alumnos.put(1, new Alumno("Juan", "Garcia", 1));
        alumnos.put(2, new Alumno("Marta", "Ruiz", 2));
        System.out.println(alumnos);

        Map<Integer, List<Integer>> notasAlumnos = new HashMap<>();
        notasAlumnos.put(1, new ArrayList<>());
        notasAlumnos.put(2, new ArrayList<>());
        System.out.println(notasAlumnos);

        if (notasAlumnos.containsKey(1))
            notasAlumnos.get(1).add(5);
        System.out.println(notasAlumnos);


        Alumno juan = new Alumno("Juan", "Garcia", 1);
        Alumno marta = new Alumno("Marta", "Ruiz", 2);
        Map<Alumno, List<Integer>> notasConAlumnos = new HashMap<>();
        notasConAlumnos.put(juan, new ArrayList<>());
        notasConAlumnos.put(marta, new ArrayList<>());
        if (notasConAlumnos.containsKey(juan))
            notasConAlumnos.get(juan).add(5);
        System.out.println(notasConAlumnos);

    }
}
