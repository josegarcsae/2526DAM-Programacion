package Tema3.AvilaExpress;

public class NaveEspacial {
    //Atributos
    private final String nombre;
    private final double capacidadCarga;
    private int combustible;
    private boolean enMision;

    //Constructor
    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.combustible = 100;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this(nombre, 6.0);
    }

    //Métodos
    public void viajar(int distancia) {
        int gasto = distancia * 2;
        if (combustible > gasto) {
            combustible -= gasto;
            enMision = true;
            System.out.println(this.nombre + ": Inicia misión");
        } else {
            System.out.println(this.nombre + ": Combustible insuficiente para la misión");
        }
    }

    public void repostar() {
        combustible = 100;
        enMision = false;
    }

    public void mostrarEstado() {
        System.out.println("Datos de la aeronave: " +
                "Nombre: " + this.nombre + "\n" +
                "Capacidad: " + this.capacidadCarga + "\n" +
                "Combustible disponible: " + this.combustible + "\n" +
                "Estado de misión: " + this.estadoMision()
        );
    }

    public String estadoMision() {
        if (enMision) {
            return "Actualmente en misión";
        } else {
            return "Disponible para misión";
        }
    }

    public int getCombustible() {
        return this.combustible;
    }

    public String getNombre() {
        return this.nombre;
    }


}

