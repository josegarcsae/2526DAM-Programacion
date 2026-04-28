package Tema7.instituto;

import java.sql.*;

public class InstitutoDBDAO {

    private Connection conexion;

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(Constants.URL, Constants.USUARIO, Constants.PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("No se ha encontrado el driver de MySQL");
        } catch (SQLException e) {
            System.err.println("Error de SQL al conectar :: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error de SQL al desconectar :: " + e.getMessage());
        }
    }

    public void mostrarAlumnos() {
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al mostrar los alumnos");
        }
    }

    public void mostrarAsignaturas() {
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM asignaturas");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al mostrar los alumnos");
        }
    }

    public void registrarAlumno(String nombre, String email) throws SQLException {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO Alumnos(nombre,email) VALUES (?,?)");
            statement.setString(1, nombre);
            statement.setString(2, email);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar un alumno :: " + e.getMessage());
            throw e;
        }
    }

    public void matricularAlumno(int idAlumno, int idAsignatura) throws SQLException {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO matriculas(id_alumno,id_asignatura) VALUES (?,?)");
            statement.setInt(1, idAlumno);
            statement.setInt(2, idAsignatura);
            int filas = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar un alumno :: " + e.getMessage());
            throw e;
        }
    }

    public void mostrarAsignaturasDeAlumno(int idAlumno) {
        try {
            PreparedStatement stmt = conexion.prepareStatement("""
                    select alumnos.nombre as alumno, asignaturas.nombre as asignatura 
                    from matriculas 
                        inner join alumnos on alumnos.id = matriculas.id_alumno 
                        inner join asignaturas on asignaturas.id = matriculas.id_asignatura 
                    where id_alumno = ?
                    """);
            stmt.setInt(1, idAlumno);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("alumno") + " - " + rs.getString("asignatura"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al mostrar los alumnos");
        }
    }

}
