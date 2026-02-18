package Tema3.Examen.ej3;

// POJO
// Plain Old Java Object

public class Sensor {

    private double humedad;
    private double temperatura;

    public Sensor(double humedad, double temperatura) {
        this.humedad = humedad;
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
