package Tema5.hash;

import java.util.HashSet;
import java.util.Set;

/*
El objetivo es entender que un Set no permite duplicados.
Tarea: Crea un HashSet<String> llamado invitados.
Acción: Añade los nombres: "Ana", "Luis", "Ana", "Marta", "Luis".
Salida: Muestra el tamaño de la lista (size()) y comprueba que solo hay 3 nombres en total.
 */
public class ej1 {
    public static void main(String[] args) {

        Set<String> invitados = new HashSet<>();
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");
        System.out.println(invitados.size());
        System.out.println(invitados);

    }
}
