package Tema4.Interfaces.Notificador;

public class PruebaNotificaciones {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Segismundo", "segis@educa.jcyl", "435336", "@segis", 55);

        usuario.getCanalPreferido().enviarMensaje("hola");

    }
}
