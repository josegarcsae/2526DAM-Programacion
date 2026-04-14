package Tema5.ordenacion;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String id;
    private String modelo;
    private double precio;

    public Producto(String id, String modelo, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getId() { return id; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return String.format("[%s] %-15s | %.2f€", id, modelo, precio);
    }

    // --- TAREA DEL ALUMNO 1 ---
    // Implementar equals y hashCode basándose en el 'id'.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto producto)) return false;
        return Double.compare(precio, producto.precio) == 0 && Objects.equals(id, producto.id) && Objects.equals(modelo, producto.modelo);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // --- TAREA DEL ALUMNO 2 ---
    // Implementar compareTo para que la ordenación por defecto sea por ID.
    @Override
    public int compareTo(Producto otro) {
        return this.id.compareTo(otro.getId()); // Cambiar esto
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
