package Tema4.Interfaces.Notificador;

public class CorreoPostal implements Notificador {

    String direccion;

    public CorreoPostal(String direccion) {this.direccion = direccion;}

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por correo postal " + mensaje);
    }
}
