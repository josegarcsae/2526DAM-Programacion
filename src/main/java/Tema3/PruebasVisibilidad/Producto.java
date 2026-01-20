package Tema3.PruebasVisibilidad;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("Entra en el constructor 1");
    }

    public Producto(String nombre) {
        this(nombre, 0.0);
        System.out.println("Entra en el constructor 2");
    }


}
