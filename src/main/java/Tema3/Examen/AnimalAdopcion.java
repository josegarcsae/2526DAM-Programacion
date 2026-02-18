package Tema3.Examen;

/*
 *
Crea una clase AnimalAdopcion con:
Atributos privados: nombre, especie, edad y estaAdoptado (boolean).
Constructor: Debe recibir nombre y especie. Por defecto, un animal recién llegado tiene 0 años y estaAdoptado es false.
Comportamiento:
    cumplirAnio(): Incrementa la edad en 1.
    adoptar(): Cambia el estado a true y muestra un mensaje de felicitación. Si ya estaba adoptado, muestra un error.
Validación: la función setEdad(int edad) solo debe permitir valores positivos; si se intenta poner un negativo, el valor no debe cambiar.
 *
 */

public class AnimalAdopcion {

    private String nombre;
    private String especie;
    private int edad;
    private boolean estaAdoptado;

    public AnimalAdopcion(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = 0;
        this.estaAdoptado = false;
    }

    public void cumplirAnio() {
        edad++;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0)
            this.edad = edad;
    }

    public void adoptar() {
        if (estaAdoptado) {
            System.out.println("Ya está adoptado");
        } else {
            estaAdoptado = true;
            System.out.println("Enhorabuena! Has adoptado a " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }

}
