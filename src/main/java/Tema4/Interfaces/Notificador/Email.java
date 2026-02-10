package Tema4.Interfaces.Notificador;

public class Email implements Notificador {

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public void enviarMensaje(String mensaje) {

        // Conecta con el servidor de correo

        // Añade el destinatario

        // Envía el mensaje

        System.out.println("Se ha enviado el correo " + mensaje);

    }

}
