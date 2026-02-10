package Tema4.Interfaces.Notificador;

public class Usuario {

    String nombre;
    String direccion;

    // Canales de comunicación
    String email;
    String tlf;
    String telegram;
    int canal;

    public Usuario(String nombre, String email, String tlf, String telegram, int canalPorDefecto) {
        this.nombre = nombre;
        this.email = email;
        this.tlf = tlf;
        this.telegram = telegram;
        this.canal = canalPorDefecto;
    }

    public Notificador getCanalPreferido() {
        // Lógica, donde el usuario ya habría elegido el canal preferido

        switch (canal) {
            case 1:
                return new Email(this.email);
            case 2:
                return new SMS(this.tlf);
            case 3:
                return new Telegram(this.telegram);
            case 55:
                return new CorreoPostal(this.direccion);
            default:
                return new Email(this.email);
        }

    }

}
