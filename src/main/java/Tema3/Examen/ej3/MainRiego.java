package Tema3.Examen.ej3;

public class MainRiego {
    public static void main(String[] args) {

        ProgramadorRiego programador = new ProgramadorRiego("D13");
        programador.addSensor(new Sensor(10, 30));
        programador.addSensor(new Sensor(20, 20));
        programador.addSensor(new Sensor(30, 10));
        programador.addSensor(new Sensor(40, 0));

        programador.verificarEstado();
    }
}
