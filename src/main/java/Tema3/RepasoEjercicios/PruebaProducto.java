package Tema3.RepasoEjercicios;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto libro = new Producto("El nombre de la rosa", 21.98, 3);
        libro.mostrarInfo();
        libro.vender(1);
        libro.mostrarInfo();
        libro.reponer(-1);
        libro.mostrarInfo();
        libro.vender(4);
        libro.mostrarInfo();
        libro.reponer(7);
        libro.mostrarInfo();
        libro.vender(-5);
        libro.mostrarInfo();
    }
}
