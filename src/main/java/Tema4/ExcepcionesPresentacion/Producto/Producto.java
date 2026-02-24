package Tema4.ExcepcionesPresentacion.Producto;

public class Producto {

    private double precio;

    public void establecerPrecio(double nuevoPrecio) throws ValorInvalidoException {
        if (nuevoPrecio < 0) {
            throw new ValorInvalidoException("El precio no puede ser negativo");
        }
        precio = nuevoPrecio;
    }

}
