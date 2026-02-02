package Tema4.Herencia1;

public class PruebaVideojuegos {

    public static void main(String[] args) {

        Videojuego v1 = new Videojuego("Mario", 19.90);
        System.out.println(v1);

        VideojuegoXbox v2 = new VideojuegoXbox("Halo", 39.90, true);
        System.out.println(v2);

    }

}
