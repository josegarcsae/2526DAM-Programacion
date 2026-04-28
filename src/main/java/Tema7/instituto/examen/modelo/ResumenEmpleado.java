package Tema7.instituto.examen.modelo;

public class ResumenEmpleado {
    private String nombre;
    private int jornadas;
    private int totalHoras;

    public ResumenEmpleado(String nombre, int jornadas, int totalHoras) {
        this.nombre = nombre;
        this.jornadas = jornadas;
        this.totalHoras = totalHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJornadas() {
        return jornadas;
    }

    public void setJornadas(int jornadas) {
        this.jornadas = jornadas;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public String toString() {
        return "ResumenEmpleado{" +
                "nombre='" + nombre + '\'' +
                ", jornadas=" + jornadas +
                ", totalHoras=" + totalHoras +
                '}';
    }
}
