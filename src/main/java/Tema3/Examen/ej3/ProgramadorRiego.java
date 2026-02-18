package Tema3.Examen.ej3;

public class ProgramadorRiego {

    String ubicacion;
    Sensor[] sensores;

    public ProgramadorRiego(String ubicacion) {
        this.ubicacion = ubicacion;
        this.sensores = new Sensor[3];
    }

    public void verificarEstado() {
        for (Sensor sensor : sensores) {
            if (sensor.getHumedad() < 20) {
                System.out.println("Iniciando riego en " + ubicacion);
            }
        }
    }

    public boolean addSensor(Sensor s) {
        for (int i = 0; i < this.sensores.length; i++) {
            if (this.sensores[i] == null) {
                this.sensores[i] = s;
                return true;
            }
        }
        System.out.println("El array ya está lleno, no caben más sensores");
        return false;
    }

}
