package Tema2.Ejercicios3;

/*
Implementa un método que reciba un nombre y edad y muestre un mensaje personalizado.
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        mensajeAlUsuario("Jose Luis", 17);
    }

    static void mensajeAlUsuario(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
    }

}
