package Tema4.Interfaces.Notificador;

public class SMS implements Notificador {

    private String movil;

    public SMS(String movil) {
        this.movil = movil;
    }

    public void enviarMensaje(String mensaje) {

        // Conecta con el servidor de correo

        // Añade el destinatario

        // Envía el mensaje

        System.out.println("Se ha enviado el SMS " + mensaje);

    }

}
