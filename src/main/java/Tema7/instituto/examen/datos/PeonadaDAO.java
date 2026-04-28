package Tema7.instituto.examen.datos;

import Tema7.instituto.examen.modelo.Peonada;
import Tema7.instituto.examen.modelo.ResumenEmpleado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeonadaDAO {

    public static String URL = "jdbc:mysql://localhost:3306/ayuntamiento_db";
    public static String USER = "root";
    public static String PASS = "";

    public static void guardaEnBD(List<Peonada> peonadas) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(URL, USER, PASS);

            try {
                conexion.setAutoCommit(false);

                Statement st = conexion.createStatement();
                int filasEliminadas = st.executeUpdate("DELETE FROM peonadas");
                System.out.println("Eliminadas " + filasEliminadas + " filas");

                PreparedStatement stmt = conexion.prepareStatement("INSERT INTO peonadas(fecha, nombre_empleado, parque, horas) VALUES (?, ?, ?, ?)");
                for (Peonada peonada : peonadas) {
                    stmt.setObject(1, peonada.getFecha());
                    stmt.setString(2, peonada.getNombreEmpleado());
                    stmt.setString(3, peonada.getParque());
                    stmt.setInt(4, peonada.getHoras());
                    int filasInsertadas = stmt.executeUpdate();
                    System.out.println("Insertada " + filasInsertadas + " fila");
                }
                conexion.commit();
            } catch (SQLException e) {
                conexion.rollback();
                System.err.println("Error al insertar el registro :: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error al leer el driver :: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de BD");
        }

    }


    public static List<ResumenEmpleado> consultaInformacion() {

        List<ResumenEmpleado> resumenesEmpleados = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexion = DriverManager.getConnection(URL, USER, PASS);

            String sql = """
                    SELECT nombre_empleado,
                    COUNT(*) AS jornadas,
                    SUM(horas) AS total_horas
                    FROM Peonadas
                    GROUP BY nombre_empleado
                    ORDER BY total_horas DESC
                    """;
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nombre = rs.getString(1);
                int jornadas = rs.getInt(2);
                int total_horas = rs.getInt(3);
                resumenesEmpleados.add(new ResumenEmpleado(nombre, jornadas, total_horas));
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error al leer el driver :: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de BD");
        }

        return resumenesEmpleados;

    }

}
