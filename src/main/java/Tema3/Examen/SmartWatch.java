package Tema3.Examen;

/*
Diseña una clase SmartWatch para monitorizar actividad física:
Miembro Estático: Un atributo totalPasosGlobales que acumule los pasos de todos los relojes creados.
Atributos de Instancia: modelo y pasosDiarios.
Métod caminar(int pasos): Incrementa tanto los pasosDiarios del reloj específico como el contador estático global.
Métod Estático: resetGlobal() que ponga a cero el contador de todos los relojes.
Métod para mostrar información... estándar.

 */
public class SmartWatch {

    static int totalPasosGlobales;

    int pasosDiarios;
    String modelo;

    public SmartWatch(String modelo) {
        this.modelo = modelo;
        this.pasosDiarios = 0;
    }

    public void caminar(int pasos) {
        this.pasosDiarios += pasos;
        totalPasosGlobales += pasos;
    }

    public static void resetGlobal() {
        totalPasosGlobales = 0;
    }

    public String toString() {
        return "El reloj " + modelo + " lleva " + pasosDiarios + " pasos (total " + totalPasosGlobales + ")";
    }

}
