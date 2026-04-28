package Tema7.instituto;

import java.sql.SQLException;

public class GestorInstituto {


    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación

    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N

    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        // Aquí iremos probando los métodos paso a paso

        InstitutoDBDAO logica = new InstitutoDBDAO();

        logica.conectar();
        System.out.println("Estamos conectados a la base de datos");


//        try {
//            conexion.setAutoCommit(false);
//            registrarAlumno("Rafa2", "rafa2@educa.jcyl.es");
//            conexion.commit();
//            registrarAlumno("Laura2", "laura2@educa.jcyl.es");
//            registrarAlumno("Blanca2", "blanca2@educa.jcyl.es");
//            System.out.println("Alumnos insertados");
//            conexion.commit();
//        } catch (SQLException e) {
//            System.err.println("Error al insertar los alumnos :: " + e.getMessage());
//            try {
//                conexion.rollback();
//            } catch (SQLException ex) {
//                System.err.println("Error al realizar el rollback :: " + ex.getMessage());
//            }
//        }

        logica.mostrarAlumnos();
        logica.mostrarAsignaturas();

        try {
            logica.matricularAlumno(1, 3);
        } catch (SQLException e) {
            System.err.println("Error al matricular al alumno");
        }
        logica.mostrarAsignaturasDeAlumno(7);
        logica.mostrarAsignaturasDeAlumno(1);

        logica.desconectar();

    }


}
