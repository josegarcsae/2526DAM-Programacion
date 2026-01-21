package Tema3.Ejercicios2;

/*
Ahora, crea una clase principal que haga lo siguiente:
    Pide por teclado el nombre, la edad, sexo, peso y altura.
    Crea 3 objetos de la clase anterior:
    El primer objeto utilizará todas las variables.
    El segundo objeto utilizará todas las variables menos el peso y la altura.
    El último utilizará el constructor que solo dispone del nombre.
    Para cada persona se deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
    Por último, se debe mostrar la información de cada objeto.
 */

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a crear una persona");
        System.out.println("Nombre");
        String nombre = sc.next();
        System.out.println("Edad");
        int edad = sc.nextInt();
        System.out.println("Sexo");
        String sexo = sc.next();
        System.out.println("Altura");
        int altura = sc.nextInt();
        System.out.println("Peso");
        int peso = sc.nextInt();
        Persona p1 = new Persona(nombre, edad, sexo.charAt(0), altura, peso);


        System.out.println("Vamos a crear otra persona");
        System.out.println("Nombre");
        nombre = sc.next();
        System.out.println("Edad");
        edad = sc.nextInt();
        System.out.println("Sexo");
        sexo = sc.next();
        Persona p2 = new Persona(nombre, edad, sexo.charAt(0));


        System.out.println("Vamos a crear la ultima persona");
        System.out.println("Nombre");
        nombre = sc.next();
        Persona p3 = new Persona(nombre);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        sc.close();

    }
}
