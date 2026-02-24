package Tema4.ExcepcionesPresentacion.Producto;

public class PruebaProducto {
    public static void main(String[] args) {

        Producto p1 = new Producto();
        try {
            p1.establecerPrecio(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hola después del precio");

    }
}
