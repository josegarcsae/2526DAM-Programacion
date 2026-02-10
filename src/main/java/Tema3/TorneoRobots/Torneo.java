package Tema3.TorneoRobots;

public class Torneo {
    public static void main(String[] args) {

        Robot r1 = new Robot("Mazinger", "Roomba X200");
        Robot r2 = new Robot("Optimus", "Motorola 3000");

        r1.mostrarEstadisticas();
        r2.mostrarEstadisticas();

        while (r1.estaVivo() && r2.estaVivo()) {
            System.out.println("------------------------");
            r1.atacar(r2);
            if (r2.estaVivo()) {
                r2.atacar(r1);
            }
            System.out.printf("Mazinger: %.2f puntos de vida\n", r1.getVida());
            System.out.printf("Optimus: %.2f puntos de vida\n", r2.getVida());
            System.out.println("------------------------");
        }

        if (r1.estaVivo()) {
            System.out.println("El ganador es Mazinger");
        } else {
            System.out.println("El ganador es Optimus");
        }

    }
}
