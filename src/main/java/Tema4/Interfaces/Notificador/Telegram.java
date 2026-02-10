package Tema4.Interfaces.Notificador;

public class Telegram implements Notificador {

    private String usuario;

    public Telegram(String usuario) {
        this.usuario = usuario;
    }

    public void enviarMensaje(String mensaje) {

        // Conecta con el servidor de correo

        // Añade el destinatario

        // Envía el mensaje

        System.out.println("Se ha enviado por telegram el " + mensaje);

    }

}
