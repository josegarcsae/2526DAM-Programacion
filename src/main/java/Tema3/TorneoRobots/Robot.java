package Tema3.TorneoRobots;

import java.util.Random;

public class Robot {

    // Atributos
    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;

    // Constructor
    public Robot(String nombre, String modelo) {
        Random r = new Random();
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100;
        this.potenciaAtaque = r.nextDouble(10, 20);
        this.blindaje = r.nextDouble(0, 10);
    }

    // Métodos
    public void mostrarEstadisticas() {
        System.out.printf("El robot %s modelo %s tiene %.2f de vida, hace %.2f de daño y tiene un blindaje de %.2f\n", nombre, modelo, vida, potenciaAtaque, blindaje);
    }

    private void recibirDano(double cantidad) {
        double real = cantidad - blindaje;
        if (real > 0) {
            if (vida - real >= 0) {
                vida -= real;
            } else {
                vida = 0;
            }
        }
    }

    public void atacar(Robot enemigo) {
        if (vida <= 0) {
            System.out.println("El robot " + nombre + " está destruido y no puede atacar");
        } else if (enemigo.vida <= 0) {
            System.out.println("El enemigo ya está vencido");
        } else {
            enemigo.recibirDano(potenciaAtaque);
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public double getVida() {
        return vida;
    }
}
