package Tema5.videojuegos;

import java.util.UUID;

public class Videojuego {
    UUID codigo;
    double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public Videojuego(double precio) {
        this.precio = precio;
        this.codigo = UUID.randomUUID();
    }
}
