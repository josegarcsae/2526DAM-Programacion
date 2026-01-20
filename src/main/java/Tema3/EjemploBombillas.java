package Tema3;

public class EjemploBombillas {

    public static void main(String[] args) {

        Bombilla bombillaPasillo = new Bombilla();
        System.out.println(bombillaPasillo.estado());

        bombillaPasillo.encender();

        System.out.println(bombillaPasillo.estado());

    }

}
